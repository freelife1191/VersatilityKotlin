package chap06.section03

/**
 * 스마트 캐스트
 * 코틀린은 참조의 타입이 확인되면 자동 혹은 스마트 캐스팅을 한다
 * is 연산자로 체크를 했기 때문에 자동으로 캐스팅 됨
 * Created by KMS on 2021/03/28.
 */
fun main() {
    class Animal(val age: Int) {
        override operator fun equals(other: Any?):Boolean {
            // Animal 클래스를 변경해서 age를 추가
            // equals() 메소드 안에서 캐스트 없이 otehr.age 라고 바로사용할 수 있다
            return if (other is Animal) age == other.age else false
        }
    }

    val odie = Animal(2)
    val toto = Animal(2)
    val butch = Animal(3)

    println(odie == toto) //true
    println(odie == butch) //false
}