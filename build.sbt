
name := "typesafe-example"

version := "0.1-SNAPSHOT"

fork := true

javaOptions := Seq("-Dconfig.file=/home/user1/test/application.conf")

scalaVersion := "2.11.11"

val typesafeVersion = "1.3.2"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % typesafeVersion
)
