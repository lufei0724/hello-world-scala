package examples

object ForComprenhensionExample extends App{
  println("=== Running example one ===")
  ExampleOne.run

  println("=== Running example two ===")
  ExampleTwo.run

  println("=== Running example three ===")
  ExampleThree.run

  println("=== Running example four ===")
  ExampleFour.run
}

object ExampleOne {
  case class Book(author: String, title: String) 

  def getTitlesByFor(books: List[Book]): List[String] = for {
    book <- books
    if book.author startsWith "Bob"
  } yield book.title

  def getTitlesByMap(books: List[Book]): List[String] = 
    books.withFilter(_.author.startsWith("Bob")).map(book => book.title)

  def run(): Unit = {
    val books = List(Book("Peter", "Hello World"), Book("Bobo", "Scala red book"), Book("Boba", "Funcntional Programming"))

    println(getTitlesByFor(books))
    println(getTitlesByMap(books))
  }
}

object ExampleTwo {
  case class Book(authors: List[String], title: String)

  def getTitlesByFor(books: List[Book]): List[String] = for {
    book <- books
    author <- book.authors    
    if author startsWith "Bob"
  } yield book.title

  def getTitlesByMap(books: List[Book]): List[String] = 
    books.flatMap(book => book.authors.withFilter(author => author.startsWith("Bob")).map(author => book.title))

  def run(): Unit = {
    val books = List(
      Book(List("Boba"), "Functional Programming"),
      Book(List("Bobo, Peter"), "Scala Red Book"),
      Book(List("Peter", "Boboca"), "Hello World"),
    )

    println(getTitlesByFor(books))
    println(getTitlesByMap(books))
  }

}

object ExampleThree {
  def composeByFor(optA: Option[String], optB: Option[String]): Option[(String, String)] = for {
    a <- optA
    b <- optB
  } yield (a, b)

  def composeByMap(optA: Option[String], optB: Option[String]): Option[(String, String)] = 
    optA.flatMap(a => optB.map(b => (a, b)))

  def run(): Unit = {
    val optA: Option[String] = Some("a value")
    val optB: Option[String] = Some("b value")

    println(composeByFor(optA, optB))
    println(composeByMap(optA, optB))
  }

}

object ExampleFour {
  def composeByFor(optA: Option[String], optB: Option[String]): Option[(String, String)] = for {
    a <- optA
    if a.startsWith("c")
    b <- optB
  } yield (a, b)

  def composeByMap(optA: Option[String], optB: Option[String]): Option[(String, String)] = 
    optA.withFilter(_.startsWith("c")).flatMap(a => optB.map(b => (a, b)))

  def run(): Unit = {
    val optA: Option[String] = Some("a value")
    val optB: Option[String] = Some("b value")

    println(composeByFor(optA, optB))
    println(composeByMap(optA, optB))
  }
}


