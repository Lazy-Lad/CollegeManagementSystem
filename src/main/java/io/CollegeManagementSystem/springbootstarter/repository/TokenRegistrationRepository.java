package io.CollegeManagementSystem.springbootstarter.repository;

import io.CollegeManagementSystem.springbootstarter.model.TokenRegistration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TokenRegistrationRepository extends CrudRepository<TokenRegistration, Integer> {


}