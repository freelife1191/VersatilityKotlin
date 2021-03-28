package chap04.section03

/**
 * when과 변수의 스코프
 * when을 이용해서 시스템의 코어 숫자를 세는 함수
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun systemInfo(): String {

        val numberOfCores = Runtime.getRuntime().availableProcessors()
        println(numberOfCores)

        return when (numberOfCores) {
            1 -> "1 core, packing this one to the museum"
            in 2..16 -> "You have $numberOfCores cores"
            else -> "$numberOfCores cores!, I want your machine"
        }
    }

    println(systemInfo())
}