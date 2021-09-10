package myAirlineSeatEnum

/*
* Author: Md Shoaib
* Date: 10/09/2021
* Desc: Airplane Seat reservation using enums
*/

enum class SeatType{
    WINDOW, AISLE, MIDDLE
}

class SeatReservation{
    fun seatPref(seatType: SeatType){
        println("Your seat is, $seatType")
    }
}

fun main() {
    var peter = SeatReservation()
    peter.seatPref(SeatType.AISLE)
}