package com.example.sampleSpringJPA.mapper;


import com.example.sampleSpringJPA.entities.Guide;
import com.example.sampleSpringJPA.entities.Student;
import com.example.sampleSpringJPA.facade.StudentDto;

public class StudentMapper {

    public Student mapToStudent(final StudentDto studentDto) {
        final Student student = new Student();
        final Guide guide = new Guide();

        guide.setName(studentDto.getGuide().getName());
        guide.setSalary(studentDto.getGuide().getSalary());
        guide.setStaffId(studentDto.getGuide().getStaffId());

        student.setName(studentDto.getName());
        student.setEnrollmentId(studentDto.getEnrollmentId());
        student.setGuide(guide);

        return student;
    }
}
