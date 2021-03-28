package chap06.section05

/**
 * where를 사용한 파라미터 타입 제한
 * Created by KMS on 2021/03/28.
 */
fun main() {
    // 타입 T는 close() 메소드를 서포트해야 하지만 어떤 타입은 close() 메소드가 없어서 실패한다
    fun <T> useAndClose(input: T) {
        // input.close() //ERROR: unresolved reference: close
    }

    val writer = java.io.StringWriter()
    writer.append("hello ")
    useAndClose(writer)
    println(writer)
}