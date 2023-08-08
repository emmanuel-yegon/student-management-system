package com.student.management;

import com.student.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Student std1 = new Student(1, "Manu", "Kip", "man@gmail.com");
//        studentRepository.save(std1);
//
//        Student std2 = new Student(2, "Joe", "Mune", "joe@gmail.com");
//        studentRepository.save(std2);
//
//        Student std3 = new Student(3, "kevin", "Mat", "kev@gmail.com");
//        studentRepository.save(std3);


    }
}
