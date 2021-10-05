package branch_oper_all_done.Test4

fun main(){
    val N=96
    val K=13
    var chastka=0
    var zal=N

    while(zal>K) {
        zal = zal - K
        chastka = chastka + 1
          }

    println("Chactka: $chastka")
    println("Zalishok: $zal")

}
