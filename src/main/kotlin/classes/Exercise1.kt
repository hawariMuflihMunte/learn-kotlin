package classes

data class Employee(val name: String, var age: Int, var salary: Int)

fun main() {
    val emp = Employee(name = "Mary", age = 20, salary = 120)
    println(emp)
    emp.salary += 10
    println(emp)
}
