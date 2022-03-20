def double(i: Int) = i*2
val triple = (i: Int) => i*3

def higherOrder(x: Int, y: Int => Int) = y(x)

def picker(i: Int) = {
  if (i == 2) {
    double(_)
  } else if (i == 3) {
    triple
  } else {
    a:Int => a
  }
}

def counter(step: Int) = {
  var value = 0
  () => {
    value += step
    value
  }
}

// val c = counter(2)
// c() => 2
// c() => 4
// c() => 6
