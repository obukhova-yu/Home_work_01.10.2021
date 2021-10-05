package branch_oper_all_done

fun main(){
    val P=1.8
    val S=1000
    var Summa=S
    val S1=1100
    var i=0


    while(Summa<S1) {
        i=i+1
        Summa=(Summa+Summa*P/100).toInt()
    }

    println("Summa: $Summa")
    println("Misyatsiv: $i")

}
