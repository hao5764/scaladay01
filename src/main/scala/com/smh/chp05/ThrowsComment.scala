package com.smh.chp05

/**
  * Created by smh on 2019/6/10.
  */
object ThrowsComment {
  def main(args: Array[String]): Unit = {
    try{
      f11()
    }catch {
      case ex:NumberFormatException =>{
        println("hahahhahahaa")
      }
    }finally {
      println("final aaaaaaaaaa")
    }

  }
  @throws(classOf[NumberFormatException])
  def f11()={
      "abc".toInt
  }
}
