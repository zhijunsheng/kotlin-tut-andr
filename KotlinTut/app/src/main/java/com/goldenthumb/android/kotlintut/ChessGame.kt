package com.goldenthumb.android.kotlintut

object ChessGame {
    private val pieces = mutableSetOf<ChessPiece>()

    fun initBoard() {
        for (i in 0..1) {
            pieces.add(ChessPiece(0, 0 + 7 * i, Chessman.Rook, ChessPlayer.Black))
            pieces.add(ChessPiece(7, 0 + 7 * i, Chessman.Rook, ChessPlayer.White))
            pieces.add(ChessPiece(0, 1 + 5 * i, Chessman.Knight, ChessPlayer.Black))
        }

    }

    private fun pieceAt(row: Int, col: Int): ChessPiece? = pieces.find { it.row == row && it.col == col }

    override fun toString(): String {
        var board = ""
        for (row in 0..7) {
            for (col in 0..7) {
                val piece = pieceAt(row, col)
                board += " "
                board += when (piece?.chessman) {
                    null -> "."
                    Chessman.King -> if (piece.player == ChessPlayer.Black) "K" else "k"
                    Chessman.Queen -> if (piece.player == ChessPlayer.Black) "Q" else "q"
                    Chessman.Rook -> if (piece.player == ChessPlayer.Black) "R" else "r"
                    Chessman.Bishop -> if (piece.player == ChessPlayer.Black) "B" else "b"
                    Chessman.Knight -> if (piece.player == ChessPlayer.Black) "N" else "n"
                    Chessman.Pawn -> if (piece.player == ChessPlayer.Black) "P" else "p"
                }
            }
            board += "\n"
        }
        return board
    }

}