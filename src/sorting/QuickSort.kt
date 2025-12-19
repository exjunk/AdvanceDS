package sorting


class QuickSort {

    fun sort(array: IntArray, l: Int, r: Int) {
        if (r - l <= 1) return
        val partitionElement = array[r]
        var m = l

        for (i in l..< r) {
            if (array[i] <= partitionElement) {
                val temp = array[i]
                array[i] = array[m]
                array[m] = temp
                m++
            }
        }


        val temp = array[m]
        array[m] = array[r]
        array[r] = temp

        sort(array, l, m - 1)
        sort(array, m+1, r)

    }

    fun threeWayQuickSort(array: IntArray,l: Int,r: Int){
        if(l >= r) return
        val (lt,gt) = partition(array,l,r)

        threeWayQuickSort(array,l,lt - 1)
        threeWayQuickSort(array,gt+1,r)
    }

    fun partition(array: IntArray,l:Int,r:Int):Pair<Int, Int>{
        val pivot = array[l]
        var gt = r
        var lt = l
        var i = l+1

        while(i <= gt){
            when {
                pivot > array[i] -> {
                    val temp = array[i]
                    array[i] =  array[lt]
                    array[lt] = temp
                    lt++
                    i++
                }

                pivot < array[i] -> {
                    val temp = array[i]
                    array[i] =  array[gt]
                    array[gt] = temp

                    gt--
                   /// i++
                }

                else -> {
                    i++
                }
            }
        }

        return Pair(lt,gt)

    }


}