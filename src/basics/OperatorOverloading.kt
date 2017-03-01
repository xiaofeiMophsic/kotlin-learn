package basics

/**
 * @author xiaofei
 * @date 2017/3/1
 */
fun main(args: Array<String>) {

    val date1 = MyDate(2016, 2, 1)
    val date2 = MyDate(2016, 2, 2)

    println(date1 > date2)
}

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int): Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int = when {
        year != other.year -> year - other.year
        month != other.month -> month - other.month
        else -> dayOfMonth - other.dayOfMonth
    }
}