package com.eric.kotlin

import org.junit.Test
import kotlin.test.assertEquals

class HelloTest {
    @Test fun testAssert() : Unit {
        assertEquals("Hello, world!", getHelloString())
    }
}
