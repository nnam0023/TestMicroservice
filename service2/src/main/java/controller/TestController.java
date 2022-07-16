package controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public String test(){
        return "Hello from service 2";
    }
}
