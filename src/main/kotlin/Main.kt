//https://app.codesignal.com/arcade/intro/level-7/ZFnQkq9RmMiyE6qtq/solutions

fun main() {
    print(solution(mutableListOf(2, 4, 7)))
}

fun solution(a: MutableList<Int>): Int {
    var minSum = Integer.MAX_VALUE
    var element = 0
    for (i in 0 until a.size) {
        var tempSum = 0
        for (j in 0 until a.size) {
            tempSum += (Math.abs(a[i] - a[j]))
        }
        if (tempSum < minSum) {
            minSum = tempSum
            element = a[i]
        }
    }
    return element
}
