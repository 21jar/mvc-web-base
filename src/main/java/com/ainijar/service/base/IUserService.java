package com.ainijar.service.base;

import com.ainijar.domain.base.User;

public interface IUserService {
    User getUserByLoginName(String username);
}
