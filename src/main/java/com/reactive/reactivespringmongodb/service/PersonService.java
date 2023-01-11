package com.reactive.reactivespringmongodb.service;


import com.reactive.reactivespringmongodb.mapper.PersonMapper;
import com.reactive.reactivespringmongodb.model.PersonRequest;
import com.reactive.reactivespringmongodb.model.PersonResponse;
import com.reactive.reactivespringmongodb.repository.PersonRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonService {

    private final PersonRepository personRepository;
private final PersonMapper personMapper;
    public PersonService(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    public Flux<PersonRequest> getAllPersons() {
        return this.personRepository.findAll().map(personMapper::toModel);
    }

    public Mono<PersonResponse> createPerson(Mono<PersonRequest> personRequest) {
        return personRequest.map(personMapper::toEntity)
                .flatMap(personRepository::save)
                .map(personMapper::toModel1);
    }

    public Mono<PersonRequest> getPersonById(Long personId){
        return this.personRepository.findById(personId)
                .map(personMapper::toModel);
    }
}
