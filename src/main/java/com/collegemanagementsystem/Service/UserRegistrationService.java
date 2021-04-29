package com.collegemanagementsystem.Service;

import com.collegemanagementsystem.Dto.UserRegistrationDto;
import com.collegemanagementsystem.Entity.UserRegistrationEntity;

import java.util.List;

public interface UserRegistrationService {
    public List<UserRegistrationDto> allUser();
    public UserRegistrationEntity addUser(UserRegistrationDto userdto);
}
