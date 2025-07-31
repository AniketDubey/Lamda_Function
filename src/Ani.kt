fun main() {
    val objC1 = C()
}


open class A {
    init {
//        println("from A")
        println("from $this")
    }
}

open class B : A() {
    init {
//        println("from B")
        println("from $this")
    }
}

class C : B() {
    init {
//        println("from C")
        println("from $this")
    }
}