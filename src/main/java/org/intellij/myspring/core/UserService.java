package org.intellij.myspring.core;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * provides support to users
 * */
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void save(User user){
        userRepository.save(user);
    }

    public User findById(long id){
        return userRepository.findById(id);
    }

    public void update(User user){
        userRepository.update(user);
    }

    public void delete(long id){
        userRepository.delete(id);
    }
}
