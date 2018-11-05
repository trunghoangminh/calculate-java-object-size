#!/bin/bash
javac ObjectSizeFetcher.java Main.java
jar cvfm ObjectSizeFetcherAgent.jar MANIFEST.MF ObjectSizeFetcher.class Main.class
java -javaagent:ObjectSizeFetcherAgent.jar Main