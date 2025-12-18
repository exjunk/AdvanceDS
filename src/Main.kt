import sorting.MergeSort
import sorting.QuickSort

fun main(){
    val quickSort = QuickSort()
    val testArray = intArrayOf(12,11,13,1,4,5)
    quickSort.sort(testArray,0,5)


    testArray.forEach {
        println(it)
    }
}



