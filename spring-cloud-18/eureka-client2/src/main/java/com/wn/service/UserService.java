package com.wn.service;

import com.wn.entity.User;

public interface UserService {
      User UserInfo(String name);
      void save(User user);
}
