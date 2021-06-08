package com.goldenthumb.android.kotlintut

import org.junit.Test
import kotlin.random.Random

class KotlinList {

    @Test
    fun findSecondLargest() {
        val numbers = mutableListOf<Int>()
        for (i in 0..9) {
            numbers.add(Random.nextInt(100))
        }
        print(numbers)

        var max: Int = Int.MIN_VALUE
        var sec: Int = Int.MIN_VALUE
        for (number in numbers) {
            if (number > max) {
                sec = max
                max = number
            } else if (number > sec) {
                sec = number
            }
        }
        print(" second = $sec")
    }

    @Test
    fun tryList() {
        val chessmen = mutableListOf("King", "Queen")
        chessmen.add("Bishop")
        chessmen.add("Knight")
        chessmen.remove("King")

        for (i in 0 until chessmen.size) {
            print("${chessmen[i]} ")
        }
        print("\n")

        for (chessman in chessmen) {
            print("$chessman ")
        }
    }
}