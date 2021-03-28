package chap05.section03

/**
 * Created by KMS on 2021/03/21.
 */
fun main() {
    val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")

    println(friends::class) //class kotlin.Array
    println(friends.javaClass) //class [Ljava.lang.String;
    println("${friends[0]} and ${friends[1]}") //Tintin and Snowy

    run {
        val numbers = arrayOf(1, 2, 3)
        println(numbers::class) //class kotlin.Array
        println(numbers.javaClass) //class [Ljava.lang.Integer;
    }

    run {
        val numbers = intArrayOf(1, 2, 3)
        println(numbers::class) //class kotlin.IntArray
        println(numbers.javaClass) //class [I

        println(numbers.size) //3
        println(numbers.average()) //2.0
    }

    println(arrayOfNulls<Int>(5)[0]) //null
    // 1 ~ 5까지의 값을 제곱한 후 모든 값을 합친 후 배열에 넣는다
    println(Array(5) { i -> (i + 1) * (i + 1) }.sum()) //55
}