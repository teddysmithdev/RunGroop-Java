package com.rungroop.web.service.impl;

import com.rungroop.web.dto.RegistrationDto;
import com.rungroop.web.models.Role;
import com.rungroop.web.models.UserEntity;
import com.rungroop.web.repository.RoleRepository;
import com.rungroop.web.repository.UserRepository;
import com.rungroop.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private RoleRepository roleRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void saveUser(RegistrationDto registrationDto) {
        UserEntity user = new UserEntity();
        user.setUsername(registrationDto.getUsername());
        user.setEmail(registrationDto.getEmail());
        user.setPassword(registrationDto.getPassword());
        Role role = roleRepository.findByName("USER");
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }
}
