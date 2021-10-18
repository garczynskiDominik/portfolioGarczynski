package com.example.contoller;

import com.example.DTO.UsersDto;
import com.example.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;


    @GetMapping(value = {"/addUser"})
    public String getAddUser() {
        return "login/register";
    }

    @PostMapping(value = {"/addUser"})
    public RedirectView postAddUser(@ModelAttribute UsersDto userDto){
        userServices.addUserPost(userDto);
        return new RedirectView("/login");


    }
}
