object maxSubarrayFunctional {

    def kadanesMaxSubarraySimpleFunc(lst: Array[Int]): Int = {
        val (_, maxSum) = lst.foldLeft((0, lst(0))) { case ((curSum, maxSum), n) =>
            val nextCur = math.max(curSum, 0) + n
            val nextMax = math.max(maxSum, nextCur)
            (nextCur, nextMax)
        }
        maxSum
        }
    
    def fold_left_fun(lst: Array[Int]) : Int = {
        val result = lst.foldLeft(0) ((acc, currElem) => (acc + currElem))
        return result
    }

    def fold_left_fun_2(lst: Array[Int]) : (Int, Int) = {
        val res = lst.foldLeft((0, 1)) {
            // case for acc, and element from list -> then run operations and return next acc
            case ((acc1, acc2), currElem) => 
            val curr1 = acc1 + currElem
            val curr2 = acc2 + currElem
            (curr1, curr2)
            // (acc1 + currElem, acc2 + currElem)
        }

        res
    }



    def main(args : Array[String]) : Unit =  {
        val lst = Array(2, -3, 4, -2, 2, 1, -1, 4)
        println(kadanesMaxSubarraySimpleFunc(lst))
        val test_lst = Array(1,2,3,4)
        println(fold_left_fun(test_lst))
        val (acc1, acc2) = fold_left_fun_2(test_lst)
        println(acc1)
        println(acc2)
    }

}