fun main() {
    val coffeeMachine = PremiumCoffeeMachine(10000.0, "Brown")
    val info = coffeeMachine.machineInfo()
    val coffee = coffeeMachine.makeCoffee("CAPPUCCINO")

    println(coffee)
    println(info)

    val simpleCoffeeMachine = CoffeeMachine(2000.0, "Brown")
    val coffee1 = simpleCoffeeMachine.makeCoffee("CAPPUCCINO")
    println(coffee1)
}

/*
Theory:
Abstract: Define members or functions of a class without the actual implementation
If we don't have a value of a variable or body of a function that means it is abstract!

You don't need open keyword in abstract class. Instead of open keyword you will write abstract
You can not create instances/ object of abstract class! (For open class you can!)

When do you need an abstract class?
When you need a common set of rules for multiple classes, you can make a common abstract parent class, and you can derive your child classes using this common base class!
*/


class CoffeeMachine(
    price: Double,
    color: String
) : BaseCoffeeMachine(price, color) {
    override val brand: String
        get() = "Brand Y"

    override fun makeCoffee(type: String): String {
        Thread.sleep(4000) // takes 4 seconds to make coffee
        return "Your $type is ready"
    }

}

// child class
/*
error: child class extends a parent class
sol1: make child class abstract as well (irrelevant)
sol2: override/ implement/ define the implementations for all the abstract functions and variables
alt + enter: implement members
*/
class PremiumCoffeeMachine(
    private val price: Double,
    private val color: String,
) : BaseCoffeeMachine(price, color)
{
    fun makeCappuccino() {
        println("Make a cup of Cappuccino!")
    }

    // here we override brand and makeCoffee
    override val brand: String
        get() = "Brand X"

    override fun makeCoffee(type: String): String {
        // here we will define the actual implementation
        return "Your $type is ready"
    }

    /*You can also override open functions. must put open before function*/
    override fun machineInfo(): String {
        return super.machineInfo()
    }
}

// abstract parent class
abstract class BaseCoffeeMachine (
    private val price: Double,
    private val color: String,
)
{
//    will give error if I don't give any value. we need to explicitly tell that its abstract
    // to define abstract numbers and functions it must be inside abstract class
    abstract val brand: String // error is gone, it is abstract variable

    // we have an abstract function here, I do not have a body of this function
    // here abstract function means: we don't need to define the body of this function.
    // but we will define body when we implement the body in the child class
    abstract fun makeCoffee(type: String): String // can not have a body if abstract

    // you can define non-abstract function inside abstract class
    // open: to override in child class
    open fun machineInfo(): String {
        return "Coffee Machine Details: \n" +
                "Price: ${price}\n" +
                "Color: $color\n"
    }
}
