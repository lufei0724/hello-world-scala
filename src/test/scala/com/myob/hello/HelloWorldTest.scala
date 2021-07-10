package com.myob.hello

import org.scalatest.funsuite._

final class HelloWorldTest extends AnyFunSuite {
  def sum(a: Int, b: Int): Int = a + b
  test("sum works for 1 + 2 = 3") {
    assert(sum(1, 2) == 3)
  }
}
