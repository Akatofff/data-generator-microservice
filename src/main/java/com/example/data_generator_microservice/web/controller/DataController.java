package com.example.data_generator_microservice.web.controller;

import com.example.data_generator_microservice.model.Data;
import com.example.data_generator_microservice.service.KafkaDataService;
import com.example.data_generator_microservice.web.dto.DataDto;
import com.example.data_generator_microservice.web.mapper.DataMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;

    private final DataMapper dataMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);

    }

}
