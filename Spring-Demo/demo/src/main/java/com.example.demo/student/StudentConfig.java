package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args -> {
            Student mariam = new Student(1L,
                    "Jeff",
                    "Jeff@Jeff.com",
                    LocalDate.of(2000,
                            APRIL,4)
                   );

            Student alex = new Student(
                    "Alex",
                    "Alex@Alex.com",
                    LocalDate.of(2004,
                            JANUARY,4)
                   );

            repository.saveAll(List.of(mariam,alex));
        };
    }
}
