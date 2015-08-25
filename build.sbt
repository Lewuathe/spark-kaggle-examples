name := "kaggle-jobs"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.4.1",
  "org.apache.spark" %% "spark-sql" % "1.4.1",
  "org.apache.spark" %% "spark-mllib" % "1.4.1",
  "com.databricks" %% "spark-csv" % "1.2.0"
)
