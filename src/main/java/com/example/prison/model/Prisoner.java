package com.example.prison.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
@AllArgsConstructor
@Data
@Document(collection = "prisoner")
public class Prisoner {
    @Id
    private String id;
    private Integer nationalID;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String address;
    private String prison;
    private String gender;
    private String education;
    private String status;
    private String offence;
    private String dateIn;
    private Integer fileNumber;
}
