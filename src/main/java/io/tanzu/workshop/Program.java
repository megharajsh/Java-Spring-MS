package io.tanzu.workshop;

import org.springframework.context.ApplicationContext;

import io.tanzu.workshop.services.UserService;
import io.tanzu.workshop.services.UserServiceImpl;

public class Program {

    public static void main(String[] args) {
        // depends on UserService

        ApplicationContext container = new CL

        UserService instance = new UserServiceImpl();

        instance.retreiveAlUsers().forEach(user -> System.out.println(user));
    }
}
