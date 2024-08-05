package com.t2208e.JAVA_EAD.controller;

import com.t2208e.JAVA_EAD.entity.StudentScore;
import com.t2208e.JAVA_EAD.service.StudentScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-scores")
public class StudentScoreController {

    @Autowired
    private StudentScoreService studentScoreService;

    @GetMapping
    public List<StudentScore> getAllStudentScores() {
        return studentScoreService.getAllStudentScores();
    }

    @GetMapping("/{id}")
    public StudentScore getStudentScoreById(@PathVariable int id) {
        return studentScoreService.getStudentScoreById(id);
    }

    @PostMapping
    public StudentScore createStudentScore(@RequestBody StudentScore studentScore) {
        return studentScoreService.saveStudentScore(studentScore);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentScore(@PathVariable int id) {
        studentScoreService.deleteStudentScore(id);
    }

    @GetMapping("/grade")
    public String calculateGrade(@RequestParam double score1, @RequestParam double score2) {
        double grade = studentScoreService.calculateGrade(score1, score2);
        return studentScoreService.convertScoreToGrade(grade);
    }
}
