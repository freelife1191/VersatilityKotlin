package chap04.section03

/**
 * when과 변수의 스코프
 * 변수의 스코프를 제한하는 것은 좋은 디자인
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun systemInfo(): String =
        when (val numberOfCores = Runtime.getRuntime().availableProcessors()) {
            1 -> "1 core, packing this one to the museum"
            in 2..16 -> "You have $numberOfCores cores"
            else -> "$numberOfCores cores!, I want your machine"
        }

    println(systemInfo())
}