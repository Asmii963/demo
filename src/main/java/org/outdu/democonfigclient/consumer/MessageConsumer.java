package org.outdu.democonfigclient.consumer;


import org.outdu.democonfigclient.AlertEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageConsumer {

    @Value("${spring.kafka.template.default-topic}")
    String topic ;

    @Value("spring.kafka.consumer.group-id")
    String groupId;

    @KafkaListener(topics = "org.outdu.alertmanagement.alerts", groupId = "alert-management-group")
    public void listen(AlertEntity message) {
        System.out.println("Consumer Received message: " + message);
    }

}