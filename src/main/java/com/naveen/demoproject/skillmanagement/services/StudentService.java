package com.naveen.demoproject.skillmanagement.services;

import com.naveen.demoproject.skillmanagement.dtos.StudentDto;

public interface StudentService {
    StudentDto findById(Integer id);
}
