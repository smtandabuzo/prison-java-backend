package com.example.prison.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
@AllArgsConstructor
@Data
@Document(collection = "cases")
public class Case {
    @Id
    private String id;
    private Integer nationalID;
    private Integer fileNumber;
    private String dateOfTrial;
    private String sentence;
    private String location;
    private String fullName;
    private String createdAt;
    private String updatedAt;
}
