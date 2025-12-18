package sorting

class HeapSort {


    //  adding at last and then moving to the actual node by comparing parent it satisfy condition
    fun insert(e : Int,heap: ArrayList<Int>) {
        heap.add(e)
        val hSize = heap.size - 1
        var j = hSize

        while(j > 0 ){
            val parentIndex = (j-1)/2
            if(heap[j] < heap[parentIndex]){
                val temp = heap[j]
                heap[j] = heap[parentIndex]
                heap[parentIndex] = temp
                j = parentIndex
            }else{
                break
            }

        }

    }

    fun removeMin(heap: ArrayList<Int>): Int{
        val last = heap[heap.size - 1]
        val min  = heap[0]

        heap[0] = last
        heap.removeAt(heap.size - 1)

        var i = 0
        val n = heap.size
        var j = 0
        while(i < n ){
            j = (2 * i) + 1
            if(j < n && (2*i + 2) < n &&  heap[j] > heap[(2*i)+2]){
                j += 1 // Right child is smaller
            }
            if(j < n && heap[i] > heap[j]){
                val temp = heap[i]
                heap[i] = heap[j]
                heap[j] = temp
                i = j
            }else{
                break  // incase condition satisfied for given node that 2 childs are greater then parent , it should break
            }


        }

        return min
    }

    fun singleArrayInsert(array: IntArray){
        for(i in array.indices){
            insertSameArray(i,array)
        }
    }

    fun insertSameArray(index: Int, array: IntArray) {
        var currentPosition = index

        while (currentPosition > 0) {
            val parent = (currentPosition - 1) / 2
            if (array[parent] > array[currentPosition]) {
                val temp = array[currentPosition]
                array[currentPosition] = array[parent]
                array[parent] = temp
                currentPosition = parent
            } else {
                break
            }
        }
    }

    fun removeSameArray(array: IntArray) {
        var maxSize = array.size - 1

        while (maxSize > 0) {
            // Swap root with last element
            val temp = array[0]
            array[0] = array[maxSize]
            array[maxSize] = temp
            maxSize--

            // Heapify down from root
            var i = 0
            while (i <= maxSize) {
                var smallest = (2 * i) + 1  // Left child

                // Find smaller child
                if (smallest <= maxSize && (smallest + 1) <= maxSize &&
                    array[smallest] > array[smallest + 1]) {
                    smallest = smallest + 1  // Right child is smaller
                }

                // If child exists and is smaller than parent, swap
                if (smallest <= maxSize && array[smallest] < array[i]) {
                    val temp2 = array[smallest]
                    array[smallest] = array[i]
                    array[i] = temp2
                    i = smallest
                } else {
                    break
                }
            }
        }
    }
}