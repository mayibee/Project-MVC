package org.ab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class ManagerController {
    @GetMapping("/assign-task")
    public String assignTask(){
        return "manager/assign-task";
    }

    @GetMapping("/update-project")
    public String updateProject(){
        return "manager/update-project";
    }
}
