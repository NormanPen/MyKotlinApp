import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var x = 3
    val name = "Nope"

    x = x*10
     println("x is $x.")
    println("pow! $name")

    while (x>20){
        x -= 1
        println("x is now $x")
    }
    println("--------------------")
    for (i in 1..10) {
        x += 1
        println("x is now $x")

    }
    println("--------------------")

    var y = 4
    while (y > 3) {
        println(y)
        y -= 1
    }

    val a = 3
    val b = 1
    if (a > b) {
        println("a is greater then b")
    } else {
        println("a is not greater then b")
    }
    println("this lines run no matter what")
    println(if(a>b) "a is greater then b" else "a is not greater then b")
    if(a>b) "a is greater then b" else "a is not greater then b"


}