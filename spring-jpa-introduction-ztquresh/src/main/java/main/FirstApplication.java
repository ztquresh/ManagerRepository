package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstApplication implements CommandLineRunner {


    @Autowired
    ManagerRepository managerRepository;

    public static void main(String[] args) {
        SpringApplication.run(FirstApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        ManagerEntity manager= new ManagerEntity();
        manager.setLastName("Bob");
        managerRepository.save(manager);

        ManagerEntity managerFromDb = managerRepository.findByLastName("Bob");
        System.out.println(managerFromDb);
    }
}
