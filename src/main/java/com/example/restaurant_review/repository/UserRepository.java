package com.example.restaurant_review.repository;

import com.example.restaurant_review.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


// JpaRepository<엔티티, 기본키 타입>
public interface UserRepository extends JpaRepository<User, Long> {


}
