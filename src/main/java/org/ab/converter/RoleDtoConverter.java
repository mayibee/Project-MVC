package org.ab.converter;


import org.ab.dto.RoleDTO;
import org.ab.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;
import org.springframework.core.convert.converter.Converter;

@Component
@ConfigurationPropertiesBinding
public class RoleDtoConverter implements Converter<String,RoleDTO> {

    @Autowired
    RoleService roleService;

    @Override
    public RoleDTO convert(String source) {
        Long id = Long.parseLong(source);
        RoleDTO object = new RoleDTO();
        object = roleService.findById(id);
        return object;
    }
}
