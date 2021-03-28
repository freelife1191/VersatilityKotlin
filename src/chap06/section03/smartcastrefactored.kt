package chap06.section03

/**
 * Created by KMS on 2021/03/28.
 */
fun main() {
    class Animal(val age: Int) {
        override operator fun equals(other: Any?) =
            other is Animal && age == other.age
    }

    val odie = Animal(2)
    val toto = Animal(2)
    val butch = Animal(3)

    println(odie == toto) //true
    println(odie == butch) //false
}