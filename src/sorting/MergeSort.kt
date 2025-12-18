package sorting

class MergeSort {

    fun mergeSort(array: IntArray): IntArray {
        if(array.size <= 1) return array
        val mid = (array.size - 1) / 2
        val leftArray = array.sliceArray(0..mid)
        val rightArray = array.sliceArray(mid+1..< array.size)

        return merge(mergeSort(leftArray),mergeSort(rightArray))
    }

    fun merge(array1: IntArray, array2: IntArray): IntArray {
        val n = array1.size
        val m = array2.size

        var i = 0
        var j = 0
        var k = 0

        val newArray = IntArray(n+m)

        while(i < n && j < m){
            if( (array1[i] > array2[j])){
                newArray[k] = array2[j]
                k++
                j++
            }else {
                array1[i] <= array2[j]
                newArray[k] = array1[i]
                k++
                i++
            }

        }

        while(i < n){
            newArray[k] = array1[i]
            k++
            i++
        }

        while(j < m){
            newArray[k] = array2[j]
            k++
            j++
        }

        return newArray
    }
}