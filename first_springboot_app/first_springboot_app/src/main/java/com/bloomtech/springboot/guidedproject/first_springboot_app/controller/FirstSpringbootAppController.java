package com.bloomtech.springboot.guidedproject.first_springboot_app.controller;

// This class will hold controllers for our server

import com.bloomtech.springboot.guidedproject.first_springboot_app.model.theDataForRequest;
import org.springframework.web.bind.annotation.*;

// Data may be sent with an HTTP request:
//
// GET or DELETE request - data is in a URL query parameter (?name=value)
//
// POST or PUT request - data is in the request body @RequestBody
//      HTTP request typically have JSON formatted data in the request body
//      Java uses objects
//
//      The server automatically converts JSON to/from objects
//
// In Postman you must put any data for a POST in the request body before you send request


@RestController // Tells the server there are REST controller methods in this class
public class FirstSpringbootAppController {

    // Define a method to handle HTTP GET requests for the root URL path ("/")
    @GetMapping(value="/") // The method that follows will handle HTTP GET requests for "/"
    public String rootPathMethod() { // The method name doesn't matter
        System.out.println("The method for GET with path '/' was executed");
        return "Root path method was called";
    }

    // Define a method to handle HTTP GET requests for URL path "/startrek"
    //      with a query parameter of "character=whoTheyAre"
    // To access data in a query parameter - use @RequestParam annotation
    //      in the method parameter list
    //
    // @RequestParam data-type name-of-query-parameter
    //
    @GetMapping(value="/startrek")
    public String anyNameYouWant(@RequestParam String whoTheyAre) {
        System.out.println("Controller method for GET with '/startrek' was run");
        return "Star Trek method was called with parameter value: " + whoTheyAre;
    }

    // Define a method to handle HTTP GET requests for URL path "/startrek/spock"
    @GetMapping(value="/startrek/spock")
    public String anyNameYouWant2() {
        System.out.println("Controller method for GET with '/startrek/spock' was run");
        return "Live long and prosper.";
    }

    // Define a method to handle HTTP POST requests for URL path "/"
    // @RequestBody allows access to data in the request body
    //
    // @RequestBody class-name (same as data-type) object-name
    @PostMapping(value="/")
    public String wilberPost(@RequestBody theDataForRequest dataPassedIn) {
        System.out.println("Controller method for POST with '/' was run");
        System.out.println("The data sent with the request was: " + dataPassedIn);
        return "Mr. Ed was a talking horse on TV in the 1960's";
    }
}
