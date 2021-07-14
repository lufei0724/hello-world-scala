package animal

object Main extends App{
  import BehavesLikeHumanInstances.dogBehavesLikeHuman
  val rover = Dog("Rover")
  BehavesLikeHuman.speak(rover)

  import BehavesLikeHumanSyntax.BehavesLikeHumanOps
  val woof = Dog("Woof")
  woof.speak
}
