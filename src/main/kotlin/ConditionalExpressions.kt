fun main(args: Array<String>) {
    var marks = 80
    var grade = if (marks <50){
        "E"
    }else if(marks <60){
        "D"
    }else if(marks <70){
        "c"
    }else if(marks <80){
        "B"
    }else{
        "A"
    }
    println(grade)

    var bettingNumber = 0
    var bettingResult = when(bettingNumber){
        1 -> {
            "You lost"
        }
        2 -> {
            "You won"
        }
        3 -> {
            "You lost"
        }
        else -> {
            "Please enter a number from 1-3 to bet"
        }
    }
    println(bettingResult)
}