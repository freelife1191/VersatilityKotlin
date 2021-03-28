package chap02.section03

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    var factor = 2
    fun doubleIt(n: Int) = n * factor
    factor = 0
    println(doubleIt(2))
}