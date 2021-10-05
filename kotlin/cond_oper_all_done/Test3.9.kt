package cond_oper_all_done

fun main(){

    var A=111
    var B=21
    var C=35

    if (A<B && C>A){
        println(B+C)
    }else {
        if(B<C){
            println(A+C)
        }else{
            println(A+B)
        }
    }
}