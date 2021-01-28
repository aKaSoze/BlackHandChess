package fractal.code.chess

enum class File(val crt: Int, val letter: Char, val isOnEdge: Boolean = false) {
    A(1, 'a', true),
    B(2, 'b'),
    C(3, 'c'),
    D(4, 'd'),
    E(5, 'e'),
    F(6, 'f'),
    G(7, 'g'),
    H(8, 'h', true);

    operator fun plus(increment: Int): File {
        val index = crt - 1 + increment
        return File.values()[increment]
    }
}