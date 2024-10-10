fun main() {
    /*val oBox1 = Box(10, 5, 5)*/ // initializing with constructor
    // Box(): default constructor

    /*val oBox2 = Box(
        length = 10,
        width = 20,
        height = 25)*/ // named argument

    // what if we do not want to pass these values
    // 2 options: create 2nd constructor, not rec

    val oBox3: Box = Box()
    val oBox4: Box = Box(
        length = 10,
        width = 15,
        height = 55
    )

    /*Init() called! // will always execute first when calling Box()
    Length: 0
    Width: 0
    Height: 0
    Secondary constructor number 2 // it is called first as we are not passing any parameters
    Init() called! // default, primary called
    Length: 10
    Width: 15
    Height: 55*/
    
    // Recommended to use 1 constructor, 1 init
}

//class Box private constructor( // can give access modifier
//class Box constructor( // primary constructor

class Box( // primary constructor, usual way to do
//    println() // can not do anything here
    var length: Int = 5,
    var width: Int = 15,
    var height: Int = 20

    // can not include any logic here
) {

    // to write some logic use init block:
    // initializer block for a class, runs every time an instance of the class is created, allowing you to perform initialization logic
    init {
        println("Init() called!")
        println("Length: ${length}")
        println("Width: ${width}")
        println("Height: ${height}")
    }

    // 2nd constructor, default value - red
    // this(): primary constructor
    /*constructor(color: String = "Red") : this(0, 0, 0) {
        println("Secondary constructor number 1")
    }*/
    constructor() : this(0, 0, 0) {
        println("Secondary constructor number 2")
    } // works too
    // without doing it we can just initialize in primary too so don't need

    // can have multiple init, but recommended to have one
    // kotlin has default arguments, so we do not need to create different constructors for every combination of arguments
    // avoid secondary constructor, video does show it!
}
