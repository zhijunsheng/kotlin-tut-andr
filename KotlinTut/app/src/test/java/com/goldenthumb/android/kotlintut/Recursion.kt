package com.goldenthumb.android.kotlintut

import org.junit.Test
import org.junit.Assert.*

class Recursion {

    private fun factorial(n: Int): Int {
        if (n == 0) return 1
        return n * factorial(n - 1)
    }

    @Test
    fun tryFactorial() {
        assertEquals(120, factorial(5))
    }
}

