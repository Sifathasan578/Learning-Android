fun main() {
    val value1 = 'A'
    //or
    val value2: Char
    value2= 'A'

    val flag = true

    // arrayOf()
    val id = arrayOf(1, 2, 3, 4, 5)
    val first_value = id[0]
    val last_value = id[id.size - 1]

    // Array()
//    val asc = Array(5, {i -> i * 2})
    val asc = Array(5, {i -> i * 3})  // 0 * 3, 1 * 3, ...
    for(i in asc) {
        println(i)
    }

    val text ="Hello, JavaTpoint"

    val text1 ="Hello, JavaTpoint"
    //or
    val text2 ="Hello, JavaTpoint\n"
    //or
    val text3 ="Hello, \nJavaTpoint"

    val text4 ="""  
                 Welcome   
                     To  
               JavaTpoint  
        """
    println(text4)
}
