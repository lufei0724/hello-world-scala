import scala.math.Ordering

final case class Rational(numerator: Int, denominator: Int)

object Rational {
  implicit val rationalOrdering = Ordering.fromLessThan[Rational]((r1, r2) =>
    r1.numerator * r2.denominator < r2.numerator * r1.denominator)
}

object Example {
  implicit val rationalOrdering = Ordering.fromLessThan[Rational]((r1, r2) =>
    r1.numerator * r2.denominator > r2.numerator * r1.denominator)
  def example() =
    println(List(Rational(1, 2), Rational(3, 4), Rational(1, 3)).sorted)
}

Example.example()



