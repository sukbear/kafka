package com.sukbear.kafka.web;

import com.sukbear.kafka.messages.Greetings;
import com.sukbear.kafka.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

/***
 *@ClassName StreamsLisenter
 *@Description
 * @author sukbear
 * @create 2019-07-18 15:46
 */
@Component
@Slf4j
public class StreamsLisenter {
    @StreamListener(GreetingsStreams.INPUT)
    public void handleGreetings(@Payload Greetings greetings){
        log.info("Received greetings: {}",greetings);
    }
}
