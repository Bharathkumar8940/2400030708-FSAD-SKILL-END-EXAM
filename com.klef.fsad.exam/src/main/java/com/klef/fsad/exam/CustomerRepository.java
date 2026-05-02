package com.klef.fsad.exam;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.exam.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}