package chap06.section03

/**
 * when과 함께 타입 체크와 스마트 캐스트 사용하기
 * when 명령문 또는 표현식에서 is나 !is 스마트 캐스팅을 사용할 수 있다
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun whatToDo(dayOfWeek: Any) =  when (dayOfWeek) {
        "Saturday", "Sunday" -> "Relax"
        in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
        in 2..4 -> "Work hard"
        "Friday" -> "Party"
        is String -> "What, you provided a string of length ${dayOfWeek.length}" //아무런 캐스팅 없이 String의 속성이나 메소드를 사용
        else -> "No clue"
    }

    println(whatToDo("Sunday")) //Relax
    println(whatToDo("Munday")) //What?
}