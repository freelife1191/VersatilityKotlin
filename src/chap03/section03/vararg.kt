package chap03.section03

/**
 * 여러개의 인자
 * Created by KMS on 2021/03/21.
 */
fun main() {
    fun max(vararg numbers: Int): Int {
        var large = Int.MIN_VALUE

        for (number in numbers) {
            large = if (number > large) number else large
        }

        return large
    }

    println(max(1, 5, 2)) //5
    println(max(1, 5, 2, 12, 7, 3)) //12

    val values = intArrayOf(1, 21, 3)

    // vararg 키워드가 파라미터로 특정 타입의 배열이 들어갈 수도 있다
    // 스프레드 연산자를 사용하지 않으면 일일히 추출해서 넘겨야 한다
    println(max(values[0], values[1], values[2])) //SMELLY, don't

    // 스프레드 연산자 *을 이용해서 배열을 넘길 수 있다
    println(max(*values)) //21
    // 리스트에 직접 스프레드 연산자를 적용할 수 없고 배열로 변환하여 적용 가능
    println(max(*listOf(1, 4, 18, 12).toIntArray()))

}