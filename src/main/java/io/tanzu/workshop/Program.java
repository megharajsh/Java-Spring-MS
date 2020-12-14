import io.tanzu.workshop.ApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.tanzu.workshop.services.UserService;

public class Program {

    public static void main(String[] args) {
        //create a spring container / configuration instruction
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);


        // depends on UserService
        UserService instance = context.getBean("userService", UserService.class);

        instance.retreiveAlUsers().forEach(user -> System.out.println(user));
    }

}