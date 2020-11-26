package org.ab.converter;

import org.ab.dto.UserDTO;
import org.ab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
@ConfigurationPropertiesBinding
public class UserDtoConverter implements Converter<String, UserDTO> {
    @Autowired
    UserService userService;

    @Override
    public UserDTO convert(String s) {
        return userService.findById(s);
    }
}

