package chap04.section01

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    // until 마지막 값 건너뛰기
    for (i in 1 until 5) { print("$i, ") } //1, 2, 3, 4,

    println()

    // step을 이용해 건너뛰기
    for (i in 1 until 10 step 3) { print("$i, ") } //1, 4, 7,

    println()

    // 역방향 반복 step로 건너뛰기
    for (i in 10 downTo 0 step 3) { print("$i, ") } //10, 7, 4, 1,

    println()

    // filter를 사용해 3, 5의 배수만 반복
    for (i in (1..9).filter { it % 3 == 0 || it % 5 == 0 }) {
        print("$i, ") //3, 5, 6, 9,
    }

    println()
}