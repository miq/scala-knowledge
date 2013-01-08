package de.miq.knowledge.structuraltyping

object StructuredDucks {

  type Animal = {
    def makeSound()
    def move() : Int
  }

  class Duck {
    def makeSound() {
      println("Quack!!")
    }

    def move(): Int = {
      println("toddle, toddle")
      return 2
    }
  }

  class Cat {
    def makeSound() {
      println("Meeouw!!")
    }
    def move(): Int = {
      println("tiptoe, tiptoe, tiptoe")
      return 3
    }
  }

  def noise(maker: { def makeSound(): Unit }) : Unit = {
    maker.makeSound()
  }

  def moveNoisy(a: Animal): Int = {
    val steps = a.move()
    a.makeSound()
    return steps + a.move()
  }

  def main(args: Array[String]) {
    val duck = new Duck()
    val cat = new Cat()
    noise(duck)
    noise(cat)
    println("Steps of: " + duck.getClass.getSimpleName + "=" + moveNoisy(duck))
    println("Steps of " + cat.getClass.getSimpleName + "=" + moveNoisy(cat))
  }
}
