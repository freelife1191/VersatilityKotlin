package chap06.section05

/**
 * 반공변성 사용하기
 * Created by KMS on 2021/03/28.
 */
fun main() {
    open class Fruit
    class Banana : Fruit()
    class Orange: Fruit()

    fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
        for (i in 0 until from.size) {
            to[i] = from[i]
        }
    }

    val things = Array<Any>(3) { _ -> Fruit() }
    val bananaBasket = Array<Banana>(3) { _ -> Banana() }

    // 반공변성을 사용하지 않고 Array<Any>를 to 자리에 넣으면 코틀린의 기본 타입 불변성이 보호한다
    // copyFromTo(bananaBasket, things) //ERROR: type mismatch

    println(bananaBasket[0] == things[0])
}