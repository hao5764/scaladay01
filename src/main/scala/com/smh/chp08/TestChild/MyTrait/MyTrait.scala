package com.smh.chp08.TestChild.MyTrait

/**
  * Created by smh on 2019/6/17.
  */
object MyTrait {
  def main(args: Array[String]): Unit = {
    val c =new CC
    val f =new FF
    c.getConnect()
    f.getConnect()
  }
}

trait Trait01{
  def getConnect()
}

class AA{

}
class BB extends  AA{}
class CC extends  AA with Trait01{
  override def getConnect(): Unit = {
    println("connect orical")
  }
}

class DD{}
class EE extends DD{}
class FF extends DD with Trait01{
  override def getConnect(): Unit = {
    println("connect mysql")
  }
}