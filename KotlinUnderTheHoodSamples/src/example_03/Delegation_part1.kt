package example_03


interface HasName {
    fun getName():String
}

/**
 * Person class
 * Implements HasName
 */
class Person: HasName {
    override fun getName():String = "Stephan"
}

fun main(args: Array<String>) {
    val p = Person()

    // Prints 'Stephan'
    println(p.getName())
}