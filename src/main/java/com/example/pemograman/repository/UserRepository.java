package com.example.pemograman.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pemograman.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    List<User> findAll();
}
