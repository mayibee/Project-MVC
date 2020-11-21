package org.ab.controller;

import org.ab.datagenerator.DataGenerator;
import org.ab.model.Project;
import org.ab.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/create-user")
    public String createUser(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("roleList", DataGenerator.getRoleList());
        return "admin/create-user";
    }
    @PostMapping("/create-user")
    public String userList(@ModelAttribute("user") User user, Model model){
        model.addAttribute("userList", Arrays.asList(user));
        return "admin/create-user";
    }
    @GetMapping("/create-project")
    public String createProject(Model model){
        model.addAttribute("project", new Project());
        model.addAttribute("managerList", DataGenerator.getManagerList());
        model.addAttribute("statusList", DataGenerator.getProjectStatus());
        return "admin/create-project";
    }
    @PostMapping("/create-project")
    public String projectList(@ModelAttribute("project") Project project, Model model){
        model.addAttribute("projectList", Arrays.asList(project));
        return "admin/create-project";
    }
}
