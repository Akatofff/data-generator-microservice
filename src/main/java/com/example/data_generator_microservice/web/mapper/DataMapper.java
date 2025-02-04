package com.example.data_generator_microservice.web.mapper;

import com.example.data_generator_microservice.model.Data;
import com.example.data_generator_microservice.web.dto.DataDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDto> {

}
