fun main() {
  println("${max(3, 4)}, ${max(4, 3)}")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
