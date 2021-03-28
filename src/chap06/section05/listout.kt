package chap06.section05

/**
 * 타입 불변성
 * Created by KMS on 2021/03/28.
 */
fun main() {
    open class Fruit
    class Banana : Fruit()
    class Orange: Fruit()

    /*
      Array<T>는 뮤터블하지만 List<T>는 이뮤터블하다
      List<out T>로 선언 가변성 정의가 되어있기 때문에 List<Banana>를 receiveFruits() 메소드에 전달할 수 있는 권한을 얻을 수 있다
      List<out T>는 코틀린에게 receiveFruits()를 비롯해 이와 유사한 모든 메소드들에서 List<T>에 변경이나 추가가 없다는 것을 보장해준다
     */
    fun receiveFruits(fruits: List<Fruit>) {
        println("Number of fruits: ${fruits.size}")
    }

    val bananas: List<Banana> = listOf()
    receiveFruits(bananas) //OK
}