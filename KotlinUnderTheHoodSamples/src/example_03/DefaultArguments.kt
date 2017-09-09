package example_03

@JvmOverloads
fun DefaultArgumentTest(x : Int = 42){
    println(x)
}

fun bar(){
    DefaultArgumentTest()

    DefaultArgumentTest(x = 100)
}