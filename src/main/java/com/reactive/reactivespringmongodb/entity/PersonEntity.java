package com.reactive.reactivespringmongodb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("person")
public class PersonEntity {
    @Id
    private Long id;
    private String personName;
    private Long personAge;
}
