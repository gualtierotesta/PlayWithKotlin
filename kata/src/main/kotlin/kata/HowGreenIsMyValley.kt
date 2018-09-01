package kata

import java.util.*
import java.util.stream.Collectors.toList

/*

    Input : an array of integers.

    Output : this array, but sorted in such a way that there are two wings:
        the left wing with numbers decreasing,
        the right wing with numbers increasing.

        the two wings have the same length. If the length of the array is odd the wings are around the bottom, if the length is even the bottom is considered to be part of the right wing.

        each integer l of the left wing must be greater or equal to its counterpart r in the right wing, the difference l - r being as small as possible. In other words the right wing must be nearly as steeply as the left wing.

    The function is make_valley or makeValley or make-valley.
 */

fun makeValley(arr: IntArray): IntArray {
    val sarr = arr.sortedArrayDescending()
    val n = sarr.size
    val half = n / 2 + (n % 2)
    val last = n - if (n % 2 == 0) 1 else 0
    return (0 until n)
            .map { i -> if (i < half) sarr[i * 2] else sarr[last - ((i - n / 2) * 2)] }
            .toList().toIntArray()
}

fun makeValley2(arr:IntArray) = when (arr.size) {
    1 -> arr
    else -> arr.sortedArrayDescending().withIndex().groupBy { it.index % 2 }.map { it.value.map { it.value } }.windowed(2) { it[0] + it[1].sorted() }.flatten().toIntArray()
}

fun makeValley3(arr:IntArray):IntArray {
    val answer = IntArray(arr.size)
    arr.sort()

    for (i in 0 until arr.size) {
        if (i % 2 == 0) {
            answer[i / 2] = arr[arr.size - 1 - i]
        } else {
            answer[arr.size - 1 - i / 2] = arr[arr.size - 1 - i]
        }
    }

    return answer
}


fun main(args: Array<String>) {
    val arr = arrayOf(79, 35, 54, 19, 35, 25)
    //val arr = arrayOf(67, 93, 100, -16, 65, 97, 92)

    val x =
            arr
                    .sortedArrayDescending()
                    .withIndex()
                    .groupBy { it.index % 2 }
                    //.map { it.value }
                    //.map { it.value.map { it.value } }
                    //.windowed(2) { it[0] + it[1].sorted() }
                    //.flatten()
                    //.forEach { println(it) }
                    //.forEach { t, u -> println("t=$t u=$u")  }
                    //.forEach { i -> System.out.println("index=${i.index} value=${i.value}")}


//    else -> arr.sortedArrayDescending().withIndex().groupBy { it.index % 2 }
// .map { it.value.map { it.value } }.windowed(2) { it[0] + it[1].sorted() }.flatten().toIntArray()





}