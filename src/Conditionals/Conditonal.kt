package Conditionals

/*
* Author: Md Shoaib
* Date: 02/09/2021
* Desc: Conditionals statement Program
*/

fun main() {
//    Creating Variable
    val highScore: Int = 200
    var currentScore: Int = 200
//    Condition
    if (currentScore < highScore) {
        println("You missed the high score")
    } else if (currentScore == highScore) {
        println("You are exactly on highScore")
    } else {
        println("Congrats on high score")
    }
}

