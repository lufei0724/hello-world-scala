package html

object Main extends App {
  val p = Person("Jonh", "john@example.com")

  import PersonImplicits._

  val personHtml = HtmlWriter[Person].write(p)
  println(personHtml)

  import HtmlImplicit._
  println(p.toHtml)
}
