fun main(args: Array<String>) {
    //IF STATEMENTS
    var age = 20
    if(age < 18){
        println("You are underage")

    }else {
        println("Welcome to the party")
    }
    var weight = 100
    var height = 1.9
    var bmi = weight / (height * height)
    if(bmi <= 18) {
        println("Underweight")
    }else if (bmi <= 29) {
        println("Normal weight")
    }else if (bmi <= 34) {
        println("Overweight")
    }else{
        println("Obese")
    }
    var grade = 60
    if(grade <50){
        println("average")
    }else{
        println("pass")

    }
    var mark = 'B'
    var score = 70
    if (score <70){
        println("Below Passmark")
    }else{
        println(mark)
    }


    //WHEN STATEMENTS
    var bettingNumber = 3
    when(bettingNumber){
        1 ->{
            println("Busted")
        }
        2 ->{
            println("You lost")
        }
        3 ->{
            println("You won")
        }
        4 ->{
            println("You lost")
        }
        5 ->{
            println("Busted")
        }
        else->{
            println("Please enter a number from 1 - 5 to bet")
        }
    }

}