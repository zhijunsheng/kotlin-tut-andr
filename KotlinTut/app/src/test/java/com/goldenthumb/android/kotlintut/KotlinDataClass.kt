package com.goldenthumb.android.kotlintut

import org.junit.Test

class KotlinDataClass {

    private class ChessPieceNormalClass(val row: Int, val col: Int, val chessman: String, val player: String)
    private data class ChessPieceDataClass(val row: Int, val col: Int, val chessman: String, val player: String)

    @Test
    fun testChessPiece() {
        val normalPiece1 = ChessPieceNormalClass(0, 0, "King", "White")
        val normalPiece2 = ChessPieceNormalClass(0, 0, "King", "White")
        print("with normal class: ${normalPiece1 == normalPiece2}\n")

        val dataPiece1 = ChessPieceDataClass(0, 0, "King", "White")
        val dataPiece2 = ChessPieceDataClass(0, 0, "King", "White")
        print("with data class: ${dataPiece1 == dataPiece2}")
    }
}