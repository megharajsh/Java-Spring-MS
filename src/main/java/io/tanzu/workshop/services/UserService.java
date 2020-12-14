package io.tanzu.workshop.services;

import io.tanzu.workshop.model.User;

import java.util.List;

public interface UserService {

    List<User> retreiveAlUsers();

}