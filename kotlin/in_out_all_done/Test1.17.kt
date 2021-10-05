package in_out_all_done

import kotlin.math.abs
import kotlin.math.pow

fun main() {

    val x1 = 7
    val y1 = 6
    val x2 = 5
    val y2 = 5

    val AB = abs(x2-x1)
    val BC = abs(y2-y1)

    val L = (AB*AB+BC*BC).toDouble().pow(0.5)

    println(L)

}