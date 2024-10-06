fun main() {
    val num1 = 10
    val num2 = 20
//    val result = if (num1 > num2) {
//        "$num1 is greater than $num2"
//    } else {
//        "$num1 is smaller than $num2"
//    }
    // OR
    val result = if (num1 > num2) "$num1 is greater than $num2" else "$num1 is smaller than $num2"
    println(result)

    val num = 10
    val result = if (num > 0){
        "$num is positive"
    }else if(num < 0){
        "$num is negative"
    }else{
        "$num is zero"
    }
    println(result)

    val numm1 = 25
    val numm2 = 20
    val numm3 = 30

    val res = if(numm1 > numm2) {
        val max = if(numm1 > numm3) {
            numm1
        }
        else {
            numm3
        }
        "body of if " + max
    } else if(numm2 > numm3){
        "body of else if" + numm2
    } else{
        "body of else " + numm3
    }
    println("$res")
}
