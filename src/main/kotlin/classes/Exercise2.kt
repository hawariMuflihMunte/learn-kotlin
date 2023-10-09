package classes

import kotlin.random.Random

data class EmployeeData(val name: String, var salary: Int)

class RandomEmployeeGenerator(var minSalary: Int , var maxSalary: Int) {
    val names: List<String> = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")

    fun generateEmployee() = EmployeeData(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
}

fun main() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}
