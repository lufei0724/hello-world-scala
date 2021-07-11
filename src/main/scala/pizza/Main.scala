package pizza

import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val p1 = new Pizza(
    MediumCrustSize,
    ThickCrustType,
    ArrayBuffer(Cheese)
  )

  val p2 = new Pizza(
    LargeCrustSize,
    ThinCrustType,
    ArrayBuffer(Cheese, Pepperoni, Sausage)
  )

  val address = new Address(
    "123 Main Street",
    "Apt. 1",
    "Takeetna",
    "Alaska",
    "99676"
  )

  val customer = new Customer(
    "Peter Murphy",
    "0452-111-222",
    address
  )

  val order = new Order(
    ArrayBuffer(p1, p2),
    customer
  )

  order.addPizza(
    new Pizza(
      SmallCrustSize,
      ThinCrustType,
      ArrayBuffer(Cheese, Mushrooms)
    )
  )

  order.printOrder
}
