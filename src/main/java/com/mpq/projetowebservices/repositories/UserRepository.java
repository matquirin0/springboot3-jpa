package com.mpq.projetowebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpq.projetowebservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
