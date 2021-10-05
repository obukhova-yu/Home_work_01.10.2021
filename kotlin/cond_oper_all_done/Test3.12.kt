package cond_oper_all_done

fun main(){

    val R=1900

    if (R%4==0){
        if (R%100==0){
            if (R%400!=0){
                println("365")
            }else{
                println("366")
            }
        }else{
            println("365")
        }
    }else{
        println("365")
    }
}