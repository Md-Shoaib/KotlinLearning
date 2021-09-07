package whenCon

/*
* Author: Md Shoaib
* Date: 02/09/2021
* Desc:
*/

fun main() {
    var score: Int = 3

//    when (score) {
//        1 -> println("score is 1")
//        2 -> println("score is 2")
//        3 -> {
//            println("You got high score")
//            println("Your score is 3")
//        }
//    }

//    when (score) {
//        1, 2 -> println("score is 1 or maybe 2") // for multiple input
//        3 -> {
//            println("You got high score")
//            println("Your score is 3")
//        }
//    }

//    when (score) {
//        in 5..10 -> println("in range 5 to 10") // When using range
//        3 -> {
//            println("You got high score")
//            println("Your score is 3")
//        }
//    }

    when (score) {
        !in 5..10 -> println("not in range 5 to 10") // When using range and not
        3 -> {
            println("You got high score")
            println("Your score is 3")
        }
    }
}