package example_03

class Foo(val i: Int)

/**
 * myMethod extention method
 * returns "i" property
 */
fun Foo.myMethod() : Int {
    return i
}

fun useMethod(){
    Foo(1).myMethod()
}