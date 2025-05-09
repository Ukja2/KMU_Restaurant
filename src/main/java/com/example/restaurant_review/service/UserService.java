package com.example.restaurant_review.service;

//User 엔티티
import com.example.restaurant_review.domain.User;
//JPA인터페이스
import com.example.restaurant_review.dto.UserUpdateRequest;
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

    public User findById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("유저를 찾을 수 없습니다 = " + id));
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, UserUpdateRequest requestDto){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 유저가 없습니다. id =  " + id));

        user.setEmail(requestDto.getEmail());
        user.setNickname(requestDto.getNickname());


        return userRepository.save(user);

    }
}
