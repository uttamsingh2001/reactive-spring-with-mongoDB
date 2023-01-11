package com.reactive.reactivespringmongodb.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonRequest extends PersonResponse {
    private String personName;
    private Long personAge;
}
