package org.ab.bootstrap;

import org.ab.dto.ProjectDTO;
import org.ab.dto.RoleDTO;
import org.ab.dto.UserDTO;
import org.ab.enums.Gender;
import org.ab.enums.Status;
import org.ab.service.ProjectService;
import org.ab.service.RoleService;
import org.ab.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGeneration implements CommandLineRunner {

    RoleService roleService;
    UserService userService;
    ProjectService projectService;

    public DataGeneration(RoleService roleService, UserService userService, ProjectService projectService) {
        this.roleService = roleService;
        this.userService = userService;
        this.projectService = projectService;
    }

    @Override
    public void run(String... args) throws Exception {
        RoleDTO adminRole = new RoleDTO(1L, "Administrator");
        RoleDTO managerRole = new RoleDTO(2L, "Manager");
        RoleDTO employeeRole = new RoleDTO(3L, "Employee");
        RoleDTO poRole = new RoleDTO(4L, "Product Owner");
        RoleDTO smRole = new RoleDTO(5L, "Scrum Master");
        RoleDTO devRole = new RoleDTO(6L, "Developer");
        RoleDTO sdetRole = new RoleDTO(7L, "SDET");

        //Tight coupled
//        RoleServiceImpl r = new RoleServiceImpl();
//        r.save(adminRole);

        //loose coupled
        roleService.save(adminRole);
        roleService.save(managerRole);
        roleService.save(employeeRole);
        roleService.save(poRole);
        roleService.save(smRole);
        roleService.save(devRole);
        roleService.save(sdetRole);

        UserDTO user1 = new UserDTO("John", "Kesy",
                "admin@me.com", "abc", true, "7459684532", managerRole, Gender.MALE);
        UserDTO user5 = new UserDTO("John", "Kesy",
                "admin2@me.com", "abc", true, "7459684532", adminRole, Gender.MALE);
        UserDTO user2 = new UserDTO("Delisa",
                "Norre", "T001@me.com", "123", true, "8567412358", managerRole, Gender.FEMALE);
        UserDTO user3 = new UserDTO("Craig", "Jark",
                "P001@me.com", "123", true, "7777775566", employeeRole, Gender.MALE);
        UserDTO user4 = new UserDTO("Shaun",
                "Hayns", "S001@me.com", "123", true, "3256987412", employeeRole, Gender.MALE);

        userService.save(user1);
        userService.save(user2);
        userService.save(user3);
        userService.save(user4);
        userService.save(user5);

        ProjectDTO project1 = new ProjectDTO("Spring MVC", "IP001",user1, LocalDate.now(), LocalDate.now().plusMonths(2), "MVC Project", Status.OPEN);
        ProjectDTO project2 = new ProjectDTO("Spring ORM", "IP002",user1, LocalDate.now().minusDays(15), LocalDate.now().plusMonths(1), "ORM Project", Status.IN_PROGRESS);
        ProjectDTO project3 = new ProjectDTO("Spring DB", "IP003",user3, LocalDate.now().minusDays(8), LocalDate.now().plusMonths(3), "DB Project", Status.SIT_TEST);
        ProjectDTO project4 = new ProjectDTO("Spring UI", "IP004",user3, LocalDate.now().minusMonths(2), LocalDate.now(), "DB Project", Status.COMPLETED);

        projectService.save(project1);
        projectService.save(project2);
        projectService.save(project3);
        projectService.save(project4);
    }
}
