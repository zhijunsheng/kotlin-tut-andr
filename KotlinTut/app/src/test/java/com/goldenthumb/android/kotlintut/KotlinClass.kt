package com.goldenthumb.android.kotlintut

import org.junit.Test
import org.junit.Assert.*

class KotlinClass {

    private class ChessPiece(val row: Int, val col: Int, val chessman: String)

    @Test
    fun testChessPiece() {
        val piece = ChessPiece(1, 2, "Pawn")
        print("${piece.row}, ${piece.col}, ${piece.chessman}")
    }

    @Test
    fun testChessGame() {
        print(ChessGame.showBoard())
    }

    private class Game {
        fun showGame() {
            print("here is the game ...")
        }
    }

    @Test
    fun playWithClass() {
        val gameA = Game()
        val gameB = Game()

        assertFalse(gameA === gameB)
        assertFalse(gameA == gameB)

        gameA.showGame()
    }
}