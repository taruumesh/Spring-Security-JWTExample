package com.jwt.example.services;

import com.jwt.example.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<User>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(), "Umesh", "abc@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ganesh", "pqr@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Mangesh", "xyz@gmail.com"));
    }

    public List<User> getUsers(){
        return this.store;
    }
}
