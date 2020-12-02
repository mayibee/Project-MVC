package org.ab.dto;

import lombok.*;
import org.ab.enums.Status;
import java.time.LocalDate;

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

}
