package com.smh.chp08.TestChild.TestApply

/**
  * Created by smh on 2019/6/17.
  */
object TestApply {

  def main(args: Array[String]): Unit = {
    val pig2 =Pig("文蛤")
    val pig3 =Pig("马户")
    println("pig2"+pig2.name)
    println("pig3"+pig3.name)
  }

}
class Pig(pName:String){
  var name :String =pName
}
object Pig{
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("匿名猪")
}
