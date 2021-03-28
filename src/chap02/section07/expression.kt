package chap02.section07

/**
 * 코틀린에서 if는 표현식
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun canVote(name: String, age: Int): String {
        val status = if (age > 17) "yes, please vote" else "nope, please come back"

        return "$name, $status"
    }

    println(canVote("Eve", 12))
}