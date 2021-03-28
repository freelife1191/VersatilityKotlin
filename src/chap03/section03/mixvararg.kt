package chap03.section03

/**
 * 여러 개의 인자
 * vararg 파라미터를 마지막 파라미터로 넣기를 강력히 추천
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun greetMany(msg: String, vararg names: String) {
        println("$msg ${names.joinToString(", ")}")
    }

    greetMany("Hello", "Tom", "Jerry", "Spike") //Hello Tom, Jerry, Spike
}