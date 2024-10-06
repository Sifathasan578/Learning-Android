fun main() {
    for (i in 1..3) {
        println("i = $i")
        if (i == 2) {
            continue
        }
        println("this is below if")
    }

//    Kotlin Labeled continue Expression
    labelname@ for (i in 1..3) {
        for (j in 1..3) {
            println("i = $i and j = $j")
            if (i == 2) {
                continue@labelname
            }
            println("this is below if")
        }
    }
}
