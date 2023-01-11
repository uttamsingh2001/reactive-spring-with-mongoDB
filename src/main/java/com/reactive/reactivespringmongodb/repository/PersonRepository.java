package com.reactive.reactivespringmongodb.repository;


import com.reactive.reactivespringmongodb.entity.PersonEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends ReactiveMongoRepository<PersonEntity,Long> {
}
