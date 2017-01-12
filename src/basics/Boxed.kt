package basics

/**
 * @author xiaofei
 * @date 2017/1/12
 */

fun main(args: Array<String>) {
    val a: Int = 0x0f
    println(a === a)
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    print(boxedA == anotherBoxedA)

    println((a shl 2))
    println(a.inv())

    println(decimalDigitValue('5'))

    arraytest()

    stringTest()
}

/**
 * 将字符转换成[Int]类型
 */
fun decimalDigitValue(char: Char): Int {
    if (char !in '0'..'9') {
        throw IllegalArgumentException("参数不合法")
    }
    return char.toInt() - '0'.toInt()
}

fun arraytest() {
    val asc = Array(5, { i -> (i * i).toString() })
    val x: IntArray = intArrayOf(1, 2, 3, 4, 5)

    //println(x)
    asc.forEach {
        i ->
        println(i)
    }
}

fun stringTest() {
    val text = """
            >Tell me and I forget.
            >Teach me and I remember.
            >Involve me and I learn.""".trimMargin(">")
    val dollor = "hello"
    val i: Int = 3
    println("dollor.length = ${dollor.length}")
}
