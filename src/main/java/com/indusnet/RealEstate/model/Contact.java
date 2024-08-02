package com.indusnet.RealEstate.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "contact")
public class Contact {
    private String ContactId;
    private String UserId;
}
