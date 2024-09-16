package nix.summer.practice.chatbot

import java.text.SimpleDateFormat
import java.util.*

fun main () {
    privitannya()
    enterYourName()
    guessMyAge()
    repeatTo()
    userTest()
}

fun privitannya () {
    val botName = "IMP"
    val sdf = SimpleDateFormat("yyyy")
    val currentDate = sdf.format(Date())
    println("Hello! My name is $botName.\n" +
            "I was created in $currentDate. \n" +
            "Please, remind me your name.")
}

fun enterYourName (Name: String? = readLine()) = println("What a great name you have, $Name!")

fun guessMyAge (){
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val remainder3 = readLine()?.toInt()!! // 1
    val remainder5 = readLine()?.toInt()!! // 4
    val remainder7 = readLine()?.toInt()!! // 5
    val age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105
    println ("Your age is $age; that's a good time to start programming!" +
            "\nI will prove to you that I can count to any number you want:")
}

fun repeatTo () {
    for (i in 0..readLine()?.toInt()!!) println("$i!")
}

fun userTest () {
    println ("1. 2+2 = ...")
    userTestHelper(readln().toInt(),4)
    println ("2. 2+2*2 = ...")
    userTestHelper(readln().toInt(),6)
    println ("3. (2+2/2)*0 = ...")
    userTestHelper(readln().toInt(),0)
    println ("Goodbye, have a nice day!")
}

fun userTestHelper (per1:Int, per2:Int){
    var perem: Int = per1
    while (perem != per2) {
        println ("Please, try again")
        perem = readln().toInt()
    }
    println ("Great, you right!")
}
