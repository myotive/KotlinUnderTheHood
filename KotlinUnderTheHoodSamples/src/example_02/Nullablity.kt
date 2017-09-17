package example_02

fun nulls(){

    val foo : String? = null

    // compiler is too smart to do this
    println(foo?.length)
}

/*fun nulls(){

    val foo : String? = "Hello"

    // again... compiler is too smart
    println(foo?.length)

}*/

/*fun nulls(foo : String?){

    // ah ha! There we go
    println(foo?.length)
}*/

/*
fun nulls(foo : String?){

    // elvis operator
    val result = foo?.length ?: -1

    println(result)
}
*/

/*
fun nulls(foo : String?){
    println(foo!!.length)
}
*/
