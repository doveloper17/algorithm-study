class ThreeMusketeers {
    fun solution(number: IntArray): Int {
        return combination(number, 0, 0, 0)
    }

    private fun combination(number: IntArray, index: Int, count: Int, sum: Int): Int {
        var answer = 0
        if (count == 3 && sum == 3) {
            return ++answer
        }

        if (index < number.size) {
            answer += combination(number, index + 1, count + 1, sum + number[index])
            answer += combination(number, index + 1, count, sum)
        }

        return answer
    }
}