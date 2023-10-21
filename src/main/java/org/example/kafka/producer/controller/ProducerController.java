package org.example.kafka.producer.controller;

import org.example.kafka.producer.dto.ProductDTO;
import org.example.kafka.producer.service.ProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("producer")
public class ProducerController {

    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public String healthCheck(@RequestBody String message) {
        producerService.send(message);
        return "message is sent successfully !";
    }

    @PostMapping
    public ProductDTO sendProductMessage(@RequestBody ProductDTO message) {
        producerService.send(message);
        return message;
    }
}
