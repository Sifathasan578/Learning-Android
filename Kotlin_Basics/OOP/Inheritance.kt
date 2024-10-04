// SuperClass
// open = Use the open keyword in front of the superclass/parent,
// to make this the class other classes should inherit properties and
// functions from.
open class MyParentClass {
    val x = 5
}

// SubClass
class MyChildClass: MyParentClass() {
    fun myFun() {
        println(x)
    }
}

fun main() {
    val myObj = MyChildClass()
    myObj.myFun()
}
