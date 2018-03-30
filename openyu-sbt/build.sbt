import AssemblyKeys._  
assemblySettings

name := "openyu-sbt"  
  
version := "1.0.0"  
  
scalaVersion := "2.11.7"  
  
EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource  
  
libraryDependencies ++= Seq(  
  "org.apache.spark" % "spark-core_2.10" % "1.3.0" % "provided",
  "org.apache.spark" % "spark-streaming_2.10" % "1.3.0" % "provided", 
  "log4j" % "log4j" % "1.2.16" 
)  
  
resolvers ++= Seq(  
      // HTTPS is unavailable for Maven Central  
      "Maven Repository"     at "http://repo.maven.apache.org/maven2",  
      "Apache Repository"    at "https://repository.apache.org/content/repositories/releases",  
      "JBoss Repository"     at "https://repository.jboss.org/nexus/content/repositories/releases/",  
      "MQTT Repository"      at "https://repo.eclipse.org/content/repositories/paho-releases/",  
      "Cloudera Repository"  at "http://repository.cloudera.com/artifactory/cloudera-repos/",
      //"nexus"               at "http://172.16.25.142/nexus/content/repositories/releases/",
      //"nexus snapshot"      at "http://172.16.25.142/nexus/content/repositories/snapshots/",  
      Resolver.mavenLocal  
)