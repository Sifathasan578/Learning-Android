import java.beans.Visibility

fun main() {
    val oBox1: Box = Box()
    val oBox2: Box = Box()
    val oBox3: Box = Box()

    /* Kotlin has inbuilt getter while accessing. so, even might seem like we are accessing directly but we are not */

    println("Length: ${oBox1.length}")
    println("Width: ${oBox1.width}")
    println("Height: ${oBox1.height}")

    println(oBox1.fillContents()) // returns unit
    println(oBox1.boxOpen()) // returns unit

    // here also the setter is executed silently
    oBox2.length = 15
    println(oBox2.length)

    // accessing the setter
    oBox3.age = 20
    println(oBox3.age)

    println(oBox3.volume) // 1000
    oBox1.volume = 500
    println(oBox1.volume) // getter ashtece

    oBox1.boxName = "Random Box"
    println(oBox1.boxName)

    oBox1.boxName = "Box"

   /* Visibility Modifiers:
   public: default, can be accessed everywhere
   ***internal: available everywhere in the same "module"
   private: available only inside the "containing file or class"
   protected: same as private but available inside subclass or child classes
   */

//    println(oBox1.privateNum) // can not access, it is private
//    subclass, superclass, internal: later
}

// properties: variable
// behavior: function

class Box {
    var length: Int = 10
    var width: Int = 20
    var height: Int = 5

    // conventional
    /*fun getLength(): Int {
        return length
    }
    fun setLength(len: Int) {
        length = len
    }*/

    // Only when you want to customize it!
    // if we want to calculate the volume of the box
    var volume: Int = 0 // must be var
        get() = length * width * height
        set(value) {
            if(value >= 0) {
                field = value
            }
            else field = -1
        }

    // This is the syntax of getters, setter
    var age: Int = 0 // must be var to set
        get() = field
        set(value) {
            if(value >= 0) field = value
            else println("Can't be less than zero")
        }

    var boxName: String = "Default Name"
//       private set(value) { // you can make setter as private as well
        set(value) {
            if(value.length < 4) println("NA")
            else field = value
        }

    fun fillContents(): Unit {
        println("Box is filled!")
    }

    fun boxOpen(): Unit {
        println("Box is open")
    }

    private var privateNum: Int = 25
}
