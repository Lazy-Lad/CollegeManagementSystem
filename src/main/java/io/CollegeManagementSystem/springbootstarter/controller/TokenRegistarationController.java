package io.CollegeManagementSystem.springbootstarter.controller;
import io.CollegeManagementSystem.springbootstarter.dto.TokenRegistrationDTO;
import io.CollegeManagementSystem.springbootstarter.service.TokenRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/fcm")
public class TokenRegistarationController {

    @Autowired
    private TokenRegistrationService service;
    @PostMapping(value = "/token",consumes = "application/x-www-form-urlencoded")
    public @ResponseBody TokenRegistrationDTO addStudent( TokenRegistrationDTO dto) {
        return service.addStudent(dto);
    }

    @GetMapping("/token")
    public List<TokenRegistrationDTO> getStudent(){
        return (List<TokenRegistrationDTO>) service.getStudent();
    }

    @GetMapping("/token/{id}")
    public TokenRegistrationDTO FindById(@PathVariable(value = "id")int id ){
        return service.FindById(id);
    }
    @DeleteMapping("/token/{id}")
    public String deleteById(@RequestBody @PathVariable(value = "id")int id ){
        return service.deleteById(id);
    }

    @DeleteMapping("/token")
    public String deleteAllStudents(){
        return service.delete();

    }

}
