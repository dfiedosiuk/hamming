object Hamming extends App {

  def calculate(origin: String, replica: String): Option[Int] = {
    val dnaLetters = List('C','A','G','T')
    if (origin.length == replica.length && (origin++replica).forall(dnaLetters.contains)) {
      val differences = origin.zip(replica).foldLeft("") { (result, n) =>
        if (n._1 == n._2) result
        else result + n._1
      }
      println(s"Hamming distance is ${differences.length}")
      Some(differences.length)
    } else {
      println("Invalid input! ")
      None
    }
  }

}

