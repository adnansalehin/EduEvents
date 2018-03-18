name := """EduEvents"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava).settings(
  watchSources ++= (baseDirectory.value / "public/ui" ** "*").get
)

scalaVersion := "2.12.2"
//Format:
// libraryDependencies += groupID % artifactID % revision % configuration

libraryDependencies += guice

// Test Database
libraryDependencies += "com.h2database" % "h2" % "1.4.194"

// Testing libraries for dealing with CompletionStage...
libraryDependencies += "org.assertj" % "assertj-core" % "3.6.2" % Test
libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

libraryDependencies += "org.awaitility" % "awaitility" % "2.0.0" % Test

// libraryDependencies += "com.google.guava" % "guava" % "24.1-jre"
libraryDependencies += "org.projectlombok" % "lombok" % "1.16.18"
libraryDependencies += "com.typesafe.play" %% "play" % "2.6.12"

// Make verbose tests
testOptions in Test := Seq(Tests.Argument(TestFrameworks.JUnit, "-a", "-v"))
