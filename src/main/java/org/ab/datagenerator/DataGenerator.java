package org.ab.datagenerator;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {
    public static List<String> getRoleList() {
        List<String> roleList = Arrays.asList(
            "Administrator",
            "Manager",
            "Employee",
            "Product Owner",
            "Scrum Master",
            "Developer",
            "SDET"
        );
        return roleList;
    }
    public static List<String> getProjectStatus() {
        List<String> statusList = Arrays.asList(
            "Not Started",
            "In Progress",
            "Dev In Progress",
            "SIT In Progress",
            "UAT In Progress",
            "Completed"
        );
        return statusList;
    }
    public static List<String> getManagerList() {
        List<String> managerList = Arrays.asList(
                "Not Started",
                "In Progress",
                "Dev In Progress",
                "SIT In Progress",
                "UAT In Progress",
                "Completed"
        );
        return managerList;
    }
}
