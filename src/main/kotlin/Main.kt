fun main() {
    //1
    fun printFullName(){
        val firstName="Артём"
        val lastName="Луговских"
        println(firstName+" "+lastName)
    }
    printFullName()
    //3
    fun calculateFullName(){
        printFullName()
    }
    calculateFullName()
    //4?????
    //5

    val num = 13
    var answer = false
    for (i in 2..num / 2) {
        if (num % i == 0) {
            answer = true
            break
        }
    }

    if (!answer)
        println("$num является простым числом ")
    else
        println("$num не является простым числом ")
}