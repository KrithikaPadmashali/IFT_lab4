package com.example.lab4_1.controller;

import com.example.lab4_1.service.UserService;
import com.example.lab4_1.entity.User;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // Home page
    @GetMapping("/")
    public String home() {
        return "home";
    }

    // Display paginated user details
    @GetMapping("/users")
    public String getUsers(
            @RequestParam(defaultValue = "1") int page,
            Model model) {
        int pageSize = 8; // Number of users per page
        Page<User> usersPage = userService.getPaginatedUsers(page - 1, pageSize);

        model.addAttribute("users", usersPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", usersPage.getTotalPages());
        model.addAttribute("pageTitle", "User List");
        return "userList"; // Thymeleaf template for paginated user list
    }

    // Show the form to add a new user
    @GetMapping("/new")
    public String showCreateForm(Model model) {
        model.addAttribute("pageTitle", "Add New User");
        model.addAttribute("user", new User()); // Create empty User object for form binding
        return "userForm"; // Thymeleaf template for user creation form
    }

    // Save new user details
    @PostMapping("/save")
    public String saveUser(@Valid @ModelAttribute("user") User user, 
                           BindingResult result, Model model,
                           RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            model.addAttribute("pageTitle", "Add New User");
            return "userForm"; // Return to form if validation errors exist
        }

        try {
            userService.saveUser(user); // Save the user using the service
            redirectAttributes.addFlashAttribute("message", "User saved successfully!"); // Success message
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute("error", "Error saving user: " + e.getMessage()); // Error message
            return "redirect:/new"; // Redirect back to form if save fails
        }

        return "redirect:/users"; // Redirect to user list after saving
    }

    // Display all user details without pagination
    @GetMapping("/userform")
    public String listUsers(Model model) {
        model.addAttribute("pageTitle", "User List");
        model.addAttribute("users", userService.getAllUsers());
        return "userList"; // Thymeleaf template for full user list
    }
}

