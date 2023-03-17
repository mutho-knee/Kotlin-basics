package Oop

fun main(args: Array<String>) {
    var p1 = Person("Petro", "28")
    p1.setResidence("Langata")
    println(p1.getResidence())
    println(p1.name)

    p1.setSalary(450000.00)
    println(p1.getSalary())

}
// abstraction denies you the access of adding your classes - add abstract infront of class
 class Person(var name:String, var age:String){
    private var salary:Double = 0.0
    private var residence:String = ""
    fun setSalary(salary:Double){
        this.salary = salary
    }
    fun getSalary():Double{
        return this.salary
    }
    fun setResidence(residence:String){
        this.residence = residence
    }
    fun getResidence():String{
        return this.residence
    }

    fun walk(){
        println("Yeah, I can walk")
    }
    fun run(){
        println("Yeah, I can run")
    }

}









