package com.ustanburak.awsdeployment.repository;

import com.ustanburak.awsdeployment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
