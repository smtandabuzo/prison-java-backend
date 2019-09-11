package com.example.prison.repository;

import com.example.prison.model.Case;
import com.example.prison.model.Transfer;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
public interface TransferRepository extends MongoRepository<Transfer, String> {

}
