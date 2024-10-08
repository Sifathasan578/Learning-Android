fun main() {
    // Demo
    // Construction of Lists

    // Immutable List
    var namesList = listOf<String>("Sifat", "Imrul", "Hasan", "Arafat", "Shakil", "Mahfuz")
    println(namesList)
    var namesList2 = buildList<String> {
        add("Sifat")
        add("Imrul")
        add("Hasan")
        add("Arafat")
        add("Shakil")
        add("Mahfuz")
    }
    println(namesList2)

    // can't add anything as it is immutable
//    names.add // error


    var mNamesList = mutableListOf<String>("Sifat", "Imrul", "Hasan", "Arafat", "Shakil", "Mahfuz")
    mNamesList.add("Zarir")
    mNamesList.add("Saleh")
    // If I want to add at index = 2 I can do that. Other elements will go to the right
    mNamesList.add(3, "Abeer")
    println(mNamesList)

    // ----------------------------- Set ---------------------------------//
    var namesSet = setOf<String>("Sifat", "Hasan", "Tafis")
    println(namesSet)

    var namesMutableSet = mutableSetOf<String>("Sifat", "Hasan", "Tafis")
    namesMutableSet.add("Shakib")
    namesMutableSet.add("Tarek")
    namesMutableSet.add("Anik")
    namesMutableSet.add("Anik") // Duplicates will not be added
    namesMutableSet.add("Anik") // Duplicates will not be added
    println(namesMutableSet)


    // ----------------------------- Map ---------------------------------//
    // map: key, value
    var namesMap = mapOf<String, String>("Tamim" to "Chittagong", "Shakib" to "Magura", "Mushfiq" to "Bogura")

    println(namesMap)

    var namesMapMutable = mutableMapOf<String, String>("Tamim" to "Chittagong", "Shakib" to "Magura", "Mushfiq" to "Bogura")

    namesMapMutable["Mashrafe"] = "Norail"
    namesMapMutable.put("Kohli", "Delhi")

    println(namesMapMutable)

}
