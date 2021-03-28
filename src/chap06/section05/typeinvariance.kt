package chap06.section05

/**
 * 타입 불변성
 * Created by KMS on 2021/03/28.
 */
fun main() {
    open class Fruit
    class Banana : Fruit()
    class Orange: Fruit()

    fun receiveFruits(fruits: Array<Fruit>) {
        println("Number of fruits: ${fruits.size}")
    }

    val bananas: Array<Banana> = arrayOf()
    // receiveFruits(bananas) //ERROR: type mismatch
}