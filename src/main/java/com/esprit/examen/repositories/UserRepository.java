package com.esprit.examen.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.examen.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}


