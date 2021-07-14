package `fp-pizza`

import pizza.LargeCrustSize
import pizza.ThinCrustType
import pizza.Cheese
import pizza.Pepperoni
import pizza.Sausage

object Main extends App{
    import ToStringInstances.pizzaAsString
    import ToStringSyntax._

    val p = Pizza(LargeCrustSize, ThinCrustType, Seq(Cheese, Pepperoni, Sausage))
    println(p.asString)
}
