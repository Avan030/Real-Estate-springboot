package com.indusnet.RealEstate.service.impl;

import com.google.gson.Gson;
import com.indusnet.RealEstate.common.ResponseModel;
import com.indusnet.RealEstate.exception.CustomNotFoundException;
import com.indusnet.RealEstate.exception.UnprocessableException;
import com.indusnet.RealEstate.model.Property;
import com.indusnet.RealEstate.repository.PropertyRepository;
import com.indusnet.RealEstate.service.PropertyService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PropertyServiceImpl implements PropertyService {
    
    @Autowired
    private Gson gson;
    
    @Autowired
    private PropertyRepository repository;

    @Override
    public Property createProperty(Property property) {
    if (property.getUserId() == null || property.getUserId().isEmpty()) {
        String newUserId = generateUniqueUserId();
        property.setUserId(newUserId);
        log.info("Generated new userId: " + newUserId); // Debug log
    }
    property.setName("");
    Property savedProperty = repository.save(property);
    log.info("Saved Property: " + savedProperty); // Debug log
    return savedProperty;
}

	private String generateUniqueUserId() {
		return UUID.randomUUID().toString(); // Generate a unique userId
	}
    @Override
    public List<Property> getAllProperties() {
        return repository.findAll();
    }

    @Override
    public Property getPropertyById(String id) {
        return repository.findById(id).orElseThrow(() -> new CustomNotFoundException("Property not found"));
    }

    @Override
    public List<Property> getUserProperties(String userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public List<Property> getPropertyRecommendations(String userId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'getPropertyRecommendations'");
    }
	

}
