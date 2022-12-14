package com.rungroop.web.service;

import com.rungroop.web.dto.RegistrationDto;
import com.rungroop.web.models.UserEntity;

public interface UserService {
    void saveUser(RegistrationDto registrationDto);
    UserEntity findByEmail(String email);
    UserEntity findByUsername(String username);
}
