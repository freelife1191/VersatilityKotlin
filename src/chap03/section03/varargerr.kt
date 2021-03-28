package chap03.section03

/**
 * 스프레드 연산자
 * Created by KMS on 2021/03/21.
 */
fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE

    for (number in numbers) {
        large = if (number > large) number else large
    }

    return large
}

val values = intArrayOf(1, 21, 3)
//vararg 파라미터를 배열로 넘기면 에러가 발생한다
//println(max(values)) //ERROR
//type mismatch: inferred type is IntArray but Int was expected