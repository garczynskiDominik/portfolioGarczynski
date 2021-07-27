package com.example.DTO;

import com.example.model.Users;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserConverter {

    public UsersDto entityToDto(Users users){
        UsersDto usersDto = new UsersDto();
        usersDto.setId(users.getId());
        usersDto.setUsername(users.getUsername());
        usersDto.setPassword(users.getPassword());
        usersDto.setCompany(users.getCompany());

        return usersDto;
    }
    public List<UsersDto> entityToDto(List<Users> users){
        return users.stream()
                .map(this::entityToDto)
                .collect(Collectors.toList());
    }

    public Users dtoToEntity(UsersDto usersDto){
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setUsername(usersDto.getUsername());
        users.setPassword(usersDto.getPassword());
        users.setCompany(usersDto.getCompany());

        return users;
    }
    public List<Users> dtoToEntity(List<UsersDto> usersDtos){
        return usersDtos.stream()
                .map(this::dtoToEntity)
                .collect(Collectors.toList());
    }
}
