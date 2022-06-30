class Fraction(numerator: Int, denominator: Int) {
    val numerator: Int
    val denominator: Int

    init {
        val gcd = findGCD(numerator, denominator)
        this.numerator = numerator / gcd
        this.denominator = denominator / gcd
    }

    fun findGCD(num1: Int, num2: Int): Int {
        var n1 = num1
        var n2 = num2
        while (n1 != n2) {
            if (n1 > n2)
                n1 -= n2
            else
                n2 -= n1
        }
        return n1
    }

    override fun toString(): String = "$numerator/$denominator"

}
