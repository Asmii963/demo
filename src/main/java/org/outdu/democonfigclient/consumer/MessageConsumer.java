package org.outdu.democonfigclient.consumer;


import org.outdu.democonfigclient.AlertEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageConsumer {

    @Value("${spring.kafka.template.default-topic}")
    private String topic ;

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Value("spring.kafka.consumer.group-id")
    private String groupId;

    @KafkaListener(topics = "#{topic}", groupId = "alert-mgmt-group")
    public void listen(List<AlertEntity> message) {
        System.out.println("Consumer Received message: " + message);
    }

}