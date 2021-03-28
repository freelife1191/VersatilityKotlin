package chap06.section05

/**
 * 스타 프로젝션
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun printValues(values: Array<*>) {
        for (value in values) {
            println(value)
        }

        // 파라미터를 Array<T>로 작성했다면 ERROR가 발생하지 않고 컴파일이 됨
        //values[0] = values[1] //ERROR
    }

    printValues(arrayOf(1, 2)) //1\n2
}