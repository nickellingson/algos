object MaxSubarrayApp {

    // brute force O(n^2)
    def bruteMaxSubarray(lst: Array[Int]): Int = {
        var maxSum = lst(0)

        for (i <- lst.indices) {
            var tempSum = 0
            for (j <- i until lst.length) {
                tempSum += lst(j)
                maxSum = math.max(maxSum, tempSum)
            }
        }
        maxSum
    }


    // kadanes while loop
    def kadanesMaxSubarray(lst: Array[Int]): Int = {
        var right = 0
        var maxSum = lst(0)
        var tempSum = 0

        while (right < lst.length) {
            tempSum += lst(right)
            maxSum = math.max(maxSum, tempSum)
            if (tempSum < 0) tempSum = 0
            right += 1
        }
        maxSum
    }


    // kadanes simple for each
    def kadanesMaxSubarraySimple(lst: Array[Int]): Int = {
        var maxSum = lst(0)
        var curSum = 0

        for (n <- lst) {
            curSum = math.max(curSum, 0)
            curSum += n
            maxSum = math.max(maxSum, curSum)
        }
        maxSum
    }

    // main
    def main(args: Array[String]): Unit = {
        val lst = Array(2, -3, 4, -2, 2, 1, -1, 4)
        println(bruteMaxSubarray(lst))
        println(kadanesMaxSubarray(lst))
        println(kadanesMaxSubarraySimple(lst))
    }

}

