package com.example.restaurant_review.service;

//User 엔티티
import com.example.restaurant_review.domain.User;
//JPA인터페이스
import com.example.restaurant_review.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private final UserRepository userRepository;

    //생성자 DI
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User save(User user){
        return userRepository.save(user);
    }


    public List<User> findAll(){
        return userRepository.findAll();
    }


}
