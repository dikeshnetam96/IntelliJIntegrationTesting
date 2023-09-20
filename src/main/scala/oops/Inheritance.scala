package oops

object Inheritance extends App {

  sealed class Animal {

    val creatureType = "Wild"

    def eat = println("animalClass")

    def methodToBeUsed(): String = "hi i have be called"
  }

  // Extends used for inherit Animals in Cat class
  class Cat extends Animal {
    def callMecat = {
      eat // it will call eat value which is defined in Animal class (Parent Call)
      println("eat called from animal class...")
    }
  }

  val cat = new Cat
  cat.callMecat

  // constructor declaration during Class declaration
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  // constructor call be called like this as well
  // for class Person there is two constructor declared
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  /*
    class Dog extends Animal{
    override def eat = println("yo")
    }
    val dog = new Dog
    dog.eat
    */
  class Dog(override val creatureType: String) extends Animal {
    override def eat = {
      super.eat // Super : when we want the reference a method or field from parent call.
      println("Override in Dog Class")
    }

    println(creatureType)
  }

  val dog = new Dog("Testing")

  // Type Substitution (broad : polymorphism)
  val unknownAnimal: Animal = new Dog("k9")
  unknownAnimal.eat

  //overRiding and OverLoading
  // Preventing Overrides
  // 1 - use final keyword  -> it will not let child classes to override that field or method.
  // 2 - use final on the entire class
  // 3 - seal the Class == extend classes in THIS FILE, prevent extension in other files

}
