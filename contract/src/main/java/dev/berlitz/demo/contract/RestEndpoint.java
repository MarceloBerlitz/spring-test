package dev.berlitz.demo.contract;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndpoint {

    @GetMapping("teste")
    public String teste() {
        return "Hello palavra";
    }

}
