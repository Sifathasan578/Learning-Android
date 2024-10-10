fun main() {
    val oCoffeeMachine = BaseCoffeeMachine(10000.0, "Brown")

    oCoffeeMachine.makeCoffee()


    val oCoffeeMachineChild = PremiumCoffeeMachine(1500.0, "Black")
    oCoffeeMachineChild.makeCoffee() // inheriting from base class

    /*makeCoffee(): Make a cup of coffee!
    makeCoffee(): Make a cup of coffee!
    makeCoffee1(): makeCoffee(): Make a cup of coffee!*/

    oCoffeeMachineChild.makeCappuccino()
    oCoffeeMachineChild.makeCoffee()
}

// open: it makes this class inheritable
open class BaseCoffeeMachine(
    private val price: Double,
    private val color: String,
)
{
    fun makeCoffee() {
//        print("makeCoffee(): ")
        println("Make a cup of coffee!")
    }
}

/*all the classes in kotlin are final by default, so it not allowed to inherit a default class
*
* To inherit a class you need to tell explicitly that I want to inherit this class, by giving open to parent class */

class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String,
) : BaseCoffeeMachine(price, color)
{
    /*fun makeCoffee1 () {
        print("makeCoffee1(): ")
        makeCoffee() // can not access it even if is parent because of private
    }*/

    fun makeCappuccino() {
        println("Make a cup of Cappuccino!")
    }
}
