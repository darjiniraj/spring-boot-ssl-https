package in.niraj.spring.springbootsslhttps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by niraj on Aug, 2018
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World !!";
    }
}
