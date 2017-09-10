package example_04

fun <T> execute (expression : () -> T) : T = expression()


fun mutatingLambda() : Int{
    var x = 0
    execute { x++ }
    return x
}