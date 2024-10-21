package com.ecom_proj.dream_shops.repository;

import com.ecom_proj.dream_shops.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
