package com.goldenthumb.android.kotlintut

import org.junit.Test
import java.util.*

class RandomNumbers {

    @Test
    fun maxOfRandomNumbers() {
        var m = Int.MIN_VALUE
        for (i in 0..9) {
            val ranInt = Random().nextInt() % 100
            print("$ranInt ")
            if (ranInt > m) {
                m = ranInt
            }
        }
        print(" max = $m")
    }
}

