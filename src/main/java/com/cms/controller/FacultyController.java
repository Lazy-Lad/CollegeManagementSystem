package com.cms.controller;

import com.cms.dto.FacultyDto;
import com.cms.dto.StudentDto;
import com.cms.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FacultyController {

    @Autowired
    private FacultyService FacultyService;

    @GetMapping("/findfaculty")
    public List<FacultyDto> getAllTopics(){
        return FacultyService.get();
    }

    @GetMapping("/findfacultybyid/{UserId}")
    public FacultyDto FindById(@PathVariable(value = "UserId")long UserId){
        return FacultyService.FindById (UserId);
    }

    @PostMapping("/addfaculty")
    public FacultyDto add(@RequestBody FacultyDto faculty){
        return FacultyService.add(faculty);
    }

    @DeleteMapping("/deletefacultybyid/{UserId}")
    public String DeleteById(@PathVariable(value = "UserId")long UserId){
        return FacultyService.delete(UserId);
    }

}
