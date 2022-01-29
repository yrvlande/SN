package com.example.SNDemo.kafkaservices;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer3 {


    @KafkaListener(topics = "inboundTopic")
    public void kafkaMessageConsumer(String incomingMessage) {
        System.out.println("Kafka Consumer 3");


    }
}
