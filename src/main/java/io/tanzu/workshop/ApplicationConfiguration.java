package io.tanzu.workshop;

import io.tanzu.workshop.repository.InMemoryUserRepositoryImpl;
import io.tanzu.workshop.repository.UserRepository;
import io.tanzu.workshop.services.UserService;
import io.tanzu.workshop.services.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepositoryImpl();
    }

    @Bean
    public UserService userService() {
        return new UserServiceImpl(userRepository());
    }

}
