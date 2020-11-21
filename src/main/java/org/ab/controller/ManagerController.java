package org.ab.controller;

import org.ab.datagenerator.DataGenerator;
import org.ab.model.Task;
import org.ab.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @GetMapping("/create-task")
    public String createTask(Model model){
        model.addAttribute("task", new Task());
        model.addAttribute("projectList", DataGenerator.getProjectList());
        model.addAttribute("assigneeList", DataGenerator.getAssigneeList());
        return "manager/create-task";
    }
    @PostMapping("/create-task")
    public String taskList(@ModelAttribute("task") Task task, Model model){
        model.addAttribute("taskList", Arrays.asList(task));
        return "manager/create-task";
    }
    @GetMapping("/update-project")
    public String updateProject(){

        return "manager/update-project";
    }
}
