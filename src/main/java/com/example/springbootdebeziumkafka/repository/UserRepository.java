package com.example.springbootdebeziumkafka.repository;

import com.example.springbootdebeziumkafka.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
