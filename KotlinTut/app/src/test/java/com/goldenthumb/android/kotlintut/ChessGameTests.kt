package com.goldenthumb.android.kotlintut

import org.junit.Test

class ChessGameTests {

    @Test
    fun testToString() {
        ChessGame.initBoard()
        print(ChessGame)
    }
}