package chap03.section01

/**
 * 블록바디로 만든 함수
 * {} 블록 바디를 이용해서 함수를 정의하면 항상 리턴타입을 정의해줘야 한다
 * 정의하지 않는다면 리턴타입은 Unit으로 추론된다
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun max(numbers: IntArray): Int {
        var large = Int.MIN_VALUE

        for (number in numbers) {
            large = if (number > large) number else large
        }

        return large
    }

    println(max(intArrayOf(1, 5, 2, 12, 7, 3))) //12
}