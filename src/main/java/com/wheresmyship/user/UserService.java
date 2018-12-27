package com.wheresmyship.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class UserService implements UserServiceInterface{
    private List<User> userList = new ArrayList<>(Arrays.asList(new User("Jason","a@g.com",0)));

    @Override
    public User getUserById() {
        return userList.get(0);
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}