fun main() {
    val person = Person().apply {
        name = "Sifat"
        age = 26
    }

    var str = with(person) {
        println(name)
        println(age)
        "last statement returned"
    }
    println(str)

    // To modify or perform some additional things:
    person.also {
        it.name = "Imrul Hasan"
        println(it.name)
    }
}
