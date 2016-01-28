package ca.gc.asc_csa.apogy.common.emf;

public class EMFAnnotationConstants 
{
	// Basic Annotation Elements
	
	/**
	 * This is the prefix that all Apogy annotations start with
	 */
	public static final String ANNOTATION_ELEMENT_PREFIX = "apogy";
	
	/**
	 * This is the separator between the various annotation components
	 */
	public static final String ANNOTATION_ELEMENT_SEPARATOR = "_";
	
	/**
	 * This is the element that indicates the annotation refers to engineering units
	 */
	public static final String ANNOTATION_ELEMENT_UNITS = "units";
	
	/**
	 * This is the element that indicates the annotation refers to update rate
	 */
	public static final String ANNOTATION_ELEMENT_RATE = "rate";
	
	/**
	 * This is the element that indicates the annotation is the minimum limit for a range
	 */
	public static final String ANNOTATION_ELEMENT_MIN_LIMIT = "min";
	
	/**
	 * This is the element that indicates the annotation is the maximum limit for a range
	 */
	public static final String ANNOTATION_ELEMENT_MAX_LIMIT = "max";
	
	/**
	 * This is the element that indicates the annotation refers to an OCL expression
	 */
	public static final String ANNOTATION_ELEMENT_OCL = "ocl";
	
	/**
	 * This is the element that indicates the annotation refers to an OCL message
	 */
	public static final String ANNOTATION_ELEMENT_OCL_MESSAGE = "oclmsg";
	
	/**
	 * This is the element that indicates the annotation refers to the warning range
	 */
	public static final String ANNOTATION_ELEMENT_WARNING_RANGE = "warning";
	
	/**
	 * This is the element that indicate the annotation refers to the alarm range
	 */
	public static final String ANNOTATION_ELEMENT_ALARM_RANGE = "alarm";
	
	/**
	 * This is the element that indicates the annotation refers to the outside range
	 */
	public static final String ANNOTATION_ELEMENT_OUTSIDE_RANGE = "outside";
	
	// Full Annotations
	
	/**
	 * This full annotation is used to specify the engineering unit (e.g. s, m, etc.)
	 * for a particular model element
	 */
	public static final String ANNOTATION_ENGINEERING_UNITS = ANNOTATION_ELEMENT_PREFIX +
															  ANNOTATION_ELEMENT_SEPARATOR +
															  ANNOTATION_ELEMENT_UNITS;
	
	/**
	 * This full annotation is used to specify the update rate for a particular
	 * model element
	 */
	public static final String ANNOTATION_UPDATE_RATE = ANNOTATION_ELEMENT_PREFIX +
														ANNOTATION_ELEMENT_SEPARATOR +
														ANNOTATION_ELEMENT_RATE;
	
	/**
	 * This full annotation is used to specify the minimum value of the warning
	 * range for a particular model element.
	 */
	public static final String ANNOTATION_WARNING_RANGE_MIN_VALUE = ANNOTATION_ELEMENT_PREFIX +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_WARNING_RANGE +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_MIN_LIMIT;
	
	/**
	 * This full annotation is used to specify the maximum value of the warning
	 * range for a particular model element.
	 */
	public static final String ANNOTATION_WARNING_RANGE_MAX_VALUE = ANNOTATION_ELEMENT_PREFIX +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_WARNING_RANGE +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_MAX_LIMIT;

	/**
	 * This full annotation is used to specify the minimum value of the warning
	 * range for a particular model element.
	 */
	public static final String ANNOTATION_ALARM_RANGE_MIN_VALUE = ANNOTATION_ELEMENT_PREFIX +
																  ANNOTATION_ELEMENT_SEPARATOR +
																  ANNOTATION_ELEMENT_ALARM_RANGE +
																  ANNOTATION_ELEMENT_SEPARATOR +
																  ANNOTATION_ELEMENT_MIN_LIMIT;
	
