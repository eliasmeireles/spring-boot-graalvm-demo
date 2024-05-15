package com.example.demo

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController("/")
class DemoController {

    @GetMapping
    fun hello(): String {
        return "Hello, World!"
    }

    @GetMapping("/health-check")
    fun healthCheck(): ResponseEntity<String> {
        return ResponseEntity.ok("Demo application is running!")
    }
}
