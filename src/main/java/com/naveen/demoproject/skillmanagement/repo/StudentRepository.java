package com.naveen.demoproject.skillmanagement.repo;

import com.naveen.demoproject.skillmanagement.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
