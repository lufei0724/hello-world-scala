package html

case class Person(name: String, email: String)

object PersonImplicits {
  implicit object PersonWriter extends HtmlWriter[Person] {
    def write(person: Person) = s"<span>${person.name} &lt;${person.email}&gt;</span>"
  }


}