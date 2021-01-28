package fractal.code.chess

enum class Rank(val crt: Int, val isOnEdge: Boolean = false) {
    ONE(1, true), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8, true);

    operator fun plus(increment: Int): Rank {
        val index = crt - 1 + increment
        return Rank.values()[increment]
    }
}