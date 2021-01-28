package fractal.code.chess.draw

import fractal.code.chess.Color
import fractal.code.chess.File
import fractal.code.chess.Rank
import fractal.code.chess.Square
import java.awt.Graphics
import javax.swing.JComponent

class ChessBoard : JComponent() {

    private val squareSize = 100

    private val squares: Set<Square> = createAllSquares()

    fun <T, S> Array<T>.cartesianProduct(other: Array<S>): List<Pair<T, S>> {
        return cartesianProduct(other) { first, second -> first to second }
    }

    fun <T, S, V> Array<T>.cartesianProduct(other: Array<S>, transformer: (first: T, second: S) -> V): List<V> {
        return this.flatMap { first -> other.map { second -> transformer.invoke(first, second) } }
    }

    private fun createAllSquares() =
        Rank.values().cartesianProduct(File.values())
            .map {
                Square(
                    it.first,
                    it.second,
                    if ((it.first.crt + it.second.crt) % 2 == 0) Color.BLACK else Color.WHITE
                )
            }
            .toSet()

    private fun Graphics.paintSquare(square: Square) {
        color = when (square.color) {
            Color.BLACK -> java.awt.Color.DARK_GRAY
            Color.WHITE -> java.awt.Color.LIGHT_GRAY
        }

        println(height)
        println(height - (square.rank.crt) * squareSize)
        fillRect((square.file.crt - 1) * squareSize, height - (square.rank.crt) * squareSize, squareSize, squareSize)
    }

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        g.drawRect(0, 0, width - 1, height - 1)

        squares.forEach { g.paintSquare(it) }
    }

}