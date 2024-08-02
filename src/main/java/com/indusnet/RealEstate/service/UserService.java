package com.indusnet.RealEstate.service;

import com.indusnet.RealEstate.model.User;

public interface UserService {
    User getUserById(String id);

    User createUser(User user);
}
