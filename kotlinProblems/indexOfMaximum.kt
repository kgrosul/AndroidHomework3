/*
 * Your task is to implement the indexOfMax() function so that it returns
 * the index of the largest element in the array, or null if the array is empty.
 */
package maxindex

import kotlin.math.max

fun indexOfMax(a: IntArray): Int? {
    if (a.isEmpty()) return null
    return a.indexOfLast({v -> v == a.reduce(::max)})
}


