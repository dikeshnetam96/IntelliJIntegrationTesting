package oops

import scala.language.postfixOps

object MethodNotationAssignment extends App{

  class Person(val name:String, val favoriteMovieName : String,val age : Int) {
    def +(str : String) : Person = new Person(s"${name} (${str})",favoriteMovieName,age)
    def unary_+ : Person = new Person(name,favoriteMovieName,age+1)
    def learns(str : String) : String = s"$name learns $str"
    def learnScala : Unit = println(learns("Scala"))
    def apply(num : Int) :String = s"$name watched inception $num times"
  }

  val mary = new Person("mary","Inception",25)
  var newMary = mary + "the rockstar"
  println(newMary.name + " "+newMary.favoriteMovieName+" "+newMary.age)

  newMary = newMary.unary_+
  println(newMary.name + " "+newMary.favoriteMovieName+" "+newMary.age)

  newMary = +newMary
  println(newMary.name + " "+newMary.favoriteMovieName+" "+newMary.age)

  println(newMary.learns("Automation Testing"))
  newMary learnScala

  println(newMary(2))

}
