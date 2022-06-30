import java.math.BigDecimal

fun List<BigDecimal>.sum(): BigDecimal {
    if (this.isEmpty()) return "0".toBigDecimal()
    else return this.map { it.toDouble() }.sum().toString().toBigDecimal()
}

/**
 * Example usage
 *
 * Should print 6.0
 */
fun main() {
    val ns = listOf("0.1".toBigDecimal(), "0.9".toBigDecimal(), "5.0".toBigDecimal())

    println(ns.sum())
}

