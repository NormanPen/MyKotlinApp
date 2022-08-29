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
}