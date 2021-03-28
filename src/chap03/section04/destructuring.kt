package chap03.section04

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun getFullName() = Triple("John", "Quincy", "Adams")

    run {
        //기존 방식
        val result = getFullName()
        val first = result.first
        val middle = result.second
        val last = result.third

        println("$first $middle $last") //John Quincy Adams
    }

    run {
        // 구조분해를 사용
        val (first, middle, last) = getFullName()

        println("$first $middle $last")  //John Quincy Adams
    }

    run {
        // 가운데 속성이 필요없을 때
        val (first, _, last) = getFullName()

        println("$first $last")  //John Adams
    }

    run {
        // 두 개 이상의 속성을 스킵
        val (_, _, last) = getFullName()

        println(last)  //Adams
    }

    run {
        // 아무것도 적지 않으면 이후 값을 무시
        val (_, middle) = getFullName()

        println(middle)  //Quincy
    }
}