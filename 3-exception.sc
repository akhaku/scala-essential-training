import java.io.FileNotFoundException
import io.Source.fromFile

object errorHandling extends App {
  try {
    for (line <- fromFile("nofile.txt").getLines())
      println(line.toLowerCase())
  } catch {
    case e:FileNotFoundException => println("The file was not found")
    case _:Exception => println("Your program failed")
  }
}
