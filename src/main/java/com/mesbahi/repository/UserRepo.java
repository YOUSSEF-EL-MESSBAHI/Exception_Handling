package com.mesbahi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mesbahi.entity.User;

public interface UserRepo extends JpaRepository {
	User findByUserId(int id);
}
