package branch_oper_all_done.Test4

fun main(){

    val N=6
    var A1=1
    var A2=2
    var A3=3
    var a=0

    println(A1)
    println(A2)
    println(A3)

    for (i in 4..N){
        a=A3
        A3=A3+A2-2*A1
        A1=A2
        A2=a

        println(A3)
    }


}
