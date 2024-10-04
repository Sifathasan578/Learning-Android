fun main() {
    // ..: indicates ranges!
    for(chars in 'a' .. 'f') {
        println(chars)
    }
    for(num in 1..15) {
        println(num)
    }

    // Check if a Value Exists
    val nums = arrayOf(2, 4, 6, 8)
    if (2 in nums) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    // Break or Continue a Range
    for (nums in 5..15) {
        if (nums == 10) {
            break
        }
        println(nums)
    }

    //Skip the value of 10 in the loop, and continue with the next iteration:
    for (nums in 5..15) {
        if (nums == 10) {
            continue
        }
        println(nums)
    }
}
