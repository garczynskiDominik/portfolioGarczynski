package com.example.contoller;

import com.example.DTO.UsersDto;
import com.example.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final UserServices userServices;


    @RequestMapping(value = {"/addUser"}, method = RequestMethod.GET)
    public String getAddUser() {
        return "login/register";
    }

    @RequestMapping(value = {"/addUser"}, method = RequestMethod.POST)
    public RedirectView postAddUser(@ModelAttribute UsersDto userDto){
        userServices.addUserPost(userDto);
        return new RedirectView("/login");


    }
}
