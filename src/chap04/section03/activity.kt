package chap04.section03

/**
 * 표현식으로서의 when
 * Any를 파라미터로 받지못하게 해야함
 * 순차적으로 비교해서 처음으로 조건이 만족되는 상태대로 결과가 수행됨
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun whatToDo(dayOfWeek: Any) =  when (dayOfWeek) {
        "Saturday", "Sunday" -> "Relax"
        in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
        in 2..4 -> "Work hard"
        "Friday" -> "Party"
        is String -> "What?"
        else -> "No clue"
    }

    println(whatToDo("Sunday")) //Relax
    println(whatToDo("Wednesday")) //Work hard
    println(whatToDo(3)) //Work hard
    println(whatToDo("Friday")) //Party
    println(whatToDo("Munday")) //What?
    println(whatToDo(8)) //No clue
}