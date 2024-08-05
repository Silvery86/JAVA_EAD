package com.t2208e.JAVA_EAD.service;

import com.t2208e.JAVA_EAD.entity.StudentScore;

import java.util.List;

public interface StudentScoreService {
    List<StudentScore> getAllStudentScores();
    StudentScore getStudentScoreById(int id);
    StudentScore saveStudentScore(StudentScore studentScore);
    void deleteStudentScore(int id);
    double calculateGrade(double score1, double score2);
    String convertScoreToGrade(double grade);
}
