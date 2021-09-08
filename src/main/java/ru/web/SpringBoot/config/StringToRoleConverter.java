package ru.web.SpringBoot.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.web.SpringBoot.model.Role;


@Component
public class StringToRoleConverter implements Converter<String, Role> {

    @Override
    public Role convert(String s) {
        String[] param = s.split(":");
        Long id = Long.parseLong(param[0]);
        String name = param[1];
        return new Role(id, name);
    }
}
