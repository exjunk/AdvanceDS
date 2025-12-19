import sorting.QuickSort

fun main(){
    val quickSort = QuickSort()
    val testArray = intArrayOf(1,41,1,1,1,11)
    quickSort.threeWayQuickSort(testArray,0,5)


    testArray.forEach {
        println(it)
    }
}





