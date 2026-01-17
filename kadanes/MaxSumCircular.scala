object MaxSumCircular {

    def maxSumCirc(lst: Array[Int]): Int = {

        var globalMax = lst(0)
        var currMax = -9999999
        var currMin = 9999999
        var globalMin = lst(0)
        var total = 0

        for (i <- lst.indices) {
            currMin = math.min(currMin + lst(i), lst(i))
            currMax = math.max(currMax + lst(i), lst(i))

            total += lst(i)

            globalMax = math.max(globalMax, currMax)
            globalMin = math.min(globalMin, currMin)

        }
        if (globalMax > 0) math.max(globalMax, total - globalMin) else globalMax
    }

    def main(args: Array[String]): Unit = {
        val lst = Array(-2,4,-5,4,-5,9,4)
        println(maxSumCirc(lst))
    }

}


