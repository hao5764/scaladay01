package com.smh.chp08.TestChild.MyTrait

/**
  * Created by smh on 2019/6/17.
  */
object Exercise04 {
  def main(args: Array[String]): Unit = {
    println(Suits.toString())
    println(Suits.isRed(Suits.A))
    println(Suits.isRed(Suits.C))
  }
}

object Suits extends Enumeration{
  type Suits =Value
  val A = Value("A")
  val B = Value("B")
  val C = Value("C")
  val D = Value("D")

  override def toString(): String = {
    Suits.values.mkString(",")
  }
  def isRed(suits: Suits):Boolean={
    suits ==A || suits ==C
  }
}