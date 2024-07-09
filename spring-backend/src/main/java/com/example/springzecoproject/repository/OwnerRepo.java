package com.example.springzecoproject.repository;

import com.example.springzecoproject.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner,Integer> {
}
