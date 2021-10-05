package integer_all_done

fun  main(){

    val N=123

    val a=N/100
    val b=N%100
    val c=b/10
    val d=b%10
    val S=c*100+a*10+d

    println(S)


}