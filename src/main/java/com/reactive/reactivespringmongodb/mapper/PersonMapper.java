package com.reactive.reactivespringmongodb.mapper;

import com.reactive.reactivespringmongodb.entity.PersonEntity;
import com.reactive.reactivespringmongodb.model.PersonRequest;
import com.reactive.reactivespringmongodb.model.PersonResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")

public interface PersonMapper {

    PersonEntity toEntity(PersonRequest personRequest);

    PersonRequest toModel(PersonEntity personEntity);

    PersonResponse toModel1(PersonEntity personEntity);
}
