val commonSettings = Seq(
  scalaVersion := "2.12.2",
  version := "1.0"
)

lazy val exercises = (project in file("exercises"))
  .settings(commonSettings)
  .settings(
    name := "exercises"
  )

lazy val root = (project in file("."))
  .aggregate(exercises)
  .settings(commonSettings)
  .settings(
    name := "functional-programming-scala"
  )
