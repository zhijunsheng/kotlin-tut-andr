package com.goldenthumb.android.kotlintut

import org.junit.Test
import org.junit.Assert.*

class SwapTwoNumbers {

    @Test
    fun swapTwoNumbers() {
        var a = 3
        var b = 5
        assertEquals(3, a)
        assertEquals(5, b)

        // here is our swapping code

        assertEquals(5, a)
        assertEquals(3, b)
    }
}