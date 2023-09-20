package oops


object Ex1 extends App{

  val writer = new Writer("Yann","Martel",1996)
  println(writer.fullName())

  val novel = new Novel("Life of Pi",2001,writer)
  println(s"year of book released ${novel.yor}")
  println("name of author is same : "+novel.isWrittenBy("Yann Martel"))
  println("changing birth year of author : "+novel.copy(2002))
  println(novel.authorAge())
  val newObj = novel.copyObj(2002)
  println("new time is : "+newObj.yor+" and the new object is :"+newObj)
  println("---------------------------------------------------------------")

  val cnt = new Count
  println("inserting a new value "+cnt.inputValue(5))
  println("incrementing value : "+cnt.incrementVal())
  println("decrementing value : "+cnt.decrementVal())
  println("incrementing operation with input value : "+cnt.incrementVal(500))
  println("decrementing operation with input value : "+cnt.decrementVal(cnt.incrementVal(500)))

  println("---------------------------------------------------------------------")
  val counter = new Counter(6)
  println(counter.inc.inc.count )
  counter.inc.inc.print

}

class Writer(fname:String,lname:String,year:Int){
  def fullName():String = {
    return fname+" "+lname
  }
}

class Novel(name: String, var yor : Int, author: Writer) {
  def authorAge(): Int = yor

  def isWrittenBy(nameOfAuthor: String): Boolean = nameOfAuthor == author.fullName()

  def copy(newYear: Int): Boolean = {
    yor = newYear
    true
  }
  def copyObj(newYear: Int) : Novel ={
    new Novel(name,newYear,author)
  }
}

class Count  {
  var value = 0;

  def inputValue(temp : Int) : Boolean={value=temp; true}
  def currentCount() : Int = value
  def incrementVal() : Int = {value = value+1; value}
  def decrementVal() : Int = {value = value-1; value}
  def incrementVal(amount:Int):Int = {amount+1}
  def decrementVal(amount:Int):Int = {amount-1}

}

class Counter(val count:Int=0){
  def inc = {
    println("incrementing")
    new Counter(count+1)
  }

   def dec : Counter = {
     println("decremention ")
     new Counter(count-1)
   }

  def print() = println(count)
}