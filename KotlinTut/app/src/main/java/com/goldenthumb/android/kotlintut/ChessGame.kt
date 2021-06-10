package com.goldenthumb.android.kotlintut

object ChessGame {
    val pieces = mutableSetOf<ChessPiece>()

    fun initBoard() {
        for (i in 0..1) {
            pieces.add(ChessPiece(0, 0 + 7 * i, Chessman.Rook, ChessPlayer.Black))
            pieces.add(ChessPiece(0, 1 + 5 * i, Chessman.Knight, ChessPlayer.Black))
        }

    }

    override fun toString(): String {
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