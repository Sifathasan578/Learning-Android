// An inline function is declare with a keyword 'inline'
// The use of inline function enhances the performance of higher order function
// The inline function tells the compiler to copy parameters and functions to the call site

fun main() {
    inlineFunction { println("Calling inline function") }
}

inline fun inlineFunction (fn: () -> Unit) {
    fn()
    println("Code inside Inline Function!")
}

// To be continued!
