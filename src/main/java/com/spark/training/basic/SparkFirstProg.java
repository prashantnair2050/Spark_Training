package com.spark.training.basic;

import java.util.ArrayList;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

public class SparkFirstProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SparkConf conf = new SparkConf().setMaster("local").setAppName("FirstApplication");
		
		JavaSparkContext sc = new JavaSparkContext(conf);
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Welcome to Spark Training");
		list.add("Welcome to Spark Training");
		list.add("Welcome to Spark Training");
		list.add("Welcome to Spark Training");
		list.add("Welcome to Spark Training");
		
		JavaRDD<String> dataRDD = sc.parallelize(list);
		
		System.out.println(dataRDD.count());
		
		sc.close();

	}

}
