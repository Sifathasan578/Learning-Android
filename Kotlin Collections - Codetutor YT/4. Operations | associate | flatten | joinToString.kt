fun main() {
    var people = listOf<Person>(
        Person("Imrul", "Hasan", "Bangladeshi", 26),
        Person("Arafat", "Saykat", "Bangladeshi", 26),
        Person("Shakil", "Chowdhury", "Bangladeshi", 27),
        Person("Virat", "Kohli", "India", 35),
    )
//    println(people)

    // map
//    var tPeople = people.map { "${it.firstName} + ${it.lastName}" }

    // if we need index
    /*var tPeople = people.mapIndexed { index, person -> "${index}: ${person.firstName}" }
    println(tPeople)*/

    /*var tPeople = people.map {
        if(it.nationality !== "India") it.firstName else null
    }
    println(tPeople)*/

    // To ignore null in a transformation
    var tPeople = people.mapNotNull {
        if(it.nationality !== "India") it.firstName else null
    }
    println(tPeople) // null is ignored

    // mapIndexedNotNull: ignores the null, also provides you with index

    var exMap = buildMap<String, String> {
        put("Dhaka", "Capital")
        put("Chandpur", "District")
        put("Chittagong", "Division")
    }

    println(exMap)
    println(exMap.map { entry -> entry.key })
    println(exMap.mapKeys { it.key.uppercase() })

    // will not change
    println(exMap)

    //..................Zipping......................//
    // add two collections

    var cityList = listOf<String>("Dhaka", "Dhaka", "Dhaka", "Delhi")
    // len cityList = len people, must be equal length

    var zippedCityPeople = cityList.zip(people)
    println(zippedCityPeople)
    // Unzip
    println()
    println(zippedCityPeople.unzip().first)
    println(zippedCityPeople.unzip().second)

    println()
    println()
    //.....................................Associate.......................................//
//    val associatedList = people.associate { it -> Pair(it.firstName + it.lastName + it.age, it) }
    val associatedList = people.associateBy { it.firstName }
    associatedList.forEach { first, second -> println("${first} -> ${second}") }

    // what it does is created a map out of a list where you set a rule how to generate a key for a value in the list


    //.....................................Flatten.......................................//
    val nameList1 = listOf<String>("Tamim", "Mushfiq")
    val nameList2 = listOf<String>("Virat", "Rohit")
    val nameList3 = listOf<String>("Kane", "Conway")

    // Nested List
    val listOfList = listOf<List<String>>(nameList1, nameList2, nameList3)
    println(listOfList) //[[Tamim, Mushfiq], [Virat, Rohit], [Kane, Conway]]
    // if we want to put all these into a single list:
    println(listOfList.flatten()) // [Tamim, Mushfiq, Virat, Rohit, Kane, Conway]


    //.....................................String Presentation.......................................//
    // how do you want to represent a list
    var cityList2 = listOf<String>("Dhaka", "Dhaka", "Dhaka", "Delhi")
    // converts this to one string
//    println(cityList2.joinToString())
    // remove comma
    println(cityList2.joinToString(separator = " | ", prefix = "Start here: ", postfix = " Ends here"))
}

// data??
data class Person (val firstName: String, val lastName: String, var nationality: String, var age: Int) {

}
