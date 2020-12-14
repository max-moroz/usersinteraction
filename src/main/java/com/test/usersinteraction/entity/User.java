package com.test.usersinteraction.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    private Long id;

    private String name;

    private String lastName;

    private String password;

    public User(Long id, String name, String lastName, String password) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
    }
}
