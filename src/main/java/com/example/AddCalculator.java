package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by masahirayamamoto on 2/27/16.
 */
@Component
public class AddCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
