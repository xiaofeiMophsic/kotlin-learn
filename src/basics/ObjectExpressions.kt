package basics

import java.security.Provider
import java.util.*


/**
 * 扩展对象，类似于java的匿名内部类
 * @author xiaofei
 * @date 2017/2/27
 */
fun main(args: Array<String>) {
    println(getList())
}

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 3, 2, 6, 4)
    Collections.shuffle(arrayList)
    Collections.sort(arrayList, object: Comparator<Int> { //object expressions
        override fun compare(x: Int, y: Int) = y - x
    })
    return arrayList
}
