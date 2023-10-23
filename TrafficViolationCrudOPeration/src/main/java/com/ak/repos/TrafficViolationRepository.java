package com.ak.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.model.TrafficViolation;

@Repository
public interface TrafficViolationRepository extends JpaRepository<TrafficViolation, Integer> {

}
