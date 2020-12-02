package org.ab.implementation;

import org.ab.dto.ProjectDTO;
import org.ab.enums.Status;
import org.ab.service.ProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl extends AbstractMapService<ProjectDTO,String> implements ProjectService {
    @Override
    public List<ProjectDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(String projectCode) {
        super.deleteById(projectCode);
    }

    @Override
    public void delete(ProjectDTO object) {
        super.delete(object);
    }

    @Override
    public ProjectDTO save(ProjectDTO object) {
        return super.save(object.getProjectCode(), object);
    }

    @Override
    public void update(ProjectDTO object) {
        ProjectDTO newProject = findById(object.getProjectCode());
        if(object.getStatus() == null) {
            object.setStatus(newProject.getStatus());
        }
        super.update(object.getProjectCode(), object);
    }

    @Override
    public ProjectDTO findById(String projectCode) {
        return super.findById(projectCode);
    }

    @Override
    public void complete(ProjectDTO project) {
        project.setStatus(Status.COMPLETED);
        super.save(project.getProjectCode(),project);
    }
}
