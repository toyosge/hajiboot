package com.example;

/**
 * Created by masahirayamamoto on 2/27/16.
 */
public class AddCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
