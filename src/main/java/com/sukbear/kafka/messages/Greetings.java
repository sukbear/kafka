package com.sukbear.kafka.messages;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/***
 *@ClassName Greetings
 *@Description
 * @author sukbear
 * @create 2019-07-18 15:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Greetings {
    private long timestamp;
    private String message;
}
