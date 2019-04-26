package dev.berlitz.demo.contract;


import dev.berlitz.demo.impl.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

    @Autowired
    private HelloWorld helloWorld;

    @GetMapping("teste")
    public String teste() {
        return helloWorld.getMessage();
    }

}
