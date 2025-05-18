package com.example.sampleSpringJPA.facade;


import com.example.sampleSpringJPA.entities.Guide;

public class StudentDto {

    private String enrollmentId;
    private String name;
    private GuideDto guide;

    public StudentDto(String enrollmentId, String name, GuideDto guide) {
        this.enrollmentId = enrollmentId;
        this.name = name;
        this.guide = guide;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GuideDto getGuide() {
        return guide;
    }

    public void setGuide(GuideDto guide) {
        this.guide = guide;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "enrollmentId='" + enrollmentId + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
