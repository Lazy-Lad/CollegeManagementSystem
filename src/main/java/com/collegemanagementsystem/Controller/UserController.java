package com.collegemanagementsystem.Controller;

import com.collegemanagementsystem.Dto.UserRegistrationDto;
import com.collegemanagementsystem.Service.UserRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRegistrationService userRegistrationService;
    @ResponseBody
    @RequestMapping(value="/get",method = RequestMethod.GET)
    public List<UserRegistrationDto> alluser(){

        List<UserRegistrationDto> userRegistrationDtos =userRegistrationService.allUser();
        return userRegistrationDtos;
    }
    @RequestMapping(value="/registration",method = RequestMethod.POST)
    @ResponseBody
    public String adduser(@RequestBody UserRegistrationDto userRegistrationDto){
        userRegistrationService.addUser(userRegistrationDto);
        String msg = "Registration Successful";
        return msg;
    }



}
