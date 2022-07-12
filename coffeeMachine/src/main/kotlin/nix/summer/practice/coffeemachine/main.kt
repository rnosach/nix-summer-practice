package nix.summer.practice.coffeemachine

fun main () {
    stage1()
    stage2()
}

fun stage1 () {
    println("Starting to make a coffee in NIX office\n" +
            "Grinding coffee beans\n" +
            "Boiling water\n" +
            "Mixing boiled water with crushed coffee beans\n" +
            "Pouring coffee into the cup\n" +
            "Pouring some milk into the cup\n" +
            "Coffee is ready! Go to work!")
}

fun stage2 () {
    println("How many cups of coffee do you want?")
    val cups = readLine()?.toInt()!!
    val water = cups * 200
    val milk = cups * 50
    val beans = cups * 15
    println("For $cups cups of coffee you will need:\n" +
            "$water ml of water\n" +
            "$milk ml of milk\n" +
            "$beans g of coffee beans")
}
