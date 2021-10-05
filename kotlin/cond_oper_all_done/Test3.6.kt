package cond_oper_all_done

fun main(){

    var A=8
    var B=8
    var c=0

    if (A==B){
        A=0
        B=0
    }else if (A!=B){
        c=A+B
        A=c
        B=c
    }
    println(A)
    println(B)
}