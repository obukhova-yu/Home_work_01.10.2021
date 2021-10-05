package branch_oper_all_done

fun main(){
    var N=2598741
    var n=0

    while(N>0) {
        n=N%10
        println(n)
        N=N/10
    }
}