package com.sukbear.kafka.config;

import com.sukbear.kafka.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

/***
 *@ClassName StreamConfig
 *@Description
 * @author sukbear
 * @create 2019-07-18 14:52
 */
@EnableBinding(GreetingsStreams.class)
public class StreamConfig {
}
