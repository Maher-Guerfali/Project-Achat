package com.esprit.examen.services;

import java.util.List;

import com.esprit.examen.entities.User;


public interface IUserService {

    List<User> retrieveAllUsers();
    User addUser(User u);
    void deleteUser(String id);
    User updateUser(User u);
    User retrieveUser(String id);

}