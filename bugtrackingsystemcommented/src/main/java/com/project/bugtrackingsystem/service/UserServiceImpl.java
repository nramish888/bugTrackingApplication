package com.project.bugtrackingsystem.service;

import com.project.bugtrackingsystem.dto.UserDTO;
import com.project.bugtrackingsystem.entity.User;
import com.project.bugtrackingsystem.exception.UserNotAvailableException;
import com.project.bugtrackingsystem.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    // Registers a new user
    @Override
    public UserDTO registerUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        user = userRepository.save(user);
        System.out.println(user.toString());
        return modelMapper.map(user, UserDTO.class);
    }

    // Signs in a user with the provided username and password
    @Override
    public UserDTO signIn(String userName, String password) throws UserNotAvailableException {
        User userEntity = userRepository.findByUserNameAndUserPassword(userName, password);
 
        if (userEntity != null) {
            return modelMapper.map(userEntity, UserDTO.class);
        } else {
            throw new UserNotAvailableException("User not found or authentication failed for username: " + userName);
        }
    }

    // Signs out the currently authenticated user
    @Override
    public String signOut() {
        // Return a message or status indicating the sign-out action was successful
        return "User signed out successfully";
    }
}
