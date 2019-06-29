package com.kulli.ktdemo.controller

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class SampleControllerTest {

    private val sampleController:SampleController = SampleController()

    @Before
    fun setUp() {
        println("Starting test")
    }

    @Test
    fun helloWorldGet() {
        val result = sampleController.helloWorldGet();
        assertNotNull(result)
    }

    @Test
    fun helloWorldPost() {
       val result = sampleController.helloWorldPost("testValue")
        assertNotNull(result)
    }

    @After
    fun destroy() {
        println("Completed test")
    }
}