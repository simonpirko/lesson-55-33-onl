package by.tms.lesson5533onl.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<String> greeting(@RequestParam("name") String name) {
        return ResponseEntity.ok("Hello " + name);
    }
}
