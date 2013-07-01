organization := "com.typesafe.play"

name := "play-doc"

version := "1.0.0-SNAPSHOT"

crossScalaVersions := Seq("2.9.2", "2.10.0")

libraryDependencies ++= Seq(
  "org.pegdown" % "pegdown" % "1.4.0",
  "commons-io" % "commons-io" % "2.4",
  "org.specs2" %% "specs2" % "1.12.3" % "test"
)

publishTo <<= version { version => 
  if (version.endsWith("SNAPSHOT"))
    Some("Typesafe Maven Releases Repository" at "https://typesafe.artifactoryonline.com/typesafe/maven-releases/")
  else
    Some("Typesafe Maven Snapshots Repository" at "https://typesafe.artifactoryonline.com/typesafe/maven-snapshots/")
}