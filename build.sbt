
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.1"

ThisBuild / organization := "com.myob.platform"
ThisBuild / scalaVersion := "2.12.11"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "helloWorld",
    libraryDependencies ++= Seq( scalaTest % Test
    )
  )

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-language:higherKinds",
  "-language:postfixOps",
  "-feature",
  "-Ypartial-unification",
  "-Xfatal-warnings"
)

