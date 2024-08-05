package com.t2208e.JAVA_EAD.service;

import com.t2208e.JAVA_EAD.dto.StudentInfoDTO;
import com.t2208e.JAVA_EAD.entity.StudentScore;

import java.math.BigDecimal;
import java.util.List;

public interface StudentScoreService {
    List<StudentScore> getAllStudentScores();
    StudentScore getStudentScoreById(int id);
    StudentScore saveStudentScore(StudentScore studentScore);
    void deleteStudentScore(int id);
    double calculateGrade(BigDecimal score1, BigDecimal score2);
    String convertScoreToGrade(double grade);
    List<StudentInfoDTO> getAllStudentInformation();
}
