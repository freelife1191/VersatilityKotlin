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

    val fruitsBasket1 = Array<Fruit>(3) { _ -> Fruit() }
    val fruitsBasket2 = Array<Fruit>(3) { _ -> Fruit() }

    copyFromTo(fruitsBasket1, fruitsBasket2)

    println(fruitsBasket1[0] == fruitsBasket2[0])
}