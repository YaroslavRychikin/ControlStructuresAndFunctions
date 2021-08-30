import org.junit.Test

import org.junit.Assert.*

class DifferentCommissionKtTest {

    @Test
    fun calculationOfTheCommission_noCommissionWithMaestro() {
        val amount = 600_000
        val bankCard = "Maestro"
        val theAmountOfPreviousTransfersInThisMonth = 740000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("нет комисси", result)
    }

    @Test
    fun calculationOfTheCommission_noCommissionWithMastercard() {
        val amount = 600_000
        val bankCard = "Mastercard"
        val theAmountOfPreviousTransfersInThisMonth = 740000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("нет комисси", result)
    }

    @Test
    fun calculationOfTheCommission_noCommissionWithVKPay() {
        val amount = 600_000
        val bankCard = "VK Pay"
        val theAmountOfPreviousTransfersInThisMonth = 740000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("нет комисси", result)
    }

    @Test
    fun calculationOfTheCommission_getCommissionWithMaestro() {
        val amount = 600_000
        val bankCard = "Maestro"
        val theAmountOfPreviousTransfersInThisMonth = 7500000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("5600 копеек", result)
    }

    @Test
    fun calculationOfTheCommission_getCommissionWithMastercard() {
        val amount = 600_000
        val bankCard = "Mastercard"
        val theAmountOfPreviousTransfersInThisMonth = 7500000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("5600 копеек", result)
    }

    @Test
    fun calculationOfTheCommission_getCommissionWithVisa() {
        val amount = 600_000
        val bankCard = "Visa"
        val theAmountOfPreviousTransfersInThisMonth = 750000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("4500 копеек", result)
    }

    @Test
    fun calculationOfTheCommission_getCommissionWithWorld() {
        val amount = 600_000
        val bankCard = "Мир"
        val theAmountOfPreviousTransfersInThisMonth = 750000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("4500 копеек", result)
    }

    @Test
    fun calculationOfTheCommission_theMinimumCommissionForWorld() {
        val amount = 45_000
        val bankCard = "Мир"
        val theAmountOfPreviousTransfersInThisMonth = 750000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("3500 копеек", result)
    }

    @Test
    fun calculationOfTheCommission_theMinimumCommissionForVisa() {
        val amount = 45_000
        val bankCard = "Visa"
        val theAmountOfPreviousTransfersInThisMonth = 750000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("3500 копеек", result)
    }

    @Test
    fun calculationOfTheCommission_variantElse() {
        val amount = 600_000
        val bankCard = "Alpha"
        val theAmountOfPreviousTransfersInThisMonth = 740000
        val result = calculationOfTheCommission(bankCard = bankCard, amount = amount,
            theAmountOfPreviousTransfersInThisMonth = theAmountOfPreviousTransfersInThisMonth)
        assertEquals("такие карты или счета не принимаються", result)
    }

    @Test
    fun calculationOfTheCommission_notAddData() {
        val amount = 600_000
        val result = calculationOfTheCommission(amount = amount)
        assertEquals("нет комисси", result)
    }
}