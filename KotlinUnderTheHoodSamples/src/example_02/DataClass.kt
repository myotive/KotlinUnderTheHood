package example_02

data class User(val firstName : String, val lastName : String)

/**
 * Synthetic Copy Example
 * Decompile to see how Java uses synthetic copy method under the covers to allow you to
 * change specific values when copying.
 */
/*fun syntheticCopyExample(){
    val myUser = User(firstName = "Michael", lastName = "Yotive")
    println(myUser)

    val otherUser = myUser.copy(firstName = "Chris")
    println(otherUser)

    val otherUser2 = myUser.copy(lastName = "Jordan")
    println(otherUser2)
}*/

/**
 * Destructure object example
 */
/*fun destructureExample() {
    val myUser = User("Michael", "Yotive")

    val (firstName, lastName) = myUser

    println(firstName)
    println(lastName)
}*/
