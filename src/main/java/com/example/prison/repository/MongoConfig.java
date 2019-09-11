package com.example.prison.repository;

import com.mongodb.MongoClient;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
public class MongoConfig extends AbstractMongoConfiguration{
    @Override
    protected String getDatabaseName() {
        return "prison-cms";
    }

    @Override
    public MongoClient mongoClient(){
        return new MongoClient("localhost", 27017);
    }
}
