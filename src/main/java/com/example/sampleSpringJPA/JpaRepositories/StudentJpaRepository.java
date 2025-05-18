package com.example.sampleSpringJPA.JpaRepositories;

import com.example.sampleSpringJPA.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {
}
