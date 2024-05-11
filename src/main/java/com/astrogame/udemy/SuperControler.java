package com.astrogame.udemy;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuperControler {

    private static final String template = "Hellor, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/user")
    public AstroControl superControler(@RequestParam(value = "name", defaultValue = "World") String name){
        System.out.println(name);
        return new AstroControl(counter.incrementAndGet(), String.format(template, name));
    }

}