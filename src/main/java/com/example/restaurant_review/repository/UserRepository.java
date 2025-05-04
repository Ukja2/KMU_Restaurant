package com.example.restaurant_review.repository;

import com.example.restaurant_review.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


// JpaRepository<엔티티, 기본키 타입>, , DB와 상호작용, SQL 없이 DB 기능을 편리하게 사용하는 인터페이스
public interface UserRepository extends JpaRepository<User, Long> {


}
