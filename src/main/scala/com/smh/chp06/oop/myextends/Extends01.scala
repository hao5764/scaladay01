package com.smh.chp06.oop.myextends

/**
  * Created by smh on 2019/6/11.
  */
object Extends01 {
  def main(args: Array[String]): Unit = {
    var student=new Student
    student.name="jack"
    student.age=10
    student.studying()
    student.showInfo()

    var p1=new Person
    var stu1=new Student

    p1=stu1
    var stu2=p1.asInstanceOf[Student]
    stu2.name="pony"
    stu2.age=11
    stu2.studying()
  }
}
class Person{
  var name:String =_
  var age:Int = _
  def showInfo():Unit={
    println("Person info:")
    println("name="+name+" age="+age)
  }
}
class Student extends Person{
  def studying():Unit={
    println(this.name+" study scala")
  }

  override def showInfo(): Unit = {
    super.showInfo()
    println("Person info:")
    println("name="+name+" age="+age)
  }
}
