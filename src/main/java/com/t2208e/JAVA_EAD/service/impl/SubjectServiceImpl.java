package com.t2208e.JAVA_EAD.service.impl;

import com.t2208e.JAVA_EAD.entity.Subject;
import com.t2208e.JAVA_EAD.repository.SubjectRepository;
import com.t2208e.JAVA_EAD.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject getSubjectById(int id) {
        return subjectRepository.findById(id).orElse(null);
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void deleteSubject(int id) {
        subjectRepository.deleteById(id);
    }
}
