package example_04

fun notInlined(getString: () -> String?) = println(getString())

inline fun inlined(getString: () -> String?) = println(getString())


//fun test() {
//    var testVar = "Test"
//
//    notInlined { testVar }
//
//    inlined { testVar }
//}