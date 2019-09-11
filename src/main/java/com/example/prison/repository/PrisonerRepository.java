package com.example.prison.repository;

import com.example.prison.model.Prisoner;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by smtandabuzo on 2019/09/10.
 */
public interface PrisonerRepository extends MongoRepository<Prisoner, String> {

}
