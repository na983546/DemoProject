package com.naveen.demoproject.skillmanagement.services;

import com.naveen.demoproject.skillmanagement.dtos.StudentDto;
import com.naveen.demoproject.skillmanagement.entities.Student;
import com.naveen.demoproject.skillmanagement.repo.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public StudentDto findById(Integer id) {
        Student student = studentRepository.getById(id);
        return modelMapper.map(student, StudentDto.class);
    }
}
