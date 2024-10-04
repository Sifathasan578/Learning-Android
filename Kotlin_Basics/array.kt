fun main() {
    // in c++: int arr[10] = {1, 2, 3, 4, 5}
    // arrayOf()

    val arr = arrayOf(1, 2, 3, 4, 5)
    for(i in arr) {
        print("$i ")
    }
    println()

    println("Value in the index 3 is: ${arr[3]}")
    arr[3] = 100
    println("Value in the index 3 is: ${arr[3]}")

    val arr2 = arrayOf("hello", "my", "name", "is", "Sifat")
    for(i in arr2) {
        print("$i ")
    }
    println()

    // array length: .size
    println(arr2.size)

    //*** Check if an element exists:
    if ("my" in arr2) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    // Loop through an array:
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    for (x in cars) {
        println(x)
    }
}
