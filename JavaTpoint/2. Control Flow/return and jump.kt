fun main() {
    for (i in 1..5) {
        if (i == 3) {
            break
        }
        println(i)
    }

//    Kotlin Labeled break Expression: ???
    //Kotlin labeled break expression is used to terminate the specific loop. 

    loop@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2)
                break@loop
        }
    }
}
