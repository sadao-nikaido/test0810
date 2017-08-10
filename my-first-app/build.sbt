name := """my-first-app"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.2"

libraryDependencies += guice
libraryDependencies += javaJdbc
libraryDependencies ++= Seq(
  jdbc,
  "org.postgresql" % "postgresql" % "42.1.4",
  cache,
  javaWs
)

