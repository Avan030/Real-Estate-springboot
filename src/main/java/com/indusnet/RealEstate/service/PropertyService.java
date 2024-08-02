package com.indusnet.RealEstate.service;

import java.util.List;

import com.indusnet.RealEstate.model.Property;

public interface PropertyService {
    Property createProperty(Property property);
    List<Property> getAllProperties();
    Property getPropertyById(String id);
    List<Property> getUserProperties(String userId);
    List<Property> getPropertyRecommendations(String userId);
}
