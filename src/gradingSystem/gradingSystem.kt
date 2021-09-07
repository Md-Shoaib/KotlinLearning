package gradingSystem

/*
* Author: Md Shoaib
* Date: 02/09/2021
* Desc: Basic Grading System
*/

fun main() {
    var myScore: Int = 95
    val passingScore: Int = 40


    if (myScore > 90){
        println("Your Grade is A and your score is $myScore")
    } else if (myScore > 75) {
        println(" Your grade is B and your score is $myScore")
    } else if (myScore > 60){
        println("Your grade is C and your score is $myScore")
    } else if (myScore > 40){
        println("Your grade is D and your score is $myScore")
    } else {
        println("You didn't performed well in the test")
    }
}