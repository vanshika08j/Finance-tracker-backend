package com.example.financeTracker.repository;

import com.example.financeTracker.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UserRepository extends JpaRepository<UserEntity, Long> {

    }
