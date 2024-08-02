package com.indusnet.RealEstate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document(collection = "property")
public class Property {
    @Id
    private String id;
    private String UserId;
    private String name;
    private Integer price;
    private Integer size; 
    
}
