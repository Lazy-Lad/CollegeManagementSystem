package com.cms.repository;

import com.cms.entity.NonTeachingStaff;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NonTeachingStaffRepository extends CrudRepository<NonTeachingStaff, Long> {
}
