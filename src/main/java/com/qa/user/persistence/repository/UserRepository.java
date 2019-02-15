package com.qa.user.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.user.persistence.domain.UserName;

@Repository
public interface UserRepository extends JpaRepository<UserName, String> {
}
