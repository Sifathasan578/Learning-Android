fun main() {
    val marks = arrayOf(80,85,60,90,70)
    for(item in marks){
        println(item)
    }

    val mark = arrayOf(80,85,60,90,70)
    for(item in mark)
        println(item)

    val arr = arrayOf(1, 2, 3, 4, 5)
    for(i in arr.indices) {//**
        print("$i: arr[$i] = ${arr[i]}")
        println()
    }

//    Iterate through range

    print("for(i in 1..5) print(i): ")
    for(i in 1..5) print(i)
    println()

    print("for (i in 5..1) print(i) = ")
    for (i in 5..1) print(i)             // prints nothing
    println()

    print("for (i in 5 downTo 1) print(i) = ")
    for (i in 5 downTo 1) print(i)
    println()

    print("for (i in 5 downTo 2) print(i) = ")
    for (i in 5 downTo 2) print(i)
    println()

    print("for (i in 1..5 step 2) print(i) = ")
    for (i in 1..5 step 2) print(i)
    println()

    print("for (i in 5 downTo 1 step 2) print(i) = ")
    for (i in 5 downTo 1 step 2) print(i)

//    for (i in 1..5) print(i) = 12345
//    for (i in 5..1) print(i) =
//    for (i in 5 downTo 1) print(i) = 54321
//    for (i in 5 downTo 2) print(i) = 5432
//    for (i in 1..5 step 2) print(i) = 135
//    for (i in 5 downTo 1 step 2) print(i) = 531
}
