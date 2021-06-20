// the sum of two number.
fun sum(number1: Int, number2: Int): Int{
    return number1 + number2
}

// Top-level variables
val PI = 3.14
var x = 0

fun incrementX(){
    x += 1
}

fun main(/*args: Array<String>*/) {
    println("Hello World!\n${sum(3,4)}")
    // val is used for only read-only local variable.
    // This means: they can only  once be assigned.
    val a: Int = 1 // immediate assignment
    val b = 2 // 'Int' type inferred
    val c: Int // required when no initializer provided
    c = 3 // deferred assignment
    // a, b, c are read-only local variables
    println("a = $a b = $b c = $c")
    // var is for variable which can be reassigned.
    var d = 5
    d += 1
    println("d = $d")

    println("x = $x; PI = $PI")
    incrementX()
    println("incrementX()")
    println("x = $x; PI = $PI")
    // varA = variableA
    var varA = 1
    val string1 = "varA is $varA"

    varA = 2
    // arbitrary expression in template:
    val string2 = "${string1.replace("is", "was")}, but now is $varA"

    println(string2)

}