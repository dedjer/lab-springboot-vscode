package com.example.labspringbootvscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.labspringbootvscode.model.Address;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@Repository
// @RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address, Long> {
}
