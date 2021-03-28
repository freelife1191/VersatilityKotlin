package chap06.section05

/**
 * 공변성 사용하기
 * Created by KMS on 2021/03/28.
 */
fun main() {
    open class Fruit
    class Banana : Fruit()
    class Orange: Fruit()

    /*
      Fruit의 자식 클래스들을 전달 가능하게 만들기 위하여 from: Array<out Fruit>문법을 사용
      코틀린은 from 레퍼런스에 data가 새로 들어가게 하는 메소드 호출이 없다는 사실을 확인하고 메소드 시그니처가 호출되는 것을 확인하여 이를 검증한다
     */
    fun copyFromTo(from: Array<out Fruit>, to: Array<Fruit>) {
        for (i in 0 until from.size) {
            to[i] = from[i]
        }
    }

    val fruitsBasket = Array<Fruit>(3) { _ -> Fruit() }
    val bananaBasket = Array<Banana>(3) { _ -> Banana() }

    copyFromTo(bananaBasket, fruitsBasket) //OK

    println(bananaBasket[0] == fruitsBasket[0])
}