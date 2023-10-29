
val toolkitVersion = "0.1.6"
val circeVersion = "0.14.5"
val scalaTestVersion = "3.2.15"

ThisBuild / scalaVersion := "2.13.11"
libraryDependencies ++= Seq(
  "org.typelevel" %% "toolkit" % toolkitVersion,
  "org.typelevel" %% "toolkit-test" % toolkitVersion % Test,

  // json
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,

  // config
  "com.typesafe" % "config" % "1.4.2",

  // testing
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
)

addCompilerPlugin("com.olegpy" %% "better-monadic-for" % "0.3.1")
addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full)
