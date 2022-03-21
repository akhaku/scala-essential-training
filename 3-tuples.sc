val arr1 = Array(1, 2, 3)
val arr2 = Array('a', 'b', 'c')
val zipped = arr1.zip(arr2)

for ((n, c) <- zipped) println("number: " + n + ", char: " + c)

def divide10(n: Int): Tuple2[Int, Int] = (n / 10, n % 10)

def divide(n: Int): List[Int] = if (n / 10 == 0) List(n) else divide(n / 10) ++ List(n % 10)
