package com.sda.gf23spring;

import com.sda.gf23spring.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProgStarter implements CommandLineRunner {


    Person person;

    public ProgStarter(){
        this.person = person;
        System.out.println("Konstruktor ProgStarter");

    }

    @Override
    public void run(String... args) throws Exception {
        person.setName("Ada");
        person.setPersonId(2);
        System.out.println(person);


    }
}
