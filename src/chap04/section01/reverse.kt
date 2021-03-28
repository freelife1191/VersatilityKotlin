package chap04.section01

/**
 * 후방향 반복
 * Created by KMS on 2021/03/21.
 */
fun main() {
    for (i in 5.downTo(1)) { print("$i, ") } //5, 4, 3, 2, 1,

    println()

    // 중위표기법(infix notation) 사용 .과 괄호를 선택사항으로 만듬
    for (i in 5 downTo 1) { print("$i, ") } //5, 4, 3, 2, 1,
}