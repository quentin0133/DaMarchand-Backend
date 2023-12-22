package fr.dawan.damarchand_backend;


import fr.dawan.damarchand_backend.dtos.ItemDTO;
import fr.dawan.damarchand_backend.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ServiceRunner implements CommandLineRunner {
/*
    @Autowired
    ItemService service;
*/
    @Override
    public void run(String... args) throws Exception {

        //service.getAllBaseItems().forEach(System.out::println);

    }

}