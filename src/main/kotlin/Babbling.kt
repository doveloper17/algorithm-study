// https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=javascript
class Babbling {
    fun solution(babbling: Array<String>): Int {

        var answer = 0

        for(str in babbling) {
            val replaceResult = str.replace("aya", " ")
                .replace("ye", " ")
                .replace("woo", " ")
                .replace("ma", " ")
                .replace(" ", "")

            if (replaceResult.isBlank()) {
                answer++
            }
        }

        return answer
    }

    fun anotherSolution(babbling: Array<String>): Int {
        val regex = "aya|ye|woo|ma".toRegex()
        return babbling.map { it.replace(regex, "") }
            .filter { it.isBlank() }
            .size
    }
}