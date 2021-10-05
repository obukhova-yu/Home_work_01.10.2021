package branch_oper_all_done

fun main(){

    var A=81
    var B=27

    while (A>=0){

        if (A>=B){
            A=A%B
        } else{
            B=B%A
        }
        println(A+B)
    }

}