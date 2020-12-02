package org.ab.implementation;

import org.ab.dto.TaskDTO;
import org.ab.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl extends AbstractMapService<TaskDTO,String> implements TaskService {


}
