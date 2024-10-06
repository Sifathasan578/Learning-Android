
fun main() {
    val ch = charArrayOf('h', 'e', 'l', 'l', 'o')
    val st = String(ch)
    println(st)

    val str1 = "Hello, javaTpoint"
    val str2 = """Welcome To JavaTpoint"""

    // Property
//    length, indices: IntRange, lastIndex: Int
    val str = "imrulhasansifat"

    println(str.length) // length of the string: 15
    println(str.indices) // returns the range: 0..14
    println(str.lastIndex) // returns last index: 14

    val strr = "imrulhasansifat"
    println(str.compareTo(strr)) // return 0 if equal: 0
    println(str.get(1)) // returns the char of given idx: m
    println(str.plus(strr)) // returns the concatenated string: imrulhasansifatimrulhasansifat
    println(str.plus(strr)) // returns

    var txt = "hello, kotlin"
    println(txt.subSequence(7, 13)) // returns a part of string with range

    // ignorecase: false: by default
    var txtt = "Hello"
    println(txtt.contains("hello")) // false
    println(txtt.contains("hello", ignoreCase = true)) // true

    println(txtt.count()) // returns length
    println(txtt.drop(2)) // returns str after removing first n characters: llo
    println(txtt.dropLast(2)) // returns str after removing last n characters: hel

    // predicate: Lambda function/ function
    // String.dropWhile(predicate: (Char) -> Boolean): String: LATERRRR

    txt = "sifat"
    println(txt.elementAt(2)) // returns ele at idx

    txt = "sIfattafis"
    println(txt.indexOf('i', ignoreCase = true)) // return idx of first occur

    // contain: lambda
//    indexOfFirst() // LATER
//    indexOfFirst() // LATER

    // Has lambda
    println(txt.getOrElse(1) {'x'} ) // I, value nah thakle 'x' return korbe
    println(txt.getOrElse(10) {'x'} ) // x
    println(txt.getOrNull(10)) // null

    val str_ = "Hello, javatpoint"
    println(str_[0]) //prints H

    val i = 10
    println("i = $i") //i=10

    val sstr = "abc"
    println("$sstr is a string which length is ${sstr.length}")

    // raw string:
    val a = 10
    val b = 5

    val myString = """value $a  
        |is greater than value $b  
    """.trimMargin()
    println("${myString.trimMargin()}")

    // .trimMargin()
    val text = """Kotlin is official language  
        |announce by Google for  
        |android application development  
    """.trimMargin() // removes leading white spaces. Uses | by default
    println(text)

    /// Structural Equality vs Referential Equality
    val aa = "sif"
    val bb = "sif"
    println(aa == bb) // equal content: true
    println(aa === bb) // same reference: primitive types considers same

    val cc = aa
    println(aa === cc) // same reference

    // converting a string literal to char array
    // creating a string instance of the char array
    val charArr1 = String("sif".toCharArray())
    val charArr2 = String("sif".toCharArray())

    println(charArr1 === charArr2) // false: two different object

    // when found latter then drop from start
    val txt_new = "hasan_imrul46l5".dropWhile { it.isLetter() }
    println(txt_new)

    val txt_new2 = "kotlin is fun"
    val idx = txt_new2.indexOfFirst {
        // the char I am sending whether it is in the string or not!
        // "AEIOUaeiou": collection of characters
        // when char found vowel then stops and sends the idx!

        char -> char in "AEIOUaeiou"
    }
    println()

    // indexOfLast(): same as indexOfFirst()
}

fun idxReturn(c: Char) {
    if(c in )
}
