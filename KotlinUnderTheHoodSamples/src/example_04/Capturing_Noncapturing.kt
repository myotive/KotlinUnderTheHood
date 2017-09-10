package example_04

/**
 * Lambda
 */
fun <T> runLambda (expression : () -> T) : T = expression()


fun Capturing(value : Int) : Int = runLambda { value }

fun NonCapturing() : Int{
    return runLambda { 3 }
}

fun main(args : Array<String>){
    Capturing(42)

    NonCapturing()
}