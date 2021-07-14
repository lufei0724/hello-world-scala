package animal

trait BehavesLikeHuman[A] {
  def speak(a: A): Unit
}

object BehavesLikeHuman {
  def speak[A](a: A)(implicit behaves: BehavesLikeHuman[A]): Unit = behaves.speak(a)
}

object BehavesLikeHumanInstances {
  implicit val dogBehavesLikeHuman = new BehavesLikeHuman[Dog] {
    def speak(dog: Dog): Unit = {
      println(s"I'm a Dog, my name is ${dog.name}")
    }
  }
}

object BehavesLikeHumanSyntax {
  implicit class BehavesLikeHumanOps[A](value: A) {
    def speak(implicit behavesLikeHumanInstances: BehavesLikeHuman[A]): Unit = {
      behavesLikeHumanInstances.speak(value)
    }
  }
}