package com.test.usersinteraction.service;

import com.test.usersinteraction.entity.User;

import java.util.List;

public interface BaseService {

    User create(User user);

    List<User> findAll();

    User update(User user);
}
