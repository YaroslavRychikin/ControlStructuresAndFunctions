fun main(){
    val amount = 750000
    val bankCard = "Maestro"
    val theAmountOfPreviousTransfersInThisMonth = 740000
    print("Комиссия: ${calculationOfTheCommission(bankCard, amount, 
        theAmountOfPreviousTransfersInThisMonth)}")
}

fun calculationOfTheCommission(bankCard: String = "Vk Pay", amount: Int,
                               theAmountOfPreviousTransfersInThisMonth: Int = 0)
    = when(bankCard){
    "Mastercard", "Maestro" -> if (theAmountOfPreviousTransfersInThisMonth + amount <= 75000*100) "нет комисси"
        else "${(amount * 0.006 + 20 * 100).toInt()} копеек"
    "Visa", "Мир" -> if (amount * 0.0075 > 35*100) "${(amount * 0.0075).toInt()} копеек" else "${35 * 100} копеек"
    else -> "нет комисии"
}
