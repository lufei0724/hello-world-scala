package json

object Main extends App {

  import JsonWriterInstances._
  val p = Person("Dave", "dave@example.com")
  println(Json.toJson(p))
}
