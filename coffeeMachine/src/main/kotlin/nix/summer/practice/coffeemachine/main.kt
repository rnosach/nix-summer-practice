package nix.summer.practice.coffeemachine

fun main () {
    stage3()
}

fun stage3 () {
    println("Write how many ml of water the coffee machine has:")
    val waterHas = readLine()?.toInt()!!
    println("Write how many ml of milk the coffee machine has:" )
    val milkHas = readLine()?.toInt()!!
    println("Write how many grams of coffee beans the coffee machine has:")
    val beansHas = readLine()?.toInt()!!

    println("How many cups of coffee do you want?")
    val cups = readLine()?.toInt()!!
    val waterNeed = 200
    val milkNeed = 50
    val beansNeed = 15

    if (cups > cups(waterHas,milkHas, beansHas)) println("No, I can make only ${cups(waterHas,milkHas, beansHas)} cups of coffee")
    else if ((waterHas in waterNeed .. 399) and (milkHas in milkNeed .. 99) and (beansHas in beansNeed .. 29))
        println("Yes, I can make that amount of coffee")
    else if ((waterHas >= waterNeed*2) and (milkHas >= milkNeed*2) and (beansHas >= beansNeed*2))
        println("Yes, I can make that amount of coffee (and even ${cups(waterHas,milkHas, beansHas) - cups} more than that)")
}

fun cups(per1: Int, per2: Int, per3: Int): Int {
    val a = per1 / 200
    val b = per2 / 50
    val c = per3 / 15
    return minOf(a, b, c)
}
