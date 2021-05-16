package org.differentCommission

fun main() {

    while (true){
        var commission: Int = 0;
        println("Введите название вашей карты, если она VK Pay, то просто нажмите Enter")
        var inputCard = readLine()
        println("Введите сумму предыдущих переводов в этом месяце")
        var inputOldTransfer = readLine()

        println("Введите сумму нового перевода")
        var inputNewTransfer = Integer.parseInt(readLine())

        commission(inputCard, inputOldTransfer, inputNewTransfer,commission )


    }


}


fun commission(inputCard: String?, inputOldTransfer: String?, inputNewTransfer: Int, commission: Int) {

  when{
       (inputCard == "Master" || inputCard == "Maestro" || inputCard == "Мир" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
           println("Общий размер суммы перевода за месяц превышает 600 000 рублей.")

       }
       (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) -> println("Комиссия составляет " + String.format("%.0f",(inputNewTransfer/100*0.6 + 20)*100) + " копеек")
      (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 < 35 -> println("Комиссия составляет " + 35*100 + " копеек")
      (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 > 35 -> println("Комиссия составляет " + String.format("%.0f",inputNewTransfer/100*0.75*100) + " копеек")

      inputCard == "VK" && inputNewTransfer >15000 ->println("Сумму разового перевода превышает 15000 рублей. Операция отклонена!")
      inputCard == "VK" && inputNewTransfer + Integer.parseInt(inputOldTransfer) > 45000 ->println("Общая сумма перевода за месяц превышает 45000 рублей. Операция отклонена!")
      else -> println("Комиссия составляет 0 копеек.")
  }
}


