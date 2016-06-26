name := "SparkInstructorPPN"
 
version := "1.0"
 
scalaVersion := "2.10.4"
 
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.6.0"
libraryDependencies += "org.apache.spark" %% "spark-graphx" % "1.6.0"

 
resolvers += "Akka Repository" at "http://repo.akka.io/releases/"