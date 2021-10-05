package cond_oper_all_done

fun main(){

    val A=5212
    val B=882
    val C=959

    if (A>B && A>C){
        if(B>C){
            println(B)
        }else{
            println(C)
        }
    }

    else if(B>A && B>C){
        if(A>C){
            println(A)
        }else{
            println(C)
        }
    }

    else if(C>A && C>B){
        if(A>B){
            println(A)
        }else {
                println(B)
            }
    }
}