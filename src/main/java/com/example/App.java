package com.example;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public void run(String... strings) throws Exception {
        // Add data
        Customer created = customerRepository.save(new Customer(null, "Hidetoshi", "Dekisugi"));
        System.out.println(created + "is created!");

        // Paging
        Pageable pageable = new PageRequest(0, 3);
//        Page<Customer> page = customerRepository.findAll(pageable);
        Page<Customer> page = customerRepository.findAllOrderByName(pageable);
        System.out.println("Numbers of data of 1 page = " + page.getSize());
        System.out.println("Page number= " + page.getNumber());
        System.out.println("Numbers all pages = " + page.getTotalPages());
        System.out.println("Numbers all data = " + page.getTotalElements());
        page.getContent().forEach(System.out::println);
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
