package com.example.repository;

import com.example.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by masahirayamamoto on 2/27/16.
 */

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
