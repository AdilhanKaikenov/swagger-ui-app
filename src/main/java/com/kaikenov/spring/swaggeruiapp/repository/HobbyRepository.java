package com.kaikenov.spring.swaggeruiapp.repository;

import com.kaikenov.spring.swaggeruiapp.entity.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyRepository extends JpaRepository<Hobby, Long> {
}
