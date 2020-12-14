package io.tanzu.workshop.repository;

import java.util.List;

public interface UserRepository {

    List<User> findAll();

    User save(User user);

    User findOne(int id);

    User deleteById(int id);
}
