package org.wys.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wys.hotel.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
