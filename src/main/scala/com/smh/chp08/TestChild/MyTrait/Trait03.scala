package com.smh.chp08.TestChild.MyTrait

/**
  * Created by smh on 2019/6/17.
  */
object Trait03 {
  def main(args: Array[String]): Unit = {
    val sheep=new Sheep
    sheep.sayHi()
    sheep.sayHello()
    val p=new Point(3,4)

  }
}
trait Tra03{

  def sayHi()

  def sayHello():Unit={
    println("say Hello")
  }
}

class Sheep extends Tra03{
  override def sayHi(): Unit = {
    println("Sheep say hi")
  }
}

class Point(x:Int,y:Int){
  var x1=x
  var y1=y
}
object Point{
  def apply(x: Int, y: Int): Point = new Point(x, y)
}

