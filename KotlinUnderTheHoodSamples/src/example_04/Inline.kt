package example_04

fun notInlined(getString: () -> String?) = println(getString())

inline fun inlined(getString: () -> String?) = println(getString())

/*
// Non-Inlined function call
fun testNonInlined() {
    val testVar = "Test"
    notInlined { testVar }
}

// Inline function call
fun testInlined(){
    val testVar = "Test"
    inlined { testVar }
}
*/
