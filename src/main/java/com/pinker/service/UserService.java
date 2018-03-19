package com.pinker.service;

import com.pinker.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User login(User user);
}
