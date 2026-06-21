package com.example.consumerservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ConsumerController {

    // TODO: Initialize the RestClient to point directly to your local Load Balancer (Port 8080)
    private final RestClient restClient = ##;

    @GetMapping("/consume")
    public String invokeBaseService() {
        // TODO: Send a GET request to "/api/hello" through the LB and retrieve the response as a String
        return ##;
    }
}