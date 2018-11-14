package com.myexample.mydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

// GET or POST to http://localhost:8080/myapp/hello

@RestController
@RequestMapping("/myapp")
public class HelloController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World from Spring!";
    }

    @PostMapping("/hello")
    public String createTask() {
        return "You just POSTed to /hello";
    }

    // required param
    @GetMapping("/calc")
    public String getIndividualParams(@RequestParam int op1, @RequestParam int op2) {
        return String.format("Answer is : %s", op1 + op2);
    }

    // variable params
    @GetMapping("/vars/{q}/{from}")
    public String getIndividualParams(@PathVariable String from, @PathVariable("q") String query) {
        return String.format("q:%s from:%s", query, from);
    }


}