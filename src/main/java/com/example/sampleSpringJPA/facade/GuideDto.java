package com.example.sampleSpringJPA.facade;

import java.util.ArrayList;
import java.util.List;

public class GuideDto {

    private Long id;
    private String staffId;
    private String name;
    private Integer salary;
    private List<StudentDto> students = new ArrayList<>();

    public GuideDto(String staffId, String name, Integer salary, List<StudentDto> students) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "GuideDto{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", students=" + students +
                '}';
    }
}
