package org.differentCommission

fun main() {

    while (true){
        var commission: Int = 0;
        println("������� �������� ����� �����, ���� ��� VK Pay, �� ������ ������� Enter")
        var inputCard = readLine()
        println("������� ����� ���������� ��������� � ���� ������")
        var inputOldTransfer = readLine()

        println("������� ����� ������ ��������")
        var inputNewTransfer = Integer.parseInt(readLine())

        if (inputCard != null) {
            if (inputOldTransfer != null) {
                card(inputCard, inputOldTransfer, inputNewTransfer,commission )
            }
        }
        println("�������� �� ������� ����������: " + card(inputCard, inputOldTransfer, inputNewTransfer,commission ))


    }


}
fun card(inputCard: String? = "VK", inputOldTransfer: String? = "0", inputNewTransfer: Int, commission: Int){
    println(inputOldTransfer)

  commission == when{
       (inputCard == "Master" || inputCard == "Maestro" || inputCard == "���" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
           println("����� ������ ����� �������� �� ����� ��������� 600 000 ������.")
           0
       }
       (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) ->(inputNewTransfer/100*0.6 + 20)*100
      (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 < 35 -> 35
      (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 > 35 -> (inputNewTransfer/100*0.75)*100

      inputCard == "VK" && inputNewTransfer >15000 ->println("����� �������� �������� ��������� 15000 ������. �������� ���������!")
      inputCard == "VK" && inputNewTransfer + Integer.parseInt(inputOldTransfer) >45000 ->println("����� ����� �������� �� ����� ��������� 45000 ������. �������� ���������!")
      else -> "������� �������� �������!"
  }
}

