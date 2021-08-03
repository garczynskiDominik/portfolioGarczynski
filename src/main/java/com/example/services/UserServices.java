package com.example.services;

import com.example.DTO.converters.UserConverter;
import com.example.DTO.UsersDto;
import com.example.model.Users;
import com.example.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class UserServices {


    private final UserRepository userRepository;
    private final UserConverter userConverter;
    private final PasswordEncoder passwordEncoder;

    public UserServices(UserRepository userRepository, UserConverter userConverter, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
        this.passwordEncoder = passwordEncoder;
    }

    public UsersDto getUser(Long id) {
        return userConverter.entityToDto(userRepository.findById(id).orElse(null));
    }

    public void addUserPost(UsersDto userDto) {
        Users users = userConverter.dtoToEntity(userDto);
        users.setPassword(passwordEncoder.encode(users.getPassword()));
        userRepository.save(users);
    }
}
