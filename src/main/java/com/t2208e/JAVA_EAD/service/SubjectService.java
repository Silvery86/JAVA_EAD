package com.t2208e.JAVA_EAD.service;

import com.t2208e.JAVA_EAD.entity.Subject;

import java.util.List;

public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject getSubjectById(int id);
    Subject saveSubject(Subject subject);
    void deleteSubject(int id);
}
