object payroll extends App {
  val e1 = new Employee("Sam", "Paulson")
  val e2 = new Employee("Doris", "Jones", 's')
  println(e1)
  println(e2)

  println(Person("Foo", 23))
  println(Person("Bar", 20))

  for (person <- List(Person("A", 12), Person("B", 33), Person("C", 12))) {
    person match {
      case Person("A", 12) => println(s"Hi ${person.fName}")
      case _ => println("Unknown user")
    }
  }

  val accounts = List(
    new BankAccount("Jack Jones", 10.20),
    new BankAccount("Jack Jones", 30.20, "Savings"),
    new BankAccount("Mark Madison", 10.20, "Savings"),
    new BankAccount("Victor Vergera", 10.20, "Checking"),
    new BankAccount("Thomas Tompson", 10.20, "Checking"),
    new BankAccount("Sam Smith", 10010.20))
  accounts.foreach(println)
}

class Employee(val fName: String, val lName: String, var salaried: Char = 'n') {
  private def fullName: String = s"$fName $lName"
  val id = Employee.newId
  override def toString = s"Employee name $fullName\nEmployee ID: $id\n${if (salaried == 'n') "Hourly " else "Salaried"} Employee\n${"="*20}"
}

// companion object
object Employee {
  var employeeId = 0
  def newId = {
    employeeId += 1
    employeeId
  }
}

// all params immutable, has equals/hashCode. also companion object to allow creating without new
case class Person(fName: String, age: Int)

class BankAccount(val clientName: String, val balance: Double, val accountType: String = "Checking") {
  val accountNumber = BankAccount.generateNumber
  override def toString = s"$accountNumber ($clientName)\nType: $accountType\nBalance: $$$balance\n${"*"*20}"
}

object BankAccount {
  var number = 5000
  def generateNumber = {
    val ret = number
    number += 1
    ret
  }
}
