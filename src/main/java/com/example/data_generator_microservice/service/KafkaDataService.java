package com.example.data_generator_microservice.service;

import com.example.data_generator_microservice.model.Data;

public interface KafkaDataService {

    void send(Data data);
}
