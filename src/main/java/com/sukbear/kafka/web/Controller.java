package com.sukbear.kafka.web;

import com.sukbear.kafka.messages.Greetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/***
 *@ClassName Controller
 *@Description
 * @author sukbear
 * @create 2019-07-18 15:33
 */
@RestController
public class Controller {
    @Autowired
    Services services;
    @GetMapping("/{message}")
    public ResponseEntity greetings(@PathVariable("message") String mesage){
        Greetings greetings = Greetings.builder()
                .message(mesage)
                .timestamp(System.currentTimeMillis())
                .build();
        services.sendGreeting(greetings);
        return ResponseEntity.ok(greetings);
    }
}
