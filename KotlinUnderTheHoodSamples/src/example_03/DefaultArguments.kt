package example_03

//@JvmOverloads
fun DefaultArgumentFunction(x : Int = 42){
    println(x)
}

fun testDefaultArgument(){
    DefaultArgumentFunction()

    DefaultArgumentFunction(x = 100)
}