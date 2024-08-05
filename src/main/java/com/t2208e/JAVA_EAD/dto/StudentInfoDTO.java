package com.t2208e.JAVA_EAD.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class StudentInfoDTO {
    private int studentId;
    private String studentName;
    private String studentSubject;
    private BigDecimal score1;
    private BigDecimal score2;
    private int credit;
    private String grade;

    public StudentInfoDTO(int studentId, String studentName, String studentSubject, double score1, double score2, int credit, String grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentSubject = studentSubject;
        this.score1 = BigDecimal.valueOf(score1);
        this.score2 = BigDecimal.valueOf(score2);
        this.credit = credit;
        this.grade = grade;
    }
}
