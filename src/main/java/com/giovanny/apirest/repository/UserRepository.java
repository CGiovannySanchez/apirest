package com.giovanny.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.giovanny.apirest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
