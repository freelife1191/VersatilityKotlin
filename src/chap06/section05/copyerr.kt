package chap06.section05

/**
 * 공변성 사용하기
 * Created by KMS on 2021/03/28.
 */
fun main() {
    open class Fruit
    class Banana : Fruit()
    class Orange: Fruit()

    fun copyFromTo(from: Array<Fruit>, to: Array<Fruit>) {
        for (i in 0 until from.size) {
            to[i] = from[i]
        }
    }

    val fruitsBasket = Array<Fruit>(3) { _ -> Fruit() }
    val bananaBasket = Array<Banana>(3) { _ -> Banana() }

    // copyFromTo(bananaBasket, fruitsBasket) //ERROR: type mismatch

    println(bananaBasket[0] == fruitsBasket[0])
}