package branch_oper_all_done

import kotlin.math.pow

fun main(){

    val A:Double =-1.5
    var P:Double=0.0
    val N=8

    for (i in 1..N){
        P=A.pow(i)
        println(P)
    }
}