	/**
	 * This full annotation is used to specify the maximum value of the warning
	 * range for a particular model element.
	 */
	public static final String ANNOTATION_ALARM_RANGE_MAX_VALUE = ANNOTATION_ELEMENT_PREFIX +
																  ANNOTATION_ELEMENT_SEPARATOR +
																  ANNOTATION_ELEMENT_ALARM_RANGE +
																  ANNOTATION_ELEMENT_SEPARATOR +
																  ANNOTATION_ELEMENT_MAX_LIMIT;
	
	/**
	 * This full annotation is used to specify the minimum value of the outside
	 * range for a particular model element.
	 */
	public static final String ANNOTATION_OUTSIDE_RANGE_MIN_VALUE = ANNOTATION_ELEMENT_PREFIX +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_OUTSIDE_RANGE +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_MIN_LIMIT;
	
	/**
	 * This full annotation is used to specify the maximum value of the outside
	 * range for a particular model element.
	 */
	public static final String ANNOTATION_OUTSIDE_RANGE_MAX_VALUE = ANNOTATION_ELEMENT_PREFIX +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_OUTSIDE_RANGE +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_MAX_LIMIT;
	
	/**
	 * This full annotation is used to specify an OCL expression to describe the
	 * warning range for a particular model element.
	 */
	public static final String ANNOTATION_WARNING_RANGE_OCL_EXPRESSION = ANNOTATION_ELEMENT_PREFIX +
																		 ANNOTATION_ELEMENT_SEPARATOR +
																		 ANNOTATION_ELEMENT_WARNING_RANGE +
																		 ANNOTATION_ELEMENT_SEPARATOR +
																		 ANNOTATION_ELEMENT_OCL;
	
	/**
	 * This full annotation is used to specify an OCL message to describe the
	 * warning range for a particular model element.
	 */
	public static final String ANNOTATION_WARNING_RANGE_OCL_MESSAGE = ANNOTATION_ELEMENT_PREFIX +
																	  ANNOTATION_ELEMENT_SEPARATOR +
																	  ANNOTATION_ELEMENT_WARNING_RANGE +
																	  ANNOTATION_ELEMENT_SEPARATOR +
																	  ANNOTATION_ELEMENT_OCL_MESSAGE;
	
	/**
	 * This full annotation is used to specify an OCL expression to describe the
	 * alarm range for a particular model element.
	 */
	public static final String ANNOTATION_ALARM_RANGE_OCL_EXPRESSION = ANNOTATION_ELEMENT_PREFIX +
																	   ANNOTATION_ELEMENT_SEPARATOR +
																	   ANNOTATION_ELEMENT_ALARM_RANGE +
																	   ANNOTATION_ELEMENT_SEPARATOR +
																	   ANNOTATION_ELEMENT_OCL;
	
	/**
	 * This full annotation is used to specify an OCL message to describe the
	 * alarm range for a particular model element.
	 */
	public static final String ANNOTATION_ALARM_RANGE_OCL_MESSAGE = ANNOTATION_ELEMENT_PREFIX +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_ALARM_RANGE +
																	ANNOTATION_ELEMENT_SEPARATOR +
																	ANNOTATION_ELEMENT_OCL_MESSAGE;
	
	/**
	 * This full annotation is used to specify an OCL expression to describe the
	 * outside range for a particular model element.
	 */
	public static final String ANNOTATION_OUTSIDE_RANGE_OCL_EXPRESSION = ANNOTATION_ELEMENT_PREFIX +
																		 ANNOTATION_ELEMENT_SEPARATOR +
																		 ANNOTATION_ELEMENT_OUTSIDE_RANGE +
																		 ANNOTATION_ELEMENT_SEPARATOR +
																		 ANNOTATION_ELEMENT_OCL;
	
	/**
	 * This full annotation is used to specify an OCL message to describe the
	 * outside range for a particular model element.
	 */
	public final static String ANNOTATION_OUTSIDE_RANGE_OCL_MESSAGE = ANNOTATION_ELEMENT_PREFIX +
																	  ANNOTATION_ELEMENT_SEPARATOR +
																	  ANNOTATION_ELEMENT_OUTSIDE_RANGE +
																	  ANNOTATION_ELEMENT_SEPARATOR +
																	  ANNOTATION_ELEMENT_OCL_MESSAGE;
}
