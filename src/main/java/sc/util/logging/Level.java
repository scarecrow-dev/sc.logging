//### Level.java ###########################################################################################################################

package sc.util.logging;

/* Level [class]: This class represents a logging level and contains the sc logging level *//**
 * 
 * @author Manuel Bothner
 *
 */
public final class Level {

//### STATIC CONSTANTS #####################################################################################################################
	
	//The following constants represent the eight different sc logging level:
	public static final Level DETAIL  = new Level("DETAIL",   300);		//Equivalent to java.util.logging.Level.FINEST!
	public static final Level TRACE   = new Level("TRACE",    400);		//Equivalent to java.util.logging.Level.FINER!
	public static final Level DEBUG   = new Level("DEBUG",    500);	    //Equivalent to java.util.logging.Level.FINE!
	public static final Level CONFIG  = new Level("CONFIG",   700);	    //Equivalent to java.util.logging.Level.CONFIG!
	public static final Level INFO    = new Level("INFO",     800);	    //Equivalent to java.util.logging.Level.INFO!
	public static final Level WARNING = new Level("WARNING",  900);		//Equivalent to java.util.logging.Level.WARNING!
	public static final Level ERROR   = new Level("ERROR",   1000);	    //Equivalent to java.util.logging.Level.SEVERE!
	public static final Level FATAL   = new Level("FATAL",   1100);     //Has no equivalent in java.util.logging!
	
//### ATTRIBUTES ###########################################################################################################################
	
	//Represents the real logging level (class that extends the java.util.logging.Level class):
	private RealLevel realLevel;
	
//### CONSTRUCTORS #########################################################################################################################
	
	/* Level [constructor]: Private constructor, it is not intended that objects of this class are created *//**
	 * 
	 * @param name
	 * @param value
	 */
	private Level(String name, int value) {
		this.realLevel = new RealLevel(name, value);
	}
	
//### PACKET VISIBLE METHODS ###############################################################################################################
	
	/* getRealLevel [method]: Method that return the real level object, object of the class java.util.logging.Level *//**
	 * 
	 * @return
	 */
	RealLevel getRealLevel() {
		return this.realLevel;
	}
	
//### PACKET VISIBLE STATIC METHODS ########################################################################################################	
	
	/* init [method]: */
	static void init() { /*Do nothing!*/ }
	
//##########################################################################################################################################	
}
//### EOF ##################################################################################################################################