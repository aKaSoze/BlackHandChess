package fractal.code.chess

abstract class Piece(var position: Square, val color: Color) {

    fun isValidMove(destinationPosition: Square): Boolean {
        return calculateValidDestinations().contains(destinationPosition)
    }

    protected abstract fun calculateValidDestinations(): Set<Square>
}