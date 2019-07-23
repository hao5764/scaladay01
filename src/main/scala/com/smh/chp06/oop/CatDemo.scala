package com.smh.chp06.oop

/**
  * Created by smh on 2019/6/10.
  */
object CatDemo {
  def main(args: Array[String]): Unit = {
    val cat =new Cat
    cat.name="xiaobai"
    cat.age=10
    cat.color="white"
  }
}
class Cat{
  var name:String =""
  var age:Int=_
  var color:String =_

}
