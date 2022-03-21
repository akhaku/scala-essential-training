import io.StdIn._

object Grades extends App {
  var done = false;
  while (!done) {
    val name = readLine("Enter the student name:")
    println("Enter student score:")
    val score = readDouble()
    val grade = if (score >= 90) "A" else if (score >= 80) "B" else if (score >= 70) "C" else if (score >= 60) "D" else "F"
    println("You received a" + (if (grade == "A" || grade == "F") "n " else " ") + grade)
    println("Enter true if done, false to continue")
    done = readBoolean()
  }
}
