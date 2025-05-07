package com.example.restaurant_review.repository;

import com.example.restaurant_review.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepostiory  extends JpaRepository<Restaurant, Long>{


    }

