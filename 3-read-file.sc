import io.Source._

object readFromFiles extends App {
  val filename = "rainbow.txt"
  for (line <- fromFile(filename).getLines()) {
    println(line.toUpperCase)
  }
  println("")
  val lines = fromFile(filename).getLines().toList
  lines.foreach(println)
}
