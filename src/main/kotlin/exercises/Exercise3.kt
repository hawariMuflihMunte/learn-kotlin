package exercises

fun repeatStr(s: String, n: Int): String {
    var res: MutableList<String> = mutableListOf()

    for (i in 1..n) {
        res.add(s)
    }

    return res.joinToString("")
}
fun accum(s: String): String {
   var res: MutableList<String> = mutableListOf()

   for (i in 0..<s.length) {
       val s: String = s[i].uppercase() + repeatStr(s = s[i].lowercase(), n = i)
       res.add(s)
   }

    return res.joinToString("-")
}

fun main() {
    println(accum("abs"))
}
