fun main() {
    // ..................................filer.............................................//
    // sample list
    var people = listOf<Person>(
        Person("Imrul", "Hasan", "Bangladeshi", 26),
        Person("Arafat", "Saykat", "Bangladeshi", 26),
        Person("Shakil", "Chowdhury", "Bangladeshi", 27),
        Person("Virat", "Kohli", "Indian", 35),
        Person("Rohit", "Sharma", "Indian", 36),
        Person("Devon", "Conway", "Kiwi", 36),
        Person("Ab", "Devillars", "Proteas", 37),
    )

    println()
    println()
    // filtering
    people.filter { it.nationality == "Indian" }.forEach { println(it) } // will give me people with Indian
    println()
    people.filter { it.age >= 35 }.forEach { println(it) } // will give me people with age >= 35
    println()
    people.filter { it.age < 35 }.forEach { println(it) }

    println()
    println("filterIndexed: ")
    people.filterIndexed { index, person -> index % 2 !== 0 && person.age >= 35 }.forEach { println(it) }

    // Filter with map
    var exMap = buildMap<String, String> {
        put("Dhaka", "Capital")
        put("Chandpur", "District")
        put("Chittagong", "Division")
    }
    exMap.filter { entry -> entry.key.equals("Dhaka") }.forEach { t, u -> println("${t}, ${u}") }




    //.........................................On Hold For now..........................................................//
}

// data??
data class Person (val firstName: String, val lastName: String, var nationality: String, var age: Int) {

}
