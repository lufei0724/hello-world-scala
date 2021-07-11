package ordering

final case class Order(units: Int, unitPrice: Int) {
  val totalPrice: Double = units * unitPrice
}

object Order {
  implicit val ordering = Ordering.fromLessThan[Order]((o1, o2) => o1.totalPrice < o2.totalPrice)
}

object OrderByNumberOfUnit {
  implicit val ordering = Ordering.fromLessThan[Order]((o1, o2) => o1.units < o2.units)
}

object OrderByUnitPrice {
  implicit val ordering = Ordering.fromLessThan[Order]((o1, o2) => o1.unitPrice < o2.unitPrice)
}
