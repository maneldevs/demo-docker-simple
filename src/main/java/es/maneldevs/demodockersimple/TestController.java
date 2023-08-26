package es.maneldevs.demodockersimple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    String test() {
        String test = "hello world";
        return test;
    }
    
}
