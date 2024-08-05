package com.t2208e.JAVA_EAD.service.impl;

import com.t2208e.JAVA_EAD.dto.StudentInfoDTO;
import com.t2208e.JAVA_EAD.entity.StudentScore;
import com.t2208e.JAVA_EAD.repository.StudentScoreRepository;
import com.t2208e.JAVA_EAD.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
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
    public double calculateGrade(BigDecimal score1, BigDecimal score2) {
        double score1Double = score1.doubleValue();
        double score2Double = score2.doubleValue();
        return 0.3 * score1Double + 0.7 * score2Double;
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

    @Override
    public List<StudentInfoDTO> getAllStudentInformation() {
        List<Object[]> results = studentScoreRepository.findAllStudentInformation();
        List<StudentInfoDTO> studentInfoList = new ArrayList<>();

        for (Object[] result : results) {
            int studentId = (int) result[0];
            String studentName = (String) result[1];
            String subjectName = (String) result[2];
            BigDecimal score1 = (BigDecimal) result[3];
            BigDecimal score2 = (BigDecimal) result[4];
            int credit = (int) result[5];

            double gradeValue = calculateGrade(score1, score2);
            String grade = convertScoreToGrade(gradeValue);

            StudentInfoDTO studentInfo = new StudentInfoDTO(studentId, studentName, subjectName, score1.doubleValue(), score2.doubleValue(), credit, grade);
            studentInfoList.add(studentInfo);
        }

        return studentInfoList;
    }
}
