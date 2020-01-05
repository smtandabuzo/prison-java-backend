package com.example.prison.model;

/**
 * Created by smtandabuzo on 2019/12/09.
 */
import lombok.Data;
@Data
public class Address {
    private Integer streetnumber;
    private String streetname;
    private String suburb;
    private String city;
    private Integer postalcode;
}
