package org.example.kafka.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerListener {

    @KafkaListener(topics = "${kafka.topic}")
    public void consume(ConsumerRecord<String,String> payload){
        System.out.println(payload.value());
    }
}
