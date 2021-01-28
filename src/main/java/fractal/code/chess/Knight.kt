package fractal.code.chess

class Knight(position: Square, color: Color) : Piece(position, color) {
    override fun calculateValidDestinations(): Set<Square> {

        return setOfNotNull(
                Square(position.rank + 2, position.file + 1, color),
                Square(position.rank + 1, position.file + 2, color))

//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(-2, -1))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(-1, -2))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(1, -2))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(2, -1))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(2, 1))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(1, 2))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(-2, 1))
//        validDestinations.add(currentPosition!!.getSquareByRelativePosition(2, -1))
    }
}