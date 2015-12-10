name := "rises"

organization := "net.deck36"

scalaVersion := "2.11.7"

version := "0.1.1-SNAPSHOT"

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.2.0"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.2"

mainClass := Some("rises.Rises")
