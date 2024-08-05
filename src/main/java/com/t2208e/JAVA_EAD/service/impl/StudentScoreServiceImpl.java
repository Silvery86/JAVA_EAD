package com.t2208e.JAVA_EAD.service.impl;

import com.t2208e.JAVA_EAD.entity.StudentScore;
import com.t2208e.JAVA_EAD.repository.StudentScoreRepository;
import com.t2208e.JAVA_EAD.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentScoreServiceImpl implements StudentScoreService {

    @Autowired
    private StudentScoreRepository studentScoreRepository;

    @Override
    public List<StudentScore> getAllStudentScores() {
        return studentScoreRepository.findAll();
    }

    @Override
    public StudentScore getStudentScoreById(int id) {
        return studentScoreRepository.findById(id).orElse(null);
    }

    @Override
    public StudentScore saveStudentScore(StudentScore studentScore) {
        return studentScoreRepository.save(studentScore);
    }

    @Override
    public void deleteStudentScore(int id) {
        studentScoreRepository.deleteById(id);
    }

    @Override
    public double calculateGrade(double score1, double score2) {
        return 0.3 * score1 + 0.7 * score2;
    }

    @Override
    public String convertScoreToGrade(double grade) {
        if (grade >= 8.0) {
            return "A";
        } else if (grade >= 6.0) {
            return "B";
        } else if (grade >= 4.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
