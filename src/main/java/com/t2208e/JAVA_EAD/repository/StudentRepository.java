package com.t2208e.JAVA_EAD.repository;

import com.t2208e.JAVA_EAD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
