package com.example.sampleSpringJPA.controller;

import com.example.sampleSpringJPA.JpaRepositories.GuideJpaRepository;
import com.example.sampleSpringJPA.JpaRepositories.StudentJpaRepository;
import com.example.sampleSpringJPA.entities.Guide;
import com.example.sampleSpringJPA.entities.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sampleJPA")
public class SampleController {

    private final StudentJpaRepository studentJpaRepository;
    private final GuideJpaRepository guideJpaRepository;


    public SampleController(final StudentJpaRepository studentJpaRepository, final GuideJpaRepository guideJpaRepository) {
        this.studentJpaRepository = studentJpaRepository;
        this.guideJpaRepository = guideJpaRepository;
    }

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student){
        studentJpaRepository.save(student);
        return "Student has been persisted successfully";
    }

    @PostMapping("/saveGuide")
    public String saveGuide(@RequestBody Guide guide) {
        guideJpaRepository.save(guide);
        return "Guide has been persisted successfully";
    }
}
