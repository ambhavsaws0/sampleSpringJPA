package com.example.sampleSpringJPA.mapper;

import com.example.sampleSpringJPA.entities.Guide;
import com.example.sampleSpringJPA.entities.Student;
import com.example.sampleSpringJPA.facade.GuideDto;
import com.example.sampleSpringJPA.facade.StudentDto;

public class GuideMapper {

    public Guide mapToGuide(final GuideDto guideDto) {
        final Guide guide = new Guide();

        guide.setSalary(guideDto.getSalary());
        guide.setStaffId(guideDto.getStaffId());
        guide.setName(guideDto.getName());
//        guide.setStudents(guideDto.getStudents().stream().map(studentDto -> new Student(studentDto.getEnrollmentId(), studentDto.getName())).toList());




        return guide;
    }

}
