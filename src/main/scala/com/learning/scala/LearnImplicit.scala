package com.learning.scala

import org.apache.spark.sql.SparkSession

object LearnImplicit {

  implicit class ModelParams(arg: Array[String]){
    val a: String = arg(0)
    val b: String = arg(1)
  }

  def main(args: Array[String]): Unit = {

    implicit val spark = SparkSession.builder().getOrCreate()

    val uImp = new UseImplicit(args)(spark)

  }

}
