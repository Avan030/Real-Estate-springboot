package com.indusnet.RealEstate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.indusnet.RealEstate.model.Property;
import com.indusnet.RealEstate.service.PropertyService;

import java.util.List;

@RestController
@RequestMapping("/api/property")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;

    @PostMapping("/properties")
    public Property createProperty(@RequestBody Property property) {
        return propertyService.createProperty(property);
    }

    @GetMapping("/all")
    public List<Property> getAllPropertys() {
        return propertyService.getAllProperties();
    }

    @GetMapping("/{id}")
    public Property getPropertyById(@PathVariable String id) {
        return propertyService.getPropertyById(id);
    }

    @GetMapping("/recommendations")
    public List<Property> getPropertyRecommendations(@RequestParam String userId) {
        // Placeholder for the algorithm to suggest Propertys
        return propertyService.getUserProperties(userId);
    }
}
