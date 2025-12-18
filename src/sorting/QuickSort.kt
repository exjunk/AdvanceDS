package sorting

import kotlin.random.Random

class QuickSort {

    fun sort(array: IntArray,l : Int, r: Int){
        if ( r - l <= 1) return
        val partitionElement = array[r]
        var m = l

        //intArrayOf(12,11,13,1,4,5) l = 0 , r = 5 , pE = 5

        for(i in l..r){
            if(array[i] < partitionElement){
                val temp =array[i]
                array[i] = array[m]
                array[m] = temp
                m++
            }
        }

        sort(array,l,m-1)
        sort(array,m,r)

    }
}