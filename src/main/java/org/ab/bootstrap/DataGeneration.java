package org.ab.bootstrap;

import org.ab.dto.RoleDTO;
import org.ab.dto.UserDTO;
import org.ab.enums.Gender;
import org.ab.service.RoleService;
import org.ab.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGeneration implements CommandLineRunner {

    RoleService roleService;
    UserService userService;

    public DataGeneration(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
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
                "admin@me.com", "abc", true, "7459684532", adminRole, Gender.MALE);
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
    }
}
