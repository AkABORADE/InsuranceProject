package com.ak.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ak.model.Cource;

@Repository
public interface CourceRepository extends JpaRepository<Cource, Integer> {

}
