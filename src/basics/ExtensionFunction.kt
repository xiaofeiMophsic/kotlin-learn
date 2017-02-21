package basics

/**
 * @author xiaofei
 * @date 2017/1/19
 */
data class RationNumber(val numerator: Int, val denominator: Int)
fun Int.r(): RationNumber = RationNumber(this, 1)
fun Pair<Int, Int>.r(): RationNumber = RationNumber(first, second)

fun main(args: Array<String>) {
    val test = RationNumber(2, 3)
    val testI: Int = 3
    val pair: Pair<Int, Int> = Pair(4, 5)
    println(testI.r())
    println(pair.r())
}

