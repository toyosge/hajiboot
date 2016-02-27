package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by masahirayamamoto on 2/27/16.
 */
@Data
@AllArgsConstructor
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
}