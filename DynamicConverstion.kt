val currencies = mapOf<String, Double>(
    "RONtoEUR" to 0.2, "RONtoUSD" to 0.25, "RONtoGBP" to 0.17,
    "EURtoRON" to 5.0, "EURtoUSD" to 1.21, "EURtoGBP" to 0.86,
    "USDtoRON" to 4.0, "USDtoEUR" to 0.83, "USDtoGBP" to 0.71,
    "GBPtoRON" to 5.88, "GBPtoEUR" to 1.16, "GBPtoUSD" to 1.41
)

fun convert(fromCurrency: String, toCurrency: String, amount: Double): Double {
    if (fromCurrency == toCurrency) return amount
    val conversionRate = currencies["${fromCurrency}to${toCurrency}"] ?: throw Exception()
    return amount * conversionRate
}
