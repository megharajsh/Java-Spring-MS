package io.tanzu.workshop.services;

import io.tanzu.workshop.model.User;
import io.tanzu.workshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    // Depends on user repository
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> retreiveAlUsers() {
        return userRepository.findAll();
    }

}
