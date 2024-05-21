fun main(args: Array<String>) {
    var currentbalance = 10000
    println("Welcome to ATM")
    println("Enter 1 for Check Balance")
    println("Enter 2 for Deposit Money")
    println("Enter 3 for Withdraw Money")
    println("Enter 4 for Exit ATM")

    val a = readLine() ?: ""
    val choice = a.toInt()

    when (choice) {
        1 -> {
            println("Your Current Balance is $currentbalance")
        }

        2 -> {
            println("How Much Money do you Want to Deposit?")
            val b = readLine() ?: ""
            val amount = b.toInt()
            if (amount < 50000) {
                currentbalance = currentbalance + amount
                println("$amount deposit Successfully")
                println("Now you have $currentbalance rs Balance")
            } else {
                println("Amount not Accepted..")
                println("Please type the correct Amount which is Accepted")
            }
        }

            3 -> {
                println("How much Money do you want to Withdraw?")
                val c = readLine() ?: ""
                val money = c.toInt()
                if (money < currentbalance) {

                    currentbalance = currentbalance - money
                    println("$money withdraw Successfully..")
                    println("Now you have $currentbalance rs Balance")
                } else {

                    println("Availabe Balance is low !!")
                    println("Please check the Availabe balance and try Again")
                    println("Thankyou!!")
                }

            }
            4 ->{
                println("Thankyou for using ATM.. Visit Again")
            }
            else->{
                println("Please Choose Correct Option")
            }
        }
    }



