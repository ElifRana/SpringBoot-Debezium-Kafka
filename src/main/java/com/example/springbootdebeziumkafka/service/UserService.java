package com.example.springbootdebeziumkafka.service;

import com.example.springbootdebeziumkafka.model.User;
import java.util.List;

public interface UserService {

    User getUser(int id);

    User createUser(User user);

    User updateUser(int id, User user);

    void deleteUser(int id);

    List<User> allUser();
}
