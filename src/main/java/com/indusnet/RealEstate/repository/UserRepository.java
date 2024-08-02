package com.indusnet.RealEstate.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.indusnet.RealEstate.model.Property;
import com.indusnet.RealEstate.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
    List<User> findByUserId(String userId);


}
