package com.example.springwebflux;

import com.example.springwebflux.service.KafkaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class Controller {

    //Salom
    final KafkaService kafkaService;
    public Controller(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    @GetMapping("/test")
    public Mono<String> test(@RequestParam String message){
        kafkaService.sendMessage(message);
        return Mono.just("Ismoil");
    }
}
