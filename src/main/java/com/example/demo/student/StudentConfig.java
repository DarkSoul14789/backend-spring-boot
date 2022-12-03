package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*; 

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
      Student mariam = new Student(
        1L,
        "Mariam",
        "Mariam@gmail.com",
        LocalDate.of(2000,JANUARY,5)
      );

      Student alex = new Student(
        "Alex",
        "Alex@gmail.com",
        LocalDate.of(2004,JANUARY,7)
      );

      repository.saveAll(
        List.of(mariam, alex)
      );
    };
  }
}
