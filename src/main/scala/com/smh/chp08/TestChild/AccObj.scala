package com.smh.chp08.TestChild

/**
  * Created by smh on 2019/6/17.
  */
object AccObj {
  def main(args: Array[String]): Unit = {
    val child1 =new Child02("亚索")
    val child2 =new Child02("盲僧")
    val child3 =new Child02("显赫")
    Child02.joinGame(child1)
    Child02.joinGame(child2)
    Child02.joinGame(child3)
    Child02.showNum()
  }
}
class ScalaPersion{
  var name :String =_

}
object ScalaPersion{
  var sex :Boolean =_
  def sayHi():Unit={
    println("hi~")
  }
}
class Child02(cname:String){
  var name :String = cname

}
object Child02{
  var tot:Int=0;
  def joinGame(child02: Child02):Unit={
    tot +=1 ;
    println(child02.name+"加入到游戏 ")
  }
  def showNum():Unit={
    printf("当前有 %d 个小孩玩游戏\n",tot)
  }
}
