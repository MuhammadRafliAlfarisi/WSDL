package com.example.pemograman.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.pemograman.model.Users;

@Repository
public interface UsersRepository extends CrudRepository<Users, Integer>{
    List<Users> findAll();
}
