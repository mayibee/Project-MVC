package org.ab.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Project {
    private String projectName;
    private String projectCode;
    private String assignedManager;
    private String status;
    private String startDate;
    private String endDate;
    private String details;
}
