package com.goldenthumb.android.kotlintut

object ChessGame {
    private val pieces = mutableSetOf<ChessPiece>()

    fun initBoard() {
        for (i in 0..1) {
            pieces.add(ChessPiece(0, 0 + 7 * i, Chessman.Rook, ChessPlayer.Black))
            pieces.add(ChessPiece(0, 1 + 5 * i, Chessman.Knight, ChessPlayer.Black))
        }

    }

    private fun pieceAt(row: Int, col: Int): ChessPiece? = pieces.find { it.row == row && it.col == col }

    override fun toString(): String {
        var board = ""
        for (row in 0..7) {
            for (col in 0..7) {
                val piece = pieceAt(row, col)
                if (piece == null) {
                    board += " ."
                } else {
                    board += " *"
                }
            }
            board += "\n"
        }
        return board
    }

}