package example_02

import java.util.*

class Transaction(val amount : Double, val date : Date)

/*
class Transaction(var amount : Double, var date : Date)
*/

/*
class Transaction(val amount : Double, val date : Date){
    constructor() : this(0.0, Date())
}
*/