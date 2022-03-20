def abs(x: Int) = if (x < 0) -x else x

def fac(x: Int) = {
  var sum = 1
  for (i <- 1 to x) sum *= i
  sum
}

def facR(x: Int): Int = if (x <= 0) 1 else x * facR(x - 1)

def printName(left: String = "[", fName: String, lName: String, right: String = "]") {
  println(left + fName + " " + lName + right)
}
// printName("[", "Foo", "Bar")
// printName(lName="Bar, fName="Foo")
// printName(right="]", lName="Bar, fName="Foo")

def sum(args: Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}
