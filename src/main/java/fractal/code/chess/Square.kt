package fractal.code.chess

import java.util.*

class Square(val rank: Rank, val file: File, val color: Color) {
    val isOnEdge: Boolean
        get() = rank.isOnEdge or file.isOnEdge

    val isInCorner: Boolean
        get() = rank.isOnEdge and file.isOnEdge

    fun getDiagonals(): Set<Square> {
        return getDiagonal(1, 1) +
                getDiagonal(-1, -1) +
                getDiagonal(1, -1) +
                getDiagonal(-1, 1)
    }

    private fun getDiagonal(rankIncrement: Int, fileIncrement: Int): Set<Square> {
        val squares = mutableSetOf<Square>()
        var square = this
        while (!square.isOnEdge) {
            square = Square(rank + rankIncrement, file + fileIncrement, color)
            squares += square
        }

        return squares
    }

}