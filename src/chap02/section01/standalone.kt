package chap02.section02

import java.lang.Exception
import java.lang.RuntimeException

/**
 * 클래스와 함수는 생략 가능하다
 * Created by KMS on 2021/03/21.
 */

fun main() {
    fun nofluff() {
        println("nofluff called...")
        throw RuntimeException("oops")
    }

    println("not in a function, calling nofluff()")

    try {
        nofluff()
    } catch (ex: Exception) {
        val stackTrace = ex.stackTrace
        println(stackTrace[0])
        println(stackTrace[1])
    }
}

