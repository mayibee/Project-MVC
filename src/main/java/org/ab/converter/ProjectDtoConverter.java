package org.ab.converter;

import org.ab.dto.ProjectDTO;
import org.ab.dto.RoleDTO;
import org.ab.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class ProjectDtoConverter implements Converter<String, ProjectDTO> {
    @Autowired
    ProjectService projectService;
    @Override
    public ProjectDTO convert(String s) {
        return projectService.findById(s);
    }
}
