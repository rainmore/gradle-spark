/*
 * This Scala source file was generated by the Gradle 'init' task.
 */
package au.com.rainmore.spark.utilities

import au.com.rainmore.spark.list.LinkedList

object StringUtils {
    def join(source: LinkedList): String = {
        JoinUtils.join(source)
    }

    def split(source: String): LinkedList = {
        SplitUtils.split(source)
    }
}
