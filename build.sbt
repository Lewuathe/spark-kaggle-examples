name := "spark-kaggle-examples"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.databricks" %% "spark-csv" % "1.2.0"
)

spName := "lewuathe/spark-kaggle-examples"

sparkVersion := "1.5.2"

sparkComponents += "mllib"

spShortDescription := "Example codes of kaggle jobs"

spDescription := """This is a collection of kaggle examples.
                   |These samples requires a corresponding data that can be
                   |downloaded from kaggle.com.
                   |These are absolutely tutorial pacakge, not optimized
                   |for production use.""".stripMargin

licenses += "Apache-2.0" -> url("http://opensource.org/licenses/Apache-2.0")

spIncludeMaven := true



