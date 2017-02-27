package basics

import java.util.concurrent.Executors

/**
 * Single Abstract Method;
 *
 * @author xiaofei
 * @date 2017/2/27
 */
fun main(args: Array<String>) {
    val executor = Executors.newSingleThreadExecutor()
    executor.execute { print("run in thread pool") }
    executor.execute (Runnable { print("hello") })
    executor.execute({ print("hi")})
}