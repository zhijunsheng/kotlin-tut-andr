package com.goldenthumb.android.kotlintut

object ChessGame {

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