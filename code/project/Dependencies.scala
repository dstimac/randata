package randata

import sbt._
import Keys._

trait Dependencies  {
  val scalax    = "com.github.scala-incubator.io" %% "scala-io-file" % "0.4.2"
  val scalaTime = "com.github.nscala-time"        %% "nscala-time"   % "0.6.0"
}
