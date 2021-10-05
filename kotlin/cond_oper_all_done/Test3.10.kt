package cond_oper_all_done

fun main(){

    val x=1
    var f=0

    if (x<-2 || x>2){
        f=2*x
    }else{
        f=-3*x
    }
    println(f)
}