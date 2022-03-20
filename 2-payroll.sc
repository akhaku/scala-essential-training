val rate = 10.5

def paycheck(salaried: Boolean, hours: Int) = {
  if (salaried) "Salaried, no need to calculate"
  else "$" + (Math.max(0, hours - 40) * rate * 1.5 + Math.min(40, hours) * rate)
}
