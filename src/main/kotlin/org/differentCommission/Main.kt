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

        commission(inputCard, inputOldTransfer, inputNewTransfer,commission )


    }


}


fun commission(inputCard: String?, inputOldTransfer: String?, inputNewTransfer: Int, commission: Int) {

  when{
       (inputCard == "Master" || inputCard == "Maestro" || inputCard == "���" || inputCard == "Visa" ) && (Integer.parseInt(inputOldTransfer) + inputNewTransfer > 600000) -> {
           println("����� ������ ����� �������� �� ����� ��������� 600 000 ������.")

       }
       (inputCard == "Master" || inputCard == "Maestro") && (75000 < Integer.parseInt(inputOldTransfer) + inputNewTransfer &&  Integer.parseInt(inputOldTransfer) + inputNewTransfer < 600000) -> println("�������� ���������� " + String.format("%.0f",(inputNewTransfer/100*0.6 + 20)*100) + " ������")
      (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 < 35 -> println("�������� ���������� " + 35*100 + " ������")
      (inputCard == "Visa" || inputCard == "���") && inputNewTransfer/100*0.75 > 35 -> println("�������� ���������� " + String.format("%.0f",inputNewTransfer/100*0.75*100) + " ������")

      inputCard == "VK" && inputNewTransfer >15000 ->println("����� �������� �������� ��������� 15000 ������. �������� ���������!")
      inputCard == "VK" && inputNewTransfer + Integer.parseInt(inputOldTransfer) > 45000 ->println("����� ����� �������� �� ����� ��������� 45000 ������. �������� ���������!")
      else -> println("�������� ���������� 0 ������.")
  }
}


