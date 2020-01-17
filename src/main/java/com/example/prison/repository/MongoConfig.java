package com.example.prison.repository;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
public class MongoConfig extends AbstractMongoConfiguration{
    @Override
    protected String getDatabaseName() {
        return "prison-backend";
    }

    @Override
    public MongoClient mongoClient(){
        MongoClientURI uri = new MongoClientURI("mongodb://heroku_jvjv11jh:ttam271keqvft9ql7vrt1rs6di@ds127968.mlab.com:27968/heroku_jvjv11jh");
        MongoClient client = new MongoClient(uri);
        return client;
    }
}
