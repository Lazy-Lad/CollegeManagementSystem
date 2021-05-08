package com.cms.controller;

import com.cms.dto.StudentDto;
import com.cms.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService StudentService;

    @GetMapping("/findStudent")
    public List<StudentDto> getAllTopics(){
        return StudentService.get();
    }

    @GetMapping("/findbyid/{UserId}")
    public StudentDto FindById(@PathVariable(value = "UserId")long UserId){
       return StudentService.FindById (UserId);
    }

    @DeleteMapping("/deletebyid/{UserId}")
    public String DeleteById(@PathVariable(value = "UserId")long UserId){
        return StudentService.delete(UserId);
    }

    @PostMapping("/addstudent")
    public StudentDto add(@RequestBody StudentDto student){
        return StudentService.add(student);
    }


}
