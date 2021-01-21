package nl.gettoworktogether.springbootstartertestassertj.repository;

import nl.gettoworktogether.springbootstartertestassertj.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByLastName(String name);

}
