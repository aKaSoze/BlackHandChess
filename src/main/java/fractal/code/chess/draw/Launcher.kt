package fractal.code.chess.draw

import javax.swing.JFrame


fun main() {
    val window = JFrame()
    window.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    window.setBounds(50, 50, 1300, 900)
    window.layout = null
    val cb = ChessBoard()
    cb.setBounds(250, 50, 800, 800)
    window.contentPane.add(cb)
    window.isVisible = true
}