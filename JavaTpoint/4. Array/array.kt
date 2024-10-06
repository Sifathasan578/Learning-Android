//Kotlin Array can be created using arrayOf(), intArrayOf(), charArrayOf(), booleanArrayOf(), longArrayOf(), shortArrayOf(), byteArrayOf() functions.

fun main() {
   var arr = arrayOf(1, "Sifat", 5.95) /// takes any by default
   for(i in arr) {
       println(i)
   }

   var myArray1 = arrayOf(1,10,4,6,15)
   var myArray2 = arrayOf<Int>(1,10,4,6,15)
   val myArray3 = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
   var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")

   var myArray5: IntArray = intArrayOf(5,10,20,12,15)


   val arr = arrayOf(1, 2, 3, 4, 5)
//    arr.set(2, 100)
   arr[2] = 100

   for(i in arr) println(i)

   val array1 = arrayOf(1,2,3,4)
   val array2 = arrayOf<Long>(11,12,13,14)

   array1.set(0,5)
   array1[2] = 6

   array2.set(2,10)
   array2[3] = 8

   for(element in array1){
       println(element)
   }
   println()
   for(element in array2){
       println(element)
   }

    get() function
   val array1 = arrayOf(1,2,3,4)
   val array2 = arrayOf<Long>(11,12,13,14)
   println(array1.get(0))
   println(array1[2])
   println()
   println(array2.get(2))
   println(array2[3])

   val arr = Array<Int>(5) {0} // all zero
   for(i in arr) println(i)

   var myArray = Array<Int>(5){0} // ***

   myArray[1] = 10
   myArray[3] = 15

   for(element in myArray){
       println(element)
   }

   // arrayOf() and intArrayOf()
   val name = arrayOf<String>("Ajay","Prakesh","Michel","John","Sumit")
   var myArray2 = arrayOf<Int>(1,10,4,6,15)
   var myArray3 = arrayOf(5,10,20,12,15)
   var myArray4= arrayOf(1,10,4, "Ajay","Prakesh")
   var myArray5: IntArray = intArrayOf(5,10,20,12,15)

   for(element in name){
       println(element)
   }

   println()
   for(element in myArray2){
       println(element)
   }
   println()
   for(element in myArray3){
       println(element)
   }
   println()
   for(element in myArray4){
       println(element)
   }
   println()
   for(element in myArray5){
       println(element)
   }

    // traversing using range:
    var myArray5: IntArray = intArrayOf(5,10,20,12,15)

    for (index in 0..4){
        println(myArray5[index])
    }
    println()
    for (index in 0..myArray5.size-1){
        println(myArray5[index])
    }

    var arr = arrayOf(1, 2, 33, 4, 5)
    for(idx in 0..arr.size-1) {
        println(arr[idx])
    }
}
