# Calculate size of Object in Java using `Instrumentation`
#### 1. Firstly, We need complile two files ObjectSizeFetcher.java and Main.java

        javac ObjectSizeFetcher.java Main.java
#### 2. Sendcond, we package these files above to jar and also add manifest for it.

        jar cvfm ObjectSizeFetcherAgent.jar MANIFEST.MF ObjectSizeFetcher.class Main.class
#### 3. Third, use command below to getting size of Object
        
        java -javaagent:ObjectSizeFetcherAgent.jar Main
#### 4. For quickly, you can use my script
        
        ./run.sh
