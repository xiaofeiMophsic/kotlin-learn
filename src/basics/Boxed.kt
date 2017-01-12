package basics

/**
 * @author xiaofei
 * @date 2017/1/12
 */

fun main(args: Array<String>) {
    val a: Int = 10000
    println(a == a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA == anotherBoxedA)
}