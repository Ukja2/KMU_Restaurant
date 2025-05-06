package com.example.restaurant_review.domain;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import java.util.Date;


@Table(name = "Restaurant")
@Entity
@NoArgsConstructor
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 255)
    private String address;

    @Column(nullable = false, length = 50)
    private String category;

    @Column(nullable = false)
    private Double latitude;

    @Column(nullable = false)
    private Double longitude;

    // 자바의 createAt를 careated_at로 정확한 이름을 표현하기 위해 설정, 처음 한 번만 업데이트 후 수정 x
    @Column(name = "created_at", updatable = false)
    private java.util.Date createAt;

    @PrePersist
    public void onCreate(){
        this.createAt = new java.util.Date();
    }

}
