// https://school.programmers.co.kr/learn/courses/30/lessons/12926?language=kotlin
class Solution {
    private val alphabetCounts = 26

    fun solution(s : String, n : Int): String {

        val stringBuilder = StringBuilder()

        for(c in s.toCharArray()) {
            if (isNotBlankCharacter(c)) {
                stringBuilder.append(getCaesarCharacter(c, n))
            } else {
                stringBuilder.append(' ')
            }
        }

        return stringBuilder.toString()
    }

    fun anotherSolution(s: String, n: Int): String =
        s.toList().joinToString(separator = "") {
            when (it) {
                in 'A'..'Z' -> ('A'.code + (it.code - 'A'.code + n) % ('Z' - 'A' + 1)).toChar()
                in 'a'..'z' -> ('a'.code + (it.code - 'a'.code + n) % ('z' - 'a' + 1)).toChar()
                else -> it
            }.toString()
        }

    private fun isNotBlankCharacter(c: Char): Boolean {
        return c != ' '
    }

    private fun getCaesarCharacter(c: Char, n: Int): Char {
        val baseASCII = if(c.isUpperCase()) 'A'.code else 'a'.code
        return (baseASCII + ((c.code + n) % baseASCII) % alphabetCounts).toChar()
    }
}