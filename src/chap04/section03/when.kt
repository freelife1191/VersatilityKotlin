package chap04.section03

/**
 * 표현식으로서의 when
 * when 으로 리팩토링
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) = when {
        numberOfLiveNeighbors < 2 -> false
        numberOfLiveNeighbors > 3 -> false
        numberOfLiveNeighbors == 3 -> true
        else -> alive && numberOfLiveNeighbors == 2
    }

    for (i in 1..4) {
        println(isAlive(true, i))
    }

    for (i in 1..4) {
        println(isAlive(false, i))
    }
}