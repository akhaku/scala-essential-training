def arr1 = new Array[Int](10) // array of 10 elements, all initialized to 0
def arr2 = Array[Int](10) // array of one element
def arr3 = Array(1, 2, 3)

def min(arr: Array[Int]) = arr.reduce(Math.min(_, _))
def max(arr: Array[Int]) = arr.reduce(Math.max(_, _))
def avg(arr: Array[Int]) = arr.reduce(_ + _) * 1.0 / arr.length
