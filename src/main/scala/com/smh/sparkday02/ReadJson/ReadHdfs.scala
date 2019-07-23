package com.smh.sparkday02.ReadJson
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._
/**
  * Created by smh on 2019/7/9.
  */
object ReadHdfs {
  def main(args: Array[String]): Unit = {
    val conf =new SparkConf().setMaster("local").setAppName("my app")
    //val conf =new SparkConf().setAppName("world count")
    val sc =new SparkContext(conf)
    val input=sc.textFile("hdfs://10.109.29.21:8020/hello.txt")
    input.foreach(println)
  }

}
