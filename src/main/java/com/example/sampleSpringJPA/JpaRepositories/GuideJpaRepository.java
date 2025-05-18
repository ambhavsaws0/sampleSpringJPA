package com.example.sampleSpringJPA.JpaRepositories;

import com.example.sampleSpringJPA.entities.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuideJpaRepository extends JpaRepository<Guide, Long> {
}
