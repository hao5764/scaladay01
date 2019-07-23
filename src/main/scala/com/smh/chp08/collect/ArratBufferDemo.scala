package com.smh.chp08.collect

import scala.collection.mutable.ArrayBuffer
/**
  * Created by smh on 2019/7/18.
  */
object ArratBufferDemo {
  def main(args: Array[String]): Unit = {
    //创建
    val arr01 = ArrayBuffer[Int](1,2,3)
    //for(i<- arr01) println(i)
    val res=arr01.reduce(myMin)
    println("min arr01:"+res)
    arr01.append(10)
    val list=List(3,4,5)
    val l2=list.map(_*2)
    //l2.foreach(println)
    val name=List("zhang san li si wang wu","xianhe mahu wenha")
    val s=name.flatMap(_.split(" "))
    println(s)
  }
  def myMin(a:Int,b:Int): Int ={
    if (a<b) a
    else b
  }
}
