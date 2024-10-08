fun main() {
//    Ineration Over Collections
    var namesList = mutableListOf<String>("Sifat", "Imrul", "Hasan", "Arafat", "Shakil", "Mahfuz")

    for(name in namesList) {
        println(name)
    }
    namesList.forEach {
        println(it)
    }

    var namesSet = mutableSetOf<String>("Tamim", "Shakib", "Mushfiq")
    namesSet.forEach {
        println(it)
    }

    var namesMap = mapOf<String, String>("Tamim" to "Chittagong", "Shakib" to "Magura", "Mushfiq" to "Bogura")

    for(ele in namesMap) {
        println("${ele.key} = ${ele.value}")
    }
    // or
    for((key, value) in namesMap) {
        println("${key} = ${value}")
    }
    // foreach

    namesMap.forEach { key, value -> println("$key => $value") }
    namesMap.forEach { item -> println("${item.key} => ${item.value}") }

    // iterator object
    println("with iterator")
    val nameListIterator = namesList.iterator()

    // hasNext(), next()
    println(nameListIterator.hasNext())
//    println(nameListIterator.next()) // "Sifat"

    /*while (nameListIterator.hasNext()) {
        println(nameListIterator.next())
    }*/

    println("Before remove: ${namesList}")
    nameListIterator.next() // now iterator at idx = 0
    nameListIterator.remove()
    println("After remove: ${namesList}")

    namesList.add(0, "Sifat")
    println("After add: ${namesList}")

    // For set its same
    // For map:

    val nameMapIterator = namesMap.iterator()
    while(nameMapIterator.hasNext()) {
        val item = nameMapIterator.next()
        println("${item.key} => ${item.value}")
    }
}
