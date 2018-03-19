package com.pinker.mapper;

import com.pinker.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User findUser(User user);

}
