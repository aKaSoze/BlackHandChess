package fractal.code.chess

class Bishop(position: Square, color: Color) : Piece(position, color) {
    override fun calculateValidDestinations(): Set<Square> {
        return position.getDiagonals()
    }
}