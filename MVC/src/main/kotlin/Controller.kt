package mvc

import java.util.*

class Controller {
    fun mainCont(){
        val resources = Model(440, 540, 120, 9, 550)
        val view = View()
        view.output(resources.water,resources.milk,resources.coffeeBeans,resources.disposableCups,resources.money)
        view.hi()
        var q = true
        while (q)
            when (view.writeAction()) {
                "buy", "1" -> {
                    view.whatDoYouWantToBuy()
                    var p = true
                    while (p)
                        when (view.writeAction()) {
                            "espresso", "1" -> {
                                val espresso = Model(250, 0, 16, 1, 4)
                                if ((resources.water > espresso.water)
                                    and (resources.milk > espresso.milk)
                                    and (resources.coffeeBeans > espresso.coffeeBeans)
                                    and (resources.disposableCups > espresso.disposableCups)
                                    and (resources.money > espresso.money)) {
                                    resources.water -= espresso.water
                                    resources.milk -= espresso.milk
                                    resources.coffeeBeans -= espresso.coffeeBeans
                                    resources.disposableCups -= espresso.disposableCups
                                    resources.money += espresso.money
                                    p = false
                                    view.output(
                                        resources.water,
                                        resources.milk,
                                        resources.coffeeBeans,
                                        resources.disposableCups,
                                        resources.money
                                    )
                                    view.hi()
                                } else {
                                    view.notEnough()
                                    p = false
                                    view.hi()
                                }
                            }
                            "latte", "2" -> {
                                val latte = Model(300, 75, 20, 1, 7)
                                if ((resources.water > latte.water)
                                    and (resources.milk > latte.milk)
                                    and (resources.coffeeBeans > latte.coffeeBeans)
                                    and (resources.disposableCups > latte.disposableCups)
                                    and (resources.money > latte.money)) {
                                    resources.water -= latte.water
                                    resources.milk -= latte.milk
                                    resources.coffeeBeans -= latte.coffeeBeans
                                    resources.disposableCups -= latte.disposableCups
                                    resources.money += latte.money
                                    p = false
                                    view.output(
                                        resources.water,
                                        resources.milk,
                                        resources.coffeeBeans,
                                        resources.disposableCups,
                                        resources.money
                                    )
                                    view.hi()
                                } else {
                                    view.notEnough()
                                    p = false
                                    view.hi()
                                }
                            }
                            "cappuccino", "3" -> {
                                val cappuccino = Model(200, 100, 12, 1, 6)
                                if ((resources.water > cappuccino.water)
                                    and (resources.milk > cappuccino.milk)
                                    and (resources.coffeeBeans > cappuccino.coffeeBeans)
                                    and (resources.disposableCups > cappuccino.disposableCups)
                                    and (resources.money > cappuccino.money)) {
                                    resources.water -= cappuccino.water
                                    resources.milk -= cappuccino.milk
                                    resources.coffeeBeans -= cappuccino.coffeeBeans
                                    resources.disposableCups -= cappuccino.disposableCups
                                    resources.money += cappuccino.money
                                    p = false
                                    view.output(
                                        resources.water,
                                        resources.milk,
                                        resources.coffeeBeans,
                                        resources.disposableCups,
                                        resources.money
                                    )
                                    view.hi()
                                } else {
                                    view.notEnough()
                                    p = false
                                    view.hi()
                                }
                            }
                            "back", "4" -> {
                                p = false
                                view.hi()
                            }
                            else -> view.uncorrectInput()
                        }
                }
                "fill", "2" -> {
                    view.fill()
                    val scanner = Scanner(System.`in`)
                    val waterGet = scanner.nextInt()
                    resources.water += waterGet
                    val milkGet = scanner.nextInt()
                    resources.milk+= milkGet
                    val coffeeBeensGet = scanner.nextInt()
                    resources.coffeeBeans += coffeeBeensGet
                    val cups = scanner.nextInt()
                    resources.disposableCups += cups
                    view.output(resources.water,resources.milk,resources.coffeeBeans,resources.disposableCups,resources.money)
                    view.hi() }
                "take", "3" -> {
                    view.take(resources.money)
                    resources.money -= resources.money
                    view.output(resources.water,resources.milk,resources.coffeeBeans,resources.disposableCups,resources.money)
                    view.hi() }
                "remaining", "4" -> {
                    view.output(resources.water,resources.milk,resources.coffeeBeans,resources.disposableCups,resources.money)
                    view.hi()
                }
                "exit", "5" -> q = false
                else -> view.uncorrectInput()
            }
    }
}
