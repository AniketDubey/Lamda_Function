fun main(){
    val aniketLamda = {
        x:String,y:Int->
        println(x)
        y+10
    }
    /*lambdaFunc(10){x,y->
        println(x)
        y + 10
    }*/
    lambdaFunc(10,aniketLamda)
}

fun lambdaFunc(param1:Int,param2: (String,Int)->Int){
    println(param1)
//    println(param2.invoke("Aniket",100))
    val finalAns = param2("Aniket",100)
    println(finalAns)
}