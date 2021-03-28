package chap04.section03

/**
 * 명령문으로써의 when
 * 명령문으로 사용 스트링을 리턴하지 말고 출력
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun printWhatToDo(dayOfWeek: Any) {
        when (dayOfWeek) {
            "Saturday", "Sunday" -> println("Relax")
            in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> println("Work hard")
            in 2..4 -> println("Work hard")
            "Friday" -> println("Party")
            is String -> println("What?")
        }
    }

    printWhatToDo("Sunday") //Relax
    printWhatToDo("Wednesday") //Work hard
    printWhatToDo(3) //Work hard
    printWhatToDo("Friday") //Party
    printWhatToDo("Munday") //What?
    printWhatToDo(8) //

}