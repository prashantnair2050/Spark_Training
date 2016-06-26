package com.spark.training.basics

import org.apache.spark.SparkConf

object FirstApp {
  def main(args: Array[String]): Unit = {
    
    val sc = new SparkConf().setMaster("local").setAppName("First APp")
    
    
  }
}