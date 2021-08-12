package com.example.movie.service.iplm;

import com.example.movie.model.UserApp;
import com.example.movie.repository.IUserRepository;
import com.example.movie.service.IUserAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserAppService implements IUserAppService {

    @Autowired
    IUserRepository userRepository;
    @Override
    public Optional<UserApp> findByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public Boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    @Override
    public Boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

    @Override
    public UserApp save(UserApp user) {
        return userRepository.save(user);
    }
}
