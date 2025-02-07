package org.outdu.democonfigclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoConfigClientApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoConfigClientApplication.class, args);
    }

    @Autowired
    Configuration systemConfig;

    @GetMapping("/data")
    public ResponseEntity<String> showProductMsg() {
        return new ResponseEntity<String>("Value of title from Config Server: "+systemConfig.getTitle(), HttpStatus.OK);
    }
}
