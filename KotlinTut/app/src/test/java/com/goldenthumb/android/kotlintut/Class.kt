package com.goldenthumb.android.kotlintut

import org.junit.Test
import org.junit.Assert.*

class Class {

    @Test
    fun testChessGame() {
        val chessGame = ChessGame()
        print(chessGame.showBoard())
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

class Game {
    fun showGame() {
        print("here is the game ...")
    }
}