fun main(args: Array<String>) {
    // WHILE LOOPS
        // while loop
    var counterOne = 0
    while(counterOne <=5){
        println(counterOne)
        counterOne++
    }
        // do while loop
    var counterTwo = 50
    do{
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)

    // FOR LOOPS
        // for in loop
    for(num in 20 .. 25){
        println(num)
    }
    for(num in 50 downTo 45){
        println(num)
    }
        // for each loop
    var names = listOf("Michelle", "Abdi", "Ephraim", "Tapiwa", "Karen")
    names.forEach{
        println(it)
    }

    // REPEAT LOOP
    repeat(5){
        println("Hello world")
    }
}