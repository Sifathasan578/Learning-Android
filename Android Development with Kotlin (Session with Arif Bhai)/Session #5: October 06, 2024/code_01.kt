fun main() {
    var numList: List<Int> = mutableListOf(1, 2, 3, 4)
    var numMutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4)
    
    var numSet: Set<Int> = setOf(1, 2, 3, 4)
    var numMutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4)
    
    var numMap: Map<String, Int> = mapOf(Pair("sifat", 1), Pair("arafat", 2), Pair("shakil", 3))
    var numMutableMap: MutableMap<String, Int> = mutableMapOf(Pair("sifat", 1), Pair("arafat", 2), Pair("shakil", 3))

    numMutableList.add(1)
    println(numMutableList)
}
