package chap06.section05

/**
 * where를 사용한 파라미터 타입 제한
 * Created by KMS on 2021/03/28.
 */
fun main() {
    // AutoCloseable 인터페이스를 구현한 클래스는 AutoCloseable 제약조건을 만족하는 모든 클래스를 전달할 수 있다
    fun <T: AutoCloseable> useAndClose(input: T) {
        input.close() //OK
    }

    val writer = java.io.StringWriter()
    writer.append("hello ")
    useAndClose(writer)
    println(writer) // hello
}