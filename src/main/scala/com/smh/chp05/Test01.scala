package com.smh.chp05
import util.control.Breaks._
/**
  * Created by smh on 2019/6/10.
  */
object Test01 {
  def main(args: Array[String]): Unit = {
    lazy val s=sum(10,20)
    println("-----------")
    println("s=" +s)
  }
  def sum(n1:Int,n2:Int):Int={
    println("sum=" + (n1+n2))
    n1+n2
  }

}
