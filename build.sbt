name := "json_reader_zaigrin"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "3.2.11",
  "org.apache.spark"  %% "spark-core" % "2.3.0" % "provided",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)