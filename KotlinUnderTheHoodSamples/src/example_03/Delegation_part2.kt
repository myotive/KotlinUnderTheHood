
interface HasName {
    fun getName():String
}

/**
 * User class
 * Implements HasName interface
 */
class User(val n:String): HasName {
    override fun getName() = n
}

/**
 * Person class
 * Takes user as constructor parameter, implements the HasName interface,
 * but delegates implementation to the User class
 */
class Person(user:User): HasName by user


fun main(args: Array<String>) {
    val p = Person(User("Stephan"))

    // Prints 'Stephan'
    println(p.getName())
}
