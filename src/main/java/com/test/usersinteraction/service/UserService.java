package com.test.usersinteraction.service;

import com.test.usersinteraction.entity.User;
import com.test.usersinteraction.exception.EntityNotFoundException;
import com.test.usersinteraction.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService implements BaseService {

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        repository.insert(user);
        log.info("User with id= {} created", user.getId());
        return user;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User update(User user) {
        if (repository.existsById(user.getId())) {
            repository.save(user);
            log.info("User with id= {} updated", user.getId());
            return user;
        } else {
            throw new EntityNotFoundException(String.format("User with id %s", user.getId()));
        }
    }
}
