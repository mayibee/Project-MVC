package org.ab.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Task {
    private String taskSummary;
    private String taskDetails;
    private String project;
    private String assignee;
    private String assignedDate;
    private String taskStatus;
}