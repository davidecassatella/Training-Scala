ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "2.13.10"
ThisBuild / name := "training-scala"
ThisBuild / organization := "com.davecass"

lazy val functions = (project in file("functions"))
lazy val functionalprogramming = (project in file("functional-programming"))
lazy val rockthejvm = (project in file("rockthejvm")).settings(
  assembly / mainClass := Some("com.rockthejvm.RockthejvmSBTApp"),
  libraryDependencies += Dependencies.typelevel %% "cats-effect" % "3.3.0"
)

lazy val root = (project in file(".")).aggregate(functions, rockthejvm)

