package com.shdori.book.springboot.domain.posts;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PostsRepository extends JpaRepository<Posts, Long> {

}
