package chap04.section03

/**
 * 표현식으로서의 when
 * if 사용
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
        if (numberOfLiveNeighbors < 2) { return false }
        if (numberOfLiveNeighbors > 3) { return false }
        if (numberOfLiveNeighbors == 3) { return true }
        return alive && numberOfLiveNeighbors == 2
    }

    for (i in 1..4) {
        println(isAlive(true, i))
    }

    for (i in 1..4) {
        println(isAlive(false, i))
    }
}