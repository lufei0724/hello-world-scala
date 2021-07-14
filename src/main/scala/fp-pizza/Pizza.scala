package `fp-pizza`

import pizza.CrustSize
import pizza.CrustType
import pizza.Topping

final case class Pizza(
    crustSize: CrustSize,
    crustType: CrustType,
    toppings: Seq[Topping]
)