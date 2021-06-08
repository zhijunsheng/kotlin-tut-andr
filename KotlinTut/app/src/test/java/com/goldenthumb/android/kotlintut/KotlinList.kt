package com.goldenthumb.android.kotlintut

import org.junit.Test

class KotlinList {

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