package mvc

open class View {

    fun output(water:Int, milk:Int, coffeeBeans:Int, disposableCups:Int, money:Int) {
        println("The coffee machine has:\n" +
                "$water of water\n" +
                "$milk of milk\n" +
                "$coffeeBeans of coffee beans\n" +
                "$disposableCups of disposable cups\n" +
                "$money of money\n")
    }

    fun hi() {
        println("Write action (buy/1, fill/2, take/3, remaining/4, exit/5)")
    }

    fun whatDoYouWantToBuy() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - 4:")
    }

    fun writeAction(): String = readln()

    fun fill() {
        println("Write how many:\n" +
                "- ml of water you want to add:\n" +
                "- ml of milk you want to add:\n" +
                "- grams of coffee beans you want to add:\n" +
                "- disposable coffee cups you want to add:")
    }

    fun take(a:Int) {
        println("I gave you $a")
    }

    fun uncorrectInput( ){
        println("Please, choose the correct option")
    }

    fun notEnough() {
        println("not enough ingredients")
    }
}
