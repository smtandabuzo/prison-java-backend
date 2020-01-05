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
@Document(collection = "court")
public class Court {
    @Id
    private String id;
    private String courtDate;
    private String courtName;
    private String presidingJudge;
    private String attorney;
}
