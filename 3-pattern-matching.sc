object patternMatching extends App {
  def greekAlphabet(letter: Char) = {
    letter match {
      case 'a' | 'A' => "Alpha"
      case 'b' | 'B' => "Beta"
      case _ => "Unknown"
    }
  }

  def max(x: Int, y: Int) = x>y match {
    case true => x
    case false => y
  }

  println(max(1,2))
  println(max(2,3))

  println("The greek letter is " + greekAlphabet('c'))
}
