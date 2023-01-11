package com.reactive.reactivespringmongodb.controller;


import com.reactive.reactivespringmongodb.model.PersonRequest;
import com.reactive.reactivespringmongodb.model.PersonResponse;
import com.reactive.reactivespringmongodb.service.PersonService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/persons")
    public Flux<PersonRequest> getAllPersons()
    {
        return this.personService.getAllPersons();
    }

    @PostMapping("/persons")
    public Mono<PersonResponse> createPerson(@RequestBody Mono<PersonRequest> personRequest){
        return this.personService.createPerson(personRequest);
    }

    @GetMapping("/persons/{personId}")
    public Mono<PersonRequest> getPersonById(@PathVariable Long personId){
        return this.personService.getPersonById(personId);
    }
}
