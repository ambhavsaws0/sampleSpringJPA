package com.example.sampleSpringJPA.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Guide {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "staff_id", nullable = false)
    private String staffId;

    private String name;
    private Integer salary;

    @OneToMany(mappedBy = "guide", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    public Guide() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students.addAll(students);
        students.stream().forEach(student -> student.setGuide(this));
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

    @Override
    public String toString() {
        return "Guide{" +
                "staffId='" + staffId + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", students=" + students +
                '}';
    }
}
