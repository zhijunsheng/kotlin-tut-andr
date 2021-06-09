package com.goldenthumb.android.kotlintut

import org.junit.Test

class KotlinDataClass {

    private class ChessPieceNormalClass(val row: Int, val col: Int, val chessman: String)
    private data class ChessPieceDataClass(val row: Int, val col: Int, val chessman: String)

    @Test
    fun testChessPiece() {
        val normalPiece1 = ChessPieceNormalClass(0, 0, "King")
        val normalPiece2 = ChessPieceNormalClass(0, 0, "King")
        print("with normal class: ${normalPiece1 == normalPiece2}\n")

        val dataPiece1 = ChessPieceDataClass(0, 0, "King")
        val dataPiece2 = ChessPieceDataClass(0, 0, "King")
        print("with data class: ${dataPiece1 == dataPiece2}\n")

        print("$normalPiece1\n$dataPiece1") // toString()
    }
}