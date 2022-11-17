package com.example.springwebflux.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class KafkaServiceTest {

    @Autowired
    KafkaService kafkaService;

    @Test
    void sendMessage() {
        sendMessage();
    }

    @Test
    void listenGroupFoo() {
        kafkaService.listenGroupFoo("Hello");
    }
}