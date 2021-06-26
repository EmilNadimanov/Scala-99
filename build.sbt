lazy val root = (project in file("."))
  .settings(
    name := "Hello",
    scalaVersion := "2.13.6"
  )

libraryDependencies += "org.specs2" %% "specs2-core" % "4.11.0" % "test"

