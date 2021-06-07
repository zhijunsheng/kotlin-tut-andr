package com.goldenthumb.android.kotlintut

import org.junit.Test
import org.junit.Assert.*

class Recursion {

    private fun fibo(n: Int): Int {
        if (n < 2) {
            return n
        }
        return fibo(n - 1) + fibo(n - 2)
    }

    @Test
    fun printFibos() {
        for (i in 0..10)
            print("${fibo(i)} ")
        assertEquals(55, fibo(10))
    }

    private fun factorial(n: Int): Int {
        if (n == 0) return 1
        return n * factorial(n - 1)
    }

    @Test
    fun tryFactorial() {
        assertEquals(120, factorial(5))
    }
}

