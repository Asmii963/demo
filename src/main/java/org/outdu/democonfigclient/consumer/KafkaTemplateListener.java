package org.outdu.democonfigclient.consumer;

import org.outdu.democonfigclient.AlertEntity;
import org.springframework.kafka.core.KafkaTemplate;

public class KafkaTemplateListener implements KafkaTemplate<String,String> {

    @Override
    public void onMessage(AlertEntity record) {
        System.out.println("RECORD PROCESSING: " + record);
    }
}
