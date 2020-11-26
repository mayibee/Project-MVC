package org.ab.controller;

import org.ab.dto.UserDTO;
import org.ab.model.User;
import org.ab.service.RoleService;
import org.ab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    RoleService roleService;

    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String userCreate(Model model){
        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles", roleService.findAll());
        model.addAttribute("users", userService.findAll());
        return "/user/create";
    }

    @PostMapping("/create")
    public String insertUser(UserDTO user, Model model){
        userService.save(user);
        return "redirect:/user/create";
    }

    @GetMapping("/update/{userName}")
    public String editUser(@PathVariable("userName") String username, Model model) {
        model.addAttribute("user", userService.findById(username));
        model.addAttribute("users", userService.findAll());
        model.addAttribute("roles", roleService.findAll());
        return "/user/update";
    }

    @PostMapping("/update/{userName}")
    public String updateUser(@PathVariable("userName") String username, UserDTO user, Model model){
        userService.update(user);
        return "redirect:/user/create";
    }

    @GetMapping("/delete/{userName}")
    public String deleteUser(@PathVariable("userName") String username) {
        userService.deleteById(username);
        return "redirect:/user/create";
    }
}
