package com.kulli.ktdemo.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello-world/get", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun helloWorldGet(): String {
        println("Received GET request")
        return "Hello World"
    }

    @PostMapping("/hello-word/post/{inputVar}", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun helloWorldPost(@PathVariable inputVar: String): String {
        println("Received POST request : ".plus(inputVar))
        return inputVar;
    }
}