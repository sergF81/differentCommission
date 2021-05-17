package org.differentCommission

fun main() {
    println(commission(30000,"5000", "Maestro"))

}


fun commission(inputNewTransfer: Int, inputOldTransfer: String? = "0", inputCard: String? = "VK"): String? {

    return when{
        inputCard == "VK" && inputNewTransfer >15000 ->"Сумму разового перевода превышает 15000 рублей. Операция отклонена!"
        inputCard == "VK" && (inputNewTransfer + Integer.parseInt(inputOldTransfer)) > 45000 ->"Общая сумма перевода за месяц превышает 45000 рублей. Операция отклонена!"
        (inputCard == "Master" || inputCard == "Maestro" || inputCard == "Мир" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
                println("Общий размер суммы перевода за месяц превышает 600 000 рублей.").toString()

        }
        (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) -> String.format("%.0f",(inputNewTransfer/100*0.6 + 20)*100)
        (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 < 35 ->"Комиссия составляет " + 35*100 + " копеек"
        (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 > 35 -> "Комиссия составляет " + String.format("%.0f",inputNewTransfer/100*0.75*100) + " копеек"

        else -> "Комиссия составляет 0 копеек. "
    }
}

