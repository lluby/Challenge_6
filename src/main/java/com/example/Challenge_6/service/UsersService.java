package com.example.Challenge_6.service;

import com.example.Challenge_6.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsersService {
    Users addUsers(Users users);
    void deleteUsers(String UserId);
    Users updateUsers(Users users);
    List<Users> getAllUsers();
    Users getUsersDetail(String UserId);
}
