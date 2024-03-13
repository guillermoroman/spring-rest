package com.example;

import com.example.model.Manufacturer;
import com.example.repository.ManufacturerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {

        // Application context no es necesario para el funcionamiento:
        // Se utiliza para agregar datos de prueba en este caso.
        ApplicationContext context = SpringApplication.run(App.class, args);
        var repo = context.getBean(ManufacturerRepository.class);
        repo.save(new Manufacturer(null, "manufacturer1", 1000, 1990));
    }

}
