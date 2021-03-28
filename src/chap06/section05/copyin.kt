package chap06.section05

/**
 * 반공변성 사용하기
 * Created by KMS on 2021/03/28.
 */
fun main() {
    open class Fruit
    class Banana : Fruit()
    class Orange: Fruit()

    /**
     * in 키워드는 메소드가 파라미터에 값을 설정할 수 있게 만들고 값을 읽을 수 없게 만든다
     */
    fun copyFromTo(from: Array<out Fruit>, to: Array<in Fruit>) {
        for (i in 0 until from.size) {
            to[i] = from[i]
        }
    }

    val things = Array<Any>(3) { _ -> Fruit() }
    val bananaBasket = Array<Banana>(3) { _ -> Banana() }

    copyFromTo(bananaBasket, things) //OK

    println(bananaBasket[0] == things[0])
}