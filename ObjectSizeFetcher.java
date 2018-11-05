import java.lang.instrument.Instrumentation;

/**
 * This class is used for getting Java Object size
 * 
 * @author hmtrung
 *
 */
public class ObjectSizeFetcher {
    private static Instrumentation instrumentation;

    /**
     * Implementation of the overloaded premain method that is first invoked by
     * the JVM during use of instrumentation.
     * 
     * @param args
     * @param inst
     */
    public static void premain( String args, Instrumentation inst ) {
	instrumentation = inst;
    }

    /**
     * Get size of Java Object
     * 
     * @param obj
     * @return size of Object. Unit is [byte]
     */
    public static long getObjectSize( Object obj ) {
	return instrumentation.getObjectSize( obj );
    }
}