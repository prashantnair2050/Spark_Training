package com.spark.training.basic;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkSecondProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SparkConf conf = new SparkConf().setMaster("local").setAppName("FirstApplication");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		JavaRDD<String> fileRDD = sc.textFile("file:///D:/words.txt");
		
		System.err.println("Welcome \n See this line");
		System.out.println(fileRDD.collect());
		
		//long counts= fileRDD.count();
		
		fileRDD.repartition(1).saveAsTextFile("file:///D:/Output/Output1");
		sc.close();

	}

}
