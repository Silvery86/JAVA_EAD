package com.t2208e.JAVA_EAD.repository;

import com.t2208e.JAVA_EAD.entity.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
}
