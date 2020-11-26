package org.ab.controller;

import org.ab.dto.ProjectDTO;
import org.ab.dto.UserDTO;
import org.ab.enums.Status;
import org.ab.service.ProjectService;
import org.ab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    ProjectService projectService;

    @Autowired
    UserService userService;

    @GetMapping("/create")
    public String projectCreate(Model model) {
        model.addAttribute("project", new ProjectDTO());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("managers", userService.findAll());
        return "/project/create";
    }

    @PostMapping("/create")
    public String insertProject(ProjectDTO project) {
        projectService.save(project);
        project.setStatus(Status.OPEN);
        return "redirect:/project/create";
    }

    @GetMapping("/delete/{projectCode}")
    public String deleteProject(@PathVariable("projectCode") String projectCode) {
        projectService.deleteById(projectCode);
        return "redirect:/project/create";
    }

    @GetMapping("/update/{projectCode}")
    public String editProject(@PathVariable("projectCode") String projectCode, Model model) {
        model.addAttribute("project", projectService.findById(projectCode));
        model.addAttribute("managers", userService.findAll());
        model.addAttribute("projects", projectService.findAll());
        model.addAttribute("statusList", Status.values());
        return "/project/update";
    }

    @PostMapping("/update/{projectCode}")
    public String updateProject(@PathVariable("projectCode") String projectCode, ProjectDTO project, Model model){
        projectService.update(project);
        return "redirect:/project/create";
    }
}
