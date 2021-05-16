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

        if (inputCard != null) {
            if (inputOldTransfer != null) {
                card(inputCard, inputOldTransfer, inputNewTransfer,commission )
            }
        }
        println("Комиссия за пеервод соталвляет: " + card(inputCard, inputOldTransfer, inputNewTransfer,commission ))


    }


}
fun card(inputCard: String? = "VK", inputOldTransfer: String? = "0", inputNewTransfer: Int, commission: Int){
    println(inputOldTransfer)

  commission == when{
       (inputCard == "Master" || inputCard == "Maestro" || inputCard == "Мир" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
           println("Общий размер суммы перевода за месяц превышает 600 000 рублей.")
           0
       }
       (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) ->(inputNewTransfer/100*0.6 + 20)*100
      (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 < 35 -> 35
      (inputCard == "Visa" || inputCard == "Мир") && inputNewTransfer/100*0.75 > 35 -> (inputNewTransfer/100*0.75)*100

      inputCard == "VK" && inputNewTransfer >15000 ->println("Сумму разового перевода превышает 15000 рублей. Операция отклонена!")
      inputCard == "VK" && inputNewTransfer + Integer.parseInt(inputOldTransfer) >45000 ->println("Общая сумма перевода за месяц превышает 45000 рублей. Операция отклонена!")
      else -> "Перевод выполнен успешно!"
  }
}

