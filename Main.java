public class Main {

    public static void main( String[] args ) {
	System.out.println( "-------------------------------------------------------------------------" );
	System.out.println( "-------------------------------------------------------------------------" );
	System.out.println( "Size of Object: " + ObjectSizeFetcher.getObjectSize( new Main() ) + " byte" );
	System.out.println( "-------------------------------------------------------------------------" );
    }
}