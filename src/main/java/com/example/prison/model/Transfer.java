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
@Document(collection = "transfer")
public class Transfer {
    @Id
    private String id;
    private String nationalID;
    private String fileNumber;
    private String toPrison;
    private String transferDate;
    private String arrivalDate;
    private String fromPrison;
    private String releasingOfficer;
    private String receivingOfficer;
    private String transferReason;
    private String prisonerName;
}
