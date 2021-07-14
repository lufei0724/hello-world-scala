package examples

object EitherExample extends App {
  def divideXBy(x: Int, y: Double): Either[String, Double] = {
      Either.cond(
          y != 0,
          x / y,
          "Dude, can't divide by 0"
      )
  }

  println(divideXBy(1, 0))
  println(divideXBy(1, 2))
  divideXBy(1, 0) match {
      case Left(s) => println("Answer: " + s)
      case Right(i) => println("Answer: " + i)
  }

  divideXBy(1, 2) match {
      case Left(s) => println("Answer: " + s)
      case Right(i) => println("Answer: " + i)
  }
}
