package cond_oper_all_done

fun main(){

    val x=-8
    var f=0

    if(x<=0){
        f=-x
    }else if (x>0&&x<2){
        f=x*x
    }else if (x>=2){
        f=4
    }
    println(f)
}