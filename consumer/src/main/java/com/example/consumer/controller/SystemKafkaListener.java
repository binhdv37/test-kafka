package com.example.consumer.controller;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class SystemKafkaListener {

    @KafkaListener(topics = "topic1")
    void collectUserEmail(@Payload String message) {
        try {
            System.out.println("RECEIVE DATA: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
