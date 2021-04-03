/*
 * Any array may be viewed as a number of "runs" of equal numbers.
 * For example, the following array has two runs:
 *   1, 1, 1, 2, 2
 * Three 1's in a row form the first run, and two 2's form the second.
 * This array has two runs of length one:
 *   3, 4
 * And this one has five runs:
 *   1, 0, 1, 1, 1, 2, 0, 0, 0, 0, 0, 0, 0
 * Your task is to implement the runs() function so that it returns the number
 * of runs in the given array.
 */
package runs
data class Accumulator(val cnt: Int, val prev: Int)

fun update(acc: Accumulator, new: Int): Accumulator {
     if (acc.prev == new) return acc 
     else return Accumulator(acc.cnt + 1, new)
}

fun runs(a: IntArray): Int {
    return a.fold(Accumulator(0, -1), ::update).cnt
}
