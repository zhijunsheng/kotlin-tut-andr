package com.goldenthumb.android.kotlintut

object ChessGame {
    private val pieces = mutableSetOf<ChessPiece>()

    fun initBoard() {
        for (i in 0..1) {
            pieces.add(ChessPiece(0, 0 + 7 * i, Chessman.Rook, ChessPlayer.Black))
            pieces.add(ChessPiece(7, 0 + 7 * i, Chessman.Rook, ChessPlayer.White))
            pieces.add(ChessPiece(0, 1 + 5 * i, Chessman.Knight, ChessPlayer.Black))
            pieces.add(ChessPiece(7, 1 + 5 * i, Chessman.Knight, ChessPlayer.White))
            pieces.add(ChessPiece(0, 2 + 3 * i, Chessman.Bishop, ChessPlayer.Black))
            pieces.add(ChessPiece(7, 2 + 3 * i, Chessman.Bishop, ChessPlayer.White))
        }
        pieces.add(ChessPiece(0, 3, Chessman.Queen, ChessPlayer.Black))
        pieces.add(ChessPiece(7, 3, Chessman.Queen, ChessPlayer.White))
        pieces.add(ChessPiece(0, 4, Chessman.King, ChessPlayer.Black))
        pieces.add(ChessPiece(7, 4, Chessman.King, ChessPlayer.White))
        for (i in 0..7) {
            pieces.add(ChessPiece(1, i, Chessman.Pawn, ChessPlayer.Black))
            pieces.add(ChessPiece(6, i, Chessman.Pawn, ChessPlayer.White))
        }
    }

    private fun pieceAt(row: Int, col: Int): ChessPiece? = pieces.find { it.row == row && it.col == col }

    override fun toString(): String {
        var board = "  a b c d e f g h\n"
        for (row in 0..7) {
            board += "${8 - row}"
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
            board += " ${8 - row}\n"
        }
        board += "  a b c d e f g h"
        return board
    }

}