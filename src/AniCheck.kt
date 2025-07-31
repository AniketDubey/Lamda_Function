fun main() {
    /*val setTitle = {str:String -> println(str)}
    aniket("initial string",setTitle)*/
    aniket("initial string") { param1: Int, param2: Int ->
        val ani = 30
        val uts = ani * param1
        println(uts)
    }
}

fun aniket(ini: String, title: (Int, Int) -> Unit) {
    println(ini)
//      println(title(50))
    title(50, 0)
}
