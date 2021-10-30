package com.naveen.demoproject.skillmanagement.controllers;

import com.naveen.demoproject.skillmanagement.dtos.StudentDto;
import com.naveen.demoproject.skillmanagement.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/getById")
    public StudentDto getStudentById(@RequestParam Integer id) {
        return studentService.findById(id);
    }
}
