import java.util.*
import java.util.function.IntBinaryOperator

class SecretMapByKotlin {
    fun solution(n: Int, arr1: IntArray, arr2: IntArray): Array<String?> {

        val result = arrayOfNulls<String>(n)
        for (i in 0 until n) {
            val orResult = arr1[i] or arr2[i]
            val sb = StringBuffer()
            for (j in n - 1 downTo 0) {
                sb.append(if (orResult and (1 shl j) > 0) "#" else " ")
                val tmp = 1 shl j
                println(tmp)

            }
            result[i] = sb.toString()
        }

        return result
    }

    fun anotherSolution(n: Int, arr1: IntArray, arr2: IntArray): Array<String?> {

        val result = arrayOfNulls<String>(n)
        for (i in arr1.indices) {
            val binaryResult = addZero(n, Integer.toBinaryString(arr1[i] or arr2[i]))
            result[i] = binaryResult.replace("1", "#")
                .replace("0", " ")
        }

        return result
    }

    private fun addZero(n: Int, binaryStr: String): String {
        return "0".repeat(n - binaryStr.length) + binaryStr
    }
}