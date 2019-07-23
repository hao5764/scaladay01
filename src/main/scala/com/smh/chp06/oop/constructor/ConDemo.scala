package com.smh.chp06.oop.constructor

/**
  * Created by smh on 2019/6/10.
  */
object ConDemo {
  def main(args: Array[String]): Unit = {
    var p1=new Persion("jack",20)
    println(p1)
  }
}
class Persion(inName:String,inAge:Int){
  var name:String =inName
  var age:Int = inAge

  override def toString: String = {
    "name="+this.name+" age="+this.age
  }
}
