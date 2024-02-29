package com.dxc;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService {

	 private List<User> userList = new ArrayList<>();

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public User getUserById(Long id) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void createUser(User user) {
        userList.add(user);
    }

    @Override
    public User updateUser(Long id, User updatedUser) {
        for (User user : userList) {
            if (user.getId().equals(id)) {
                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        userList.removeIf(user -> user.getId().equals(id));
    }

}
