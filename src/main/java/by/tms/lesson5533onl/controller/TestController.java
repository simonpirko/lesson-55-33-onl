package by.tms.lesson5533onl.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
public class TestController {

    @PostMapping("/upload")
    public String upload(@RequestParam("file") MultipartFile file) {

        System.out.println(file.getOriginalFilename());
        return "Hello World!";
    }
}
