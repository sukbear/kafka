package com.sukbear.kafka.web;

import com.sukbear.kafka.messages.Greetings;
import com.sukbear.kafka.stream.GreetingsStreams;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;
import sun.net.www.MessageHeader;

import javax.activation.MimeType;

/***
 *@ClassName services
 *@Description
 * @author sukbear
 * @create 2019-07-18 15:25
 */
@Slf4j
@Service
public class Services {
    private GreetingsStreams greetingsStreams;
   public Services(GreetingsStreams greetingsStreams){
       this.greetingsStreams = greetingsStreams;
   }
    public void sendGreeting(final Greetings greetings) {
       log.info("send messages {} ",greetings);
        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder.withPayload(greetings).setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
    }
    }
