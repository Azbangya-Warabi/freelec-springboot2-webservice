package com.jojoldu.book.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// 데이터베이스를 접근하게 해주는 역할, JpaRepository<Ebtity 클래스, PK타입>을 상속하면 기본적인 CRUD메서드를 자동으로 생성
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
