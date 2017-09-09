package example_03

class Foo(val i: Int)

fun Foo.myMethod() : Int {
    return i
}

fun useMethod(){
    Foo(1).myMethod()
}