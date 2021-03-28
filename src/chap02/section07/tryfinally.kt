package chap02.section07

/**
 * 예외가 발생하지 않는 경우 try식 안의 마지막 부분이 결과가 된다
 * 예외가 발생한다면 catch식의 마지막 부분이 결과가 된다
 * Created by KMS on 2021/03/21.
 */
fun main() {

    fun tryExpr(blowup: Boolean): Int {
        return try {
            if (blowup) {
                throw RuntimeException("fail")
            }

            2
        } catch(ex: Exception) {
            4
        } finally {
            7
        }
    }

    println(tryExpr(false))
    println(tryExpr(true))

}
