package com.example.mathservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Create a controller
//Sprintboot to expose one Rest API end point

@RestController
public class MathController {
    //@GetMapping("/add/{n1}/{n2}")
    public int add(@PathVariable int n1,@PathVariable int n2){
        return n1 + n2;
    }

    @GetMapping("/add/{number1}/{number2}")
    public Response addSum(@PathVariable int number1,@PathVariable int number2){
        return new Response(number1,number2,number1 + number2 );
    }
}
