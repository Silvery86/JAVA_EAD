package com.t2208e.JAVA_EAD.repository;

import com.t2208e.JAVA_EAD.dto.StudentInfoDTO;
import com.t2208e.JAVA_EAD.entity.StudentScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentScoreRepository extends JpaRepository<StudentScore, Integer> {
    @Query("SELECT s.studentId, s.fullName, subj.subjectName, sc.score1, sc.score2, subj.credit " +
            "FROM StudentScore sc " +
            "JOIN sc.student s " +
            "JOIN sc.subject subj")
    List<Object[]> findAllStudentInformation();
}
