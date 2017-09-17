package example_03

class Foo(val i: Int)

/**
 * myMethod extension method
 * prints the value of property I
 */
fun Foo.myMethod() {
    println(i)
}

fun testExtensionMethod(){
    Foo(i = 1).myMethod()
}