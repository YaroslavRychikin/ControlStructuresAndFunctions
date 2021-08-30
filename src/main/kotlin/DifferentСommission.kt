fun main(){
    val amount = "70000"
    val bankCard = "Maestro"
    val theAmountOfPreviousTransfersInThisMonth = 7500000
    val result = calculationOfTheCommission(bankCard, amount,
        theAmountOfPreviousTransfersInThisMonth)
    print("Комиссия: $result")
}

fun calculationOfTheCommission(bankCard: String = "VK Pay", amount: Int,
                               theAmountOfPreviousTransfersInThisMonth: Int = 0)
    = when(bankCard){
    "Mastercard", "Maestro" -> if (theAmountOfPreviousTransfersInThisMonth + amount <= 75000*100) "нет комисси"
        else "${(amount * 0.006 + 20 * 100).toInt()} копеек"
    "Visa", "Мир" -> if (amount * 0.0075 > 35*100) "${(amount * 0.0075).toInt()} копеек" else "${35 * 100} копеек"
    "VK Pay" -> "нет комисси"
    else -> "такие карты или счета не принимаються"
}
