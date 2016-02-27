package com.example;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        System.out.println("hello world ");
    }
}
