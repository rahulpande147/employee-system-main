package com.empsystem.employeesystem.controller;

import com.empsystem.employeesystem.Exception.NotFoundException;
import com.empsystem.employeesystem.model.Users;
import com.empsystem.employeesystem.repo.ProjectDetailsRepository;
import com.empsystem.employeesystem.repo.UserRepository;
import com.empsystem.employeesystem.services.UserProjectDeatailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users/userprojectdetails")
public class UserProjectDetailController {

    @Autowired
    private UserProjectDeatailService userProjectDeatailService;

    @Autowired
    private ProjectDetailsRepository projectDetailsRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{projectid}/users")
    public List<Users> getProjectInfo(@PathVariable Long projectid){
        return userProjectDeatailService.getProjectInfo(projectid);
    }

    @PostMapping("/{projectid}/users")
    public Users addUserToProjectInfo (@PathVariable Long projectid, @RequestBody Users users ){
        return userProjectDeatailService.addUserToProjectInfo(projectid, users);
    }
}
