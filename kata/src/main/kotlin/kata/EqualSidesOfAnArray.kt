package kata

object EqualSidesOfAnArray {

    fun findEvenIndex(arr: IntArray): Int {
        val n = arr.size
        return (0 until n)
                .filter { i -> arr.copyOfRange(0, i).sum() == arr.copyOfRange(i + 1, n).sum() }
                .getOrElse(0) {-1}
    }
}