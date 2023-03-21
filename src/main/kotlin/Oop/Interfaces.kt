package Oop

fun main(args: Array<String>) {
    var school1 = School()
    school1.mission()
    school1.motto()
}
interface A{
    fun motto(){
        println("This is our motto")
    }
}
interface B{
    fun mission(){
        println("This is our mission")
    }
}
class School: A, B


















