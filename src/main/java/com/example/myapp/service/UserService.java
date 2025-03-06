package com.example.myapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.repository.UserRepository;

@Service
public class UserService {

    @Autowired  // UserRepository를 자동으로 주입
    private UserRepository userRepository;

    // 사용자 정보를 가져오는 비즈니스 로직
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);  // 리포지토리에서 사용자 조회
    }

    // 사용자 추가하는 비즈니스 로직
    public User saveUser(User user) {
        return userRepository.save(user);  // 리포지토리에서 사용자 저장
    }
}
