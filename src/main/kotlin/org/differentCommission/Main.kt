package org.differentCommission

fun main() {
    print(commission(30000, 60000, "Maestro"))
}

fun commission(inputNewTransfer: Int, inputOldTransfer: Int = 0, inputCard: String = "VK"): Any =
    when (inputCard) {

        "Master", "Maestro" -> {
            if (75000 < (inputOldTransfer + inputNewTransfer) && (inputOldTransfer + inputNewTransfer) < 600000) {
                ((inputNewTransfer / 100 * 0.6 + 20) * 100).toInt()
            } else 0
        }
        "Visa", "Мир" -> {
            if (inputNewTransfer / 100 * 0.75 < 35) {
                35 * 100
            } else {
                (inputNewTransfer / 100 * 0.75 * 100).toInt()
            }
        }
        else -> 0
    }


