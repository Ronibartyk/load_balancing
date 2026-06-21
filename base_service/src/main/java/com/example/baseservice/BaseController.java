package com.example.baseservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

// TODO: Annotate this class as a REST Controller to handle HTTP requests
##
public class BaseController {

    // TODO: Inject the unique instance name from application.properties
    @Value(##)
    private String serviceIdentity;

    // TODO: Map this method to handle GET requests at "/api/hello"
    ##
    public Map<String, String> sayHello() {
        return Map.of(
                "message", "Hello World!",
                "source", ## // TODO: Return the injected serviceIdentity here
        );
    }
}