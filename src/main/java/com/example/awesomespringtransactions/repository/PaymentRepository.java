package com.example.awesomespringtransactions.repository;

import com.example.awesomespringtransactions.model.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
