package org.outdu.democonfigclient;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("notificationmanagement")
@org.springframework.context.annotation.Configuration
public class Configuration {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}