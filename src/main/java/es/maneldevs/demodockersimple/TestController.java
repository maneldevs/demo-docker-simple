package es.maneldevs.demodockersimple;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final T1Repository repo;

    @GetMapping
    String test() {
        String test = "hello world!";
        return test;
    }

    @GetMapping("test1")
    List<T1> test1() {
        return repo.findAll();
    }
    
}
