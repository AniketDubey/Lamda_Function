fun main() {
    val scopeFunction = ScopeFunction()
    val totalAmount = scopeFunction.addScopeFunction(10).addScopeFunction(20)
    println(totalAmount.totalSum)
}

class ScopeFunction {
    var totalSum = 0

    /*fun addScopeFunction(toAdd: Int): ScopeFunction {
        totalSum += toAdd
        return this@ScopeFunction
    }*/
//    fun addScopeFunction(toAdd: Int) = apply { totalSum += toAdd }
    fun addScopeFunction(toAdd: Int) = also { totalSum += toAdd }
}