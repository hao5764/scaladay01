package com.smh.chp01
import util.control.Breaks._
/**
  * Created by smh on 2019/5/29.
  */
object TestScala {
  def main(args: Array[String]): Unit = {
    println("hello scala idea");
    var res=for(i <-  1 to 4) yield i
    println(res)
    var res2=for(i <-  1 to 4) yield{
      if(i %2 ==0) i
      else "bu shi ou shu"
    }
    println(res2)
    breakable{
      for(i <- 1 to 20){
        if(i==15){
          println("i="+i)
          break()
        }

      }
    }

    val dog = new Dog
    println(dog.sum(10,20))
    var f1=dog.sum _
    println("f1="+f1)
    println("f1="+f1(20,30))

    val f2=(n1:Int,n2:Int)=>{n1+n2}
    println("f2="+f2)
    println("f2="+f2(220,30))
  }
  def sum(n1:Int,n2:Int):Int={
    n1+n2
  }
}

class Dog{
  def sum(n1:Int,n2:Int):Int={n1+n2}
}