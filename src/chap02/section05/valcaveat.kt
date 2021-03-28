package chap02.section05

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val message = StringBuilder("hello ")

    //message = StringBuilder("another") //ERROR

    message.append("there")

    println(message)
}