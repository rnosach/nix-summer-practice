package nix.summer.practice.coffeemachine

fun main () {
    stage5()
}

fun stage5 () {
    var waterHas = 400
    var milkHas = 540
    var coffeeBeansHas = 120
    var disposableCupsHas = 9
    var money = 550
    output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
    when (readln()) {
        "buy", "1" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
                when (readln()) {

                "espresso", "1" -> {
                    waterHas -= 250
                    coffeeBeansHas -= 16
                    disposableCupsHas -= 1
                    money += 4
                    output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
                }
                "latte", "2" -> {
                    waterHas -= 300
                    milkHas -= 75
                    coffeeBeansHas -= 20
                    disposableCupsHas -= 1
                    money += 7
                    output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
                }
                "cappuccino", "3" -> {
                    waterHas -= 200
                    milkHas -= 100
                    coffeeBeansHas -= 12
                    disposableCupsHas -= 1
                    money += 6
                    output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
                }
                else -> {}
            }
        }
        "fill", "2" -> {
            println("Write how many ml of water you want to add:")
            val waterGet = readLine()?.toInt()!!
            waterHas += waterGet
            println("Write how many ml of milk you want to add:")
            val milkGet = readLine()?.toInt()!!
            milkHas += milkGet
            println("Write how many grams of coffee beans you want to add:")
            val coffeeBeensGet = readLine()?.toInt()!!
            coffeeBeansHas += coffeeBeensGet
            println("Write how many disposable coffee cups you want to add:")
            val cups = readLine()?.toInt()!!
            disposableCupsHas += cups
            output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
        }
        "take", "3" -> {
            println("I gave you $money")
            money -= money
            output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
        }
        "remaining"-> {
            output(waterHas,milkHas,coffeeBeansHas,disposableCupsHas,money)
        }
    }
}
fun output(water:Int, milk:Int, coffeeBeans:Int, disposableCups:Int, money:Int) {
    println("The coffee machine has:\n" +
            "$water of water\n" +
            "$milk of milk\n" +
            "$coffeeBeans of coffee beans\n" +
            "$disposableCups of disposable cups\n" +
            "$money of money\n\n" +
            "Write action (buy, fill, take):")
}
