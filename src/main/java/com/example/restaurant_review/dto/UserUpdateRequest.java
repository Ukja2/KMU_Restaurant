package com.example.restaurant_review.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class UserUpdateRequest {

    private String email;
    private String nickname;
}
