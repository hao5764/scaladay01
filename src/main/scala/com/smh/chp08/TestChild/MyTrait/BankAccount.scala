package com.smh.chp08.TestChild.MyTrait

/**
  * Created by smh on 2019/6/17.
  */
object BankAccount{
  def main(args: Array[String]): Unit = {
    var a=new CheckAcc(100)
    a.saveMoney(10)
    a.query()
    a.withDrawMoney(20)
    a.query()
  }
}

class BankAcc(initMoney:Double){
  private var money =initMoney

  def saveMoney(amount:Double) ={
    money+=amount
    money
  }
  def withDrawMoney(amount:Double)={
    money-=amount
    money
  }
  def query(): Unit ={
    println("当前余额："+money)
  }
}
class CheckAcc(initMoney:Double) extends BankAcc(initMoney){

  override def saveMoney(amount: Double): Double = super.saveMoney(amount-1)

  override def withDrawMoney(amount: Double): Double = super.withDrawMoney(amount+1)


}