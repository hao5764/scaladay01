package com.smh.sparkday02
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._
/**
  * Created by smh on 2019/7/12.
  */
object Test22 {
  def main(args: Array[String]): Unit = {
    val conf =new SparkConf().setMaster("local").setAppName("my app")
    val sc =new SparkContext(conf)
    val data=sc.textFile("C:\\Users\\smh\\Desktop\\22\\split_0.txt");
    val d=data.map(_.split(" "))//切分
    val dd=d.first().map(_.toDouble)//把每个string变成double
    val dd1=for(i <- 10 until 6811) yield dd(i);//取一个区间的
    val e=sc.parallelize(dd1) //重新转化成rdd
    val st=e.stats();//统计

  }
}
