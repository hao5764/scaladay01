package com.smh.sparkday01

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._
/**
  * Created by smh on 2019/7/3.
  */
object worldCount {
  def main(args: Array[String]): Unit = {
    val conf =new SparkConf().setMaster("local").setAppName("my app")
    //val conf =new SparkConf().setAppName("world count")
    val sc =new SparkContext(conf)
//    val input=sc.textFile("C:\\Users\\smh\\Desktop\\in.txt")
//    val words=input.flatMap(line => line.split(","))
//    val counts=words.map(word => (word,1)).reduceByKey(_+_)
//    counts.saveAsTextFile("C:\\Users\\smh\\Desktop\\out")
//    val nums=sc.parallelize(List(1,2,3,4))
//    val res=nums.map(x => x*x);
//    res.foreach(println)
    // ---------------------------------------------------
//    val input=sc.textFile("C:\\ Users\\smh\\Desktop\\in2.txt")
//    val words=input.map(line => (line.split(" ")(0),line))
//    val res=words.filter{case (key,value) => value.length<20}
//    res.foreach(println)
    //-------------------------------------------------------

    val data=Seq(("100",Seq("101","102")),("102",Seq("100","105")),("103",Seq("104","101")),("105",Seq("102","107")))
    val links=sc.parallelize(data).partitionBy(new HashPartitioner(1)).persist()
    var ranks=links.mapValues(v=>1.0)
    for(i <- 0 until 10){
      val contributions=links.join(ranks).flatMap{
        //case (x,(y,z)) => y.map(d => (d,z / y.size))
        case(pageId,(links,rank))=>links.map(dest=>(dest,rank/links.size))
      }
      ranks=contributions.reduceByKey((x,y)=>x+y).mapValues(v =>0.15+0.85*v)
    }
    ranks.saveAsTextFile("C:\\Users\\smh\\Desktop\\out5")
  }
}