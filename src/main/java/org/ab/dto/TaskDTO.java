package org.ab.dto;

import lombok.*;
import org.ab.enums.Status;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TaskDTO {

    private Long id;
    private ProjectDTO project;
    private UserDTO assignee;
    private String taskSummary;
    private String taskDetails;
    private Status taskStatus;
    private LocalDate assignedDate;

    public TaskDTO(ProjectDTO project, UserDTO assignee, String taskSummary, String taskDetails, Status taskStatus, LocalDate assignedDate) {
        this.project = project;
        this.assignee = assignee;
        this.taskSummary = taskSummary;
        this.taskDetails = taskDetails;
        this.taskStatus = taskStatus;
        this.assignedDate = assignedDate;
        this.id= UUID.randomUUID().getMostSignificantBits();
    }
}
