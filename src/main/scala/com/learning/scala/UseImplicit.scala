package com.learning.scala

import org.apache.spark.sql.SparkSession
import LearnImplicit.ModelParams

class UseImplicit (args: Array[String])(implicit val spark: SparkSession) {
  println(args.a)
  println(args.b)

  val baby = new ChildClass(args)
  println(baby.c)
  spark.conf.getAll.foreach{println}
}
