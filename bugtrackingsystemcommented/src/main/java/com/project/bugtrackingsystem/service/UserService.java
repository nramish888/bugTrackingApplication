package com.project.bugtrackingsystem.service;

import com.project.bugtrackingsystem.dto.UserDTO;

public interface UserService {

    // Registers a new user.
    UserDTO registerUser(UserDTO userDTO);

    // Signs in a user with the provided username and password.
    UserDTO signIn(String userName, String password);

    // Signs out the currently authenticated user.
    String signOut();
}
