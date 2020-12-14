package io.tanzu.workshop.services;

import io.tanzu.workshop.model.User;
import io.tanzu.workshop.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {

    // Depends on user repository
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> retreiveAlUsers() {
        return userRepository.findAll();
    }

}
