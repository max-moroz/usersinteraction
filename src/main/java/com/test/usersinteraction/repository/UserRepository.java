package com.test.usersinteraction.repository;

import com.test.usersinteraction.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

    boolean existsById(Long id);

    User findByName(String name);
}
