package com.example.financeTracker.service;

import com.example.financeTracker.entities.UserEntity;
import com.example.financeTracker.model.User;
import com.example.financeTracker.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public User createUser(User user) {
        UserEntity userEntity = new UserEntity();

        BeanUtils.copyProperties(user, userEntity);

        UserEntity savedEntity = userRepository.save(userEntity);

        User responseUser = new User();

        BeanUtils.copyProperties(savedEntity, responseUser);

        return responseUser;

    }

    @Override
    public List<User> getAllUsers() {        List<UserEntity> userEntities = userRepository.findAll();

        return userEntities.stream().map(userEntity -> {
            User user = new User();
            BeanUtils.copyProperties(userEntity, user);
            return user;
        }).collect(Collectors.toList());
    }

}

