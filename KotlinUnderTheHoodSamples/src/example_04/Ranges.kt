package example_04

fun rangeTest(){
    for(i in (1..10)){
        println(i)
    }
}

fun rangeTestWithForEach(){
    (1..10).forEach{
        println(it)
    }
}

fun rangeTestWithForEachAndStep(){
    for (i in (1..10) step 1) {
         println(i)
     }
}

