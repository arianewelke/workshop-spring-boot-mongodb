package com.arianewelke.workshopmongo.config;

import com.arianewelke.workshopmongo.domain.User;
import com.arianewelke.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.PanelUI;
import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User maria = new User("maria@gmail.com", null, "Maria Brown");
        User alex = new User("alex@gmail.com", null, "Alex Green" );
        User bob = new User("bob@gmail.com", null, "Bob White" );

        userRepository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
