package com.example.prison.dto.response;

import lombok.Data;

import java.util.Date;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
@Data
public class PrisonerInfoResponse {
   private Integer nationalID;
   private String fullName;
   private Date dateOfBirth;
   private String address;
   private String prison;
   private Enum gender;
   private String education;
   private String status;
   private String offence;
   private Date dateIn;
   private Integer fileNumber;
}
