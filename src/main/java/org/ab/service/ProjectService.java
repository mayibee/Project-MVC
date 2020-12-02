package org.ab.service;

import org.ab.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO, String> {
    void complete(ProjectDTO project);
}
