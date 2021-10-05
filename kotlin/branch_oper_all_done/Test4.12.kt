package branch_oper_all_done

fun main(){

    val N=13
    var f1=1
    var f2=1
    var f=0

    while (N>f2){
        f=f2
        f2=f2+f1
        f1=f
    }
    if (N==f2){
        println(true)
    }else{
        println(false)
    }
}