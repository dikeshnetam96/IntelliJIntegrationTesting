package oops

object ObjectScala extends App{

  object cls{
    var num = 4
    def apply(str : String) : String = "hiii"
  }

  class cls(str : String){
    val num = 5
  }

  val obj1 = cls
  val obj2 = cls


  obj1.num = 5
  println(obj1.num)
  println(obj2.num)

  println(obj1)
  println(obj2)
  println(obj1==obj2)

  val obj3 = new cls("abc")
  val obj4 = new cls("xyz")

  println(obj3)
  println(obj4)

  println(obj1("hi"))

}
