package com.collegemanagementsystem.Repository;

import com.collegemanagementsystem.Entity.UserRegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserRegistrationEntity,Integer> {
}
