package com.smh.sparkday02.ReadJson

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.experimental.ScalaObjectMapper
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.DeserializationFeature
/**
  * Created by smh on 2019/7/8.
  */
case class Person(name: String, lovesPandas: Boolean) // Note: must be a top level class
object TestReadJson {
  def main(args: Array[String]): Unit = {
    val conf =new SparkConf().setMaster("local").setAppName("my app")
    //val conf =new SparkConf().setAppName("world count")
    val sc =new SparkContext(conf)
    val inputFile=""
    val outputFile=""
    val input = sc.textFile(inputFile)

    val result = input.mapPartitions(records => {
      // mapper object created on each executor node
      val mapper = new ObjectMapper with ScalaObjectMapper
      mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
      mapper.registerModule(DefaultScalaModule)
      // We use flatMap to handle errors
      // by returning an empty list (None) if we encounter an issue and a
      // list with one element if everything is ok (Some(_)).
      records.flatMap(record => {
        try {
          Some(mapper.readValue(record, classOf[Person]))
        } catch {
          case e: Exception => None
        }
      })
    }, true)

    result.filter(_.lovesPandas).mapPartitions(records => {
      val mapper = new ObjectMapper with ScalaObjectMapper
      mapper.registerModule(DefaultScalaModule)
      records.map(mapper.writeValueAsString(_))
    })
      .saveAsTextFile(outputFile)
  }
}
