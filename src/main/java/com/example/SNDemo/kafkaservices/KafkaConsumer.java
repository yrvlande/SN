package com.example.SNDemo.kafkaservices;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    private final KafkaProducer kafkaProducer;

    public KafkaConsumer(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @KafkaListener(topics = "inboundTopic")
    public void kafkaMessageConsumer(String incomingMessage) {
        System.out.println("Kafka Consumer 1");
       //kafkaProducer.sendAck("Thank you, Messsage recieved");

    }
}
