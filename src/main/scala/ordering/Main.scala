package ordering

import scala.math.Ordering

object Main extends App {
  val orders = List(Order(1, 2), Order(2, 3), Order(3, 1))

  def orderByTotalPrice = {
    println("Ordering orders by total price")
    assert(orders.sorted == List(Order(1, 2), Order(3, 1), Order(2, 3)))
  }

  def orderByNumberOfUnit = {
    println("Ordering orders by number of units")
    import OrderByNumberOfUnit._
    assert(orders.sorted == List(Order(1, 2), Order(2, 3), Order(3, 1)))
  }

  def orderByUnitPrice = {
    println("ordering orders by unit price")
    import OrderByUnitPrice._
    assert(orders.sorted == List(Order(3, 1), Order(1, 2), Order(2, 3)))
  }

  orderByTotalPrice
  orderByNumberOfUnit
  orderByUnitPrice
}
