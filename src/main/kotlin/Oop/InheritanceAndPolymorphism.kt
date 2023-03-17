package Oop

fun main(args: Array<String>) {
    // Inheritance and polymorphism
    var studentOne = Student("Jared", "jared@gmail.com", "jared123")
    var studentTwo = Student("Ephraim", "ephraim@gmail.com", "ephraim123")

    println(studentOne.name)
    studentTwo.register()

    var teacherOne = Teacher("Wanyama", "wanyama@gmail.com", "wanyama123")
    var teacherTwo = Teacher("Erick", "erick@gmail.com", "erick123")
    teacherTwo.login()
    println(teacherOne.email)
    teacherOne.suspendStudent()

    var headTeacherOne = HeadTeacher("Ken", "ken@gmail.com", "ken123")
    var headTeacherTwo = HeadTeacher("Susan", "susan@gmail.com", "susan123")

    println(headTeacherOne.name)
    headTeacherTwo.login()
    headTeacherOne.register()
    headTeacherTwo.suspendStudent()
    headTeacherOne.approveCash()

}

open class Student(open var name:String, open var email:String, open var password:String){

    init {
        this.name = name
        this.email = email
        this.password = password
    }
    fun register(){
        println("You registered with email $email and password $password")
    }
    fun login(){
        println("You logged in with email $email and password $password")
    }
}

open class Teacher(name:String, email:String, password:String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}

class HeadTeacher(name:String, email:String, password:String):Teacher(name, email, password){
    fun approveCash(){
        println("Yeah, I can approve cash")
    }
}
























