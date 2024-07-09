package com.example.springzecoproject.repository;

import com.example.springzecoproject.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login,String> {
}
