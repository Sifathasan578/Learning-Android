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
}

// data??
data class Person (val firstName: String, val lastName: String, var nationality: String, var age: Int) {

}
