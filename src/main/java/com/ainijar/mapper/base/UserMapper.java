package com.ainijar.mapper.base;

import com.ainijar.domain.base.User;

public interface UserMapper {
    User getUserByLoginName(String username);

    User get(String id);
}
