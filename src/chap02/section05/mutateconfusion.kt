package chap02.section05

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    var factor = 2

    fun doubleIt(n: Int) = n * factor
    var message = "The factor is $factor"

    factor = 0

    // factor의 값은 함수가 호출된 시점에 사용되므로 0이다
    println(doubleIt(2))
    println(message)
}