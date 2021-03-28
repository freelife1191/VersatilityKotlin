package chap06.section05

/**
 * where를 사용한 파라미터 타입 제한
 * 여러개의 제약조건을 넣을때 where를 사용
 * Created by KMS on 2021/03/28.
 */
fun main() {
    fun <T> useAndClose(input: T)
            where T: AutoCloseable,
                  T: Appendable {
        input.append("there")
        input.close()
    }

    val writer = java.io.StringWriter()
    writer.append("hello ")
    useAndClose(writer)
    println(writer) //hello there
}