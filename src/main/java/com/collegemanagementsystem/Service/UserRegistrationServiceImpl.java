package com.collegemanagementsystem.Service;

import com.collegemanagementsystem.Dto.UserRegistrationDto;
import com.collegemanagementsystem.Entity.UserRegistrationEntity;
import com.collegemanagementsystem.Repository.UserRepository;

import com.google.common.reflect.TypeToken;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.lang.reflect.Type;
import java.util.List;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService{

    @Autowired
    private UserRepository userrepo;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    ModelMapper modelMapper;
    public List<UserRegistrationDto> allUser(){
        List<UserRegistrationDto> userRegistrationDto =null;
        List<UserRegistrationEntity> userRegistrationEntity = userrepo.findAll();
       Type targetListType= new TypeToken<List<UserRegistrationEntity>>(){}.getType();
       userRegistrationDto =modelMapper.map(userRegistrationEntity,targetListType);
       return userRegistrationDto;

    }

    public UserRegistrationEntity addUser(UserRegistrationDto userdto){
        UserRegistrationEntity newuser=new UserRegistrationEntity();
        newuser.setName(userdto.getName());
        newuser.setUsername(userdto.getUsername());
        newuser.setPassword(passwordEncoder.encode(userdto.getPassword()));
        newuser.setStatus(userdto.getStatus());
        newuser.setMobile(userdto.getMobile());
        return userrepo.save(newuser);
    }

}
