package com.example.restaurant_review.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity //DB 테이블과 연결된 객체(entity)임을 의미
@Table(name = "user")
@Getter
@NoArgsConstructor //기본 생성자 자동 생성
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //해당 필드가 DB에서 자동증가(auto_increment)되도록 설정
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, length = 21)
    private String nickname;



}
