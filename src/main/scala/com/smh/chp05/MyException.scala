package com.smh.chp05

/**
  * Created by smh on 2019/6/10.
  */
object MyException {

  def main(args: Array[String]): Unit = {
    try{
      var l=10/0;
    }catch {
      case ex:ArithmeticException => println("ArithmeticException")
      case ex:Exception => println("catch exception")
    }finally {
      println("finally")
    }
  }
}
