package com.goldenthumb.android.kotlintut

object ChessGame {
    val pieces = setOf<ChessPiece>()

    fun showBoard(): String {
        var board = ""
        for (i in 0..7) {
            for (i in 0..7) {
                board += " ."
            }
            board += "\n"
        }
        return board
    }
}