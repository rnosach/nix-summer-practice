package nix.summer.practice.coffeemachine

fun main () {
    stage4()
}

fun stage4 () {
    output(0,0,0,0,0)
    when (readln()) {
        "buy", "1" -> {
            println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
            when (readln()) {
                "espresso", "1" -> output(250,0,16,1,-4)
                "latte", "2" -> output(350,75,20,1,-7)
                "cappuccino", "3" -> output(200,100,12,1,-6)
            }
        }
        "fill", "2" -> {
            println("Write how many ml of water you want to add:")
            val waterGet = readLine()?.toInt()!!
            println("Write how many ml of milk you want to add:")
            val milkGet = readLine()?.toInt()!!
            println("Write how many grams of coffee beans you want to add:")
            val coffeeBeensGet = readLine()?.toInt()!!
            println("Write how many disposable coffee cups you want to add:")
            val cups = readLine()?.toInt()!!
            output(-waterGet,-milkGet,-coffeeBeensGet,-cups,0)
        }
        "take", "3" -> output(0,0,0,0,550)
    }
}

fun output(water:Int, milk:Int, coffeeBeans:Int, disposableCups:Int, money:Int) {
    val waterHas = 400 - water
    val milkHas = 540 - milk
    val coffeeBeansHas = 120 - coffeeBeans
    val disposableCupsHas = 9 - disposableCups
    val moneyS = 550 - money

    println("The coffee machine has:\n" +
            "$waterHas of water\n" +
            "$milkHas of milk\n" +
            "$coffeeBeansHas of coffee beans\n" +
            "$disposableCupsHas of disposable cups\n" +
            "$moneyS of money\n\n" +
            "Write action (buy, fill, take):")
}
