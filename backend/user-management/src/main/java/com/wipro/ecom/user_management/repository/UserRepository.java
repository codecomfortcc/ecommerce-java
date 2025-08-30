package com.wipro.ecom.user_management.repository;

import com.wipro.ecom.user_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // This custom query allows Spring Security to find a user by their username (which is userId in our case)
    Optional<User> findByUserId(String userId);
}
