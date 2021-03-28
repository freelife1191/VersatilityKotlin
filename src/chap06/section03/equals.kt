package chap06.section03

/**
 * is 사용하기
 * Animal 클래스는 equals() 메소드가 모든 Animal 클래스의 인스턴스를 동일하게 취급하도록 오버라이드 한다
 * 그런데 Any의 메소드를 오버라이드한 메소드의 시그니처를 보면 전달받은 Any? 타입인 파라미터가 Animal이 아닐 경우 false를 리턴해야 한다
 * Created by KMS on 2021/03/28.
 */
fun main() {
    class Animal {
        override operator fun equals(other: Any?) = other is Animal
    }

    val greet: Any = "hello"
    val odie: Any = Animal()
    val toto: Any = Animal()

    println(odie == greet) //false
    println(odie == toto) //true
}