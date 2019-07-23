package com.smh.chp06.oop.myextends

/**
  * Created by smh on 2019/6/11.
  */
object ScalaBaseCon {
  def main(args: Array[String]): Unit = {
    val emp=new Emp700(  )
    val emp2=new Emp700("pony")

  }
}
class Person700{
  var name:String = _
  println("Person 700....")
}
class Emp700 extends  Person700{
  println("Emp 700......")

  def this(name:String){
    this
    this.name=name
    println("Emp 辅助构造器~~")
  }
}

abstract class Animal{
  var name :String
  var age :Int
  var color :String ="black"
  def cyr()

}