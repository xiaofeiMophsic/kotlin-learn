package basics

/**
 * @author xiaofei
 * @date 2017/1/18
 */
fun main(args: Array<String>) {
    var str: String? = "test"
    // 对空值判断
    if (str != null) {
        println(str.length)
    }
    // 使用?.的方式调用，当值为null的时候输出null
    str = null
    println(str?.length)
    str?.let(::println)

    str = "hello"
    // 使用 !!. 进行非空断言
    println(str!!.length)

    /** Elvis Operator */
    val l: Int = if (str != null) str.length else 0
    val ll: Int = str?.length ?: 0

    val nullableList: List<Int?> = listOf(1, 2, 4, 5, null, 6)
    val notnullList: List<Int> = nullableList.filterNotNull()
}

fun foo(node: String): String?{
    val len: Int = node.length ?: return null
    return len.toString()
}

fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val email = client?.personalInfo?.email
    if (email != null && message != null)
        mailer.sendMessage(email, message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}