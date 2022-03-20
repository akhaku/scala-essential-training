var x = 10

println("while")
while (x >=0) {
  println(x)
  x -= 1
}

println("\ndo-while")
x = 10
do {
  println(x)
  x -= 1
} while (x >= 0)

println("\nfor")
for (x <- 10 to 0 by -1) {
  println(x)
}

println("\ncomprehension")
var v = for (x <- 10 to 0 by -1) yield x

val word = "Monday"
for (x <- 0 until word.length) println(word(x))
