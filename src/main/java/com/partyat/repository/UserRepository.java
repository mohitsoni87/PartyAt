package com.partyat.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.partyat.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
