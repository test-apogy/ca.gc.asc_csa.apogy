/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.AstronomyUtils;
import org.eclipse.symphony.core.environment.EclipticCoordinates;
import org.eclipse.symphony.core.environment.EnvironmentUtilities;
import org.eclipse.symphony.core.environment.EquatorialCoordinates;
import org.eclipse.symphony.core.environment.HorizontalCoordinates;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Astronomy Utils</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AstronomyUtilsImpl extends MinimalEObjectImpl.Container implements AstronomyUtils
{
	public static final double J2000 = 2451545.0;	
	public static final double ECLIPTIC_OBLIQUITY = Math.toRadians(23.4406);
	public static final double EARTH_EQUATORIAL_RADIUS = 6378.1E3;
	public static final double METERS_PER_ASTRONOMICAL_UNIT = 149597870.7 * 1E3;
	
	public static final double GOLDEN_RATIO = (1.0 + Math.sqrt(5.0)) / 2.0;
	
	private static AstronomyUtils instance = null;
	public static AstronomyUtils getInstance() {
		if (instance == null) {
			instance = new AstronomyUtilsImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AstronomyUtilsImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyEnvironmentPackage.Literals.ASTRONOMY_UTILS;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EquatorialCoordinates getSunEquatorialPosition(double julianDay)
  {
		double d = getTimeSinceJ2000(julianDay);
		
		// System.out.println("d " + d);
		
		// Mean sun longitude, L, in degrees.
		double L = 280.461 + 0.9856474 * d;
		
		// Clamps L to 0 to 360.
		L = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(L)));
		
		// System.out.println("L " + L);
		
		// Mean anomaly of the sun, g, in degrees.
		double g = 357.528 + 0.9856003 * d;
		
		// Clamps g to 0 to 360.
		g = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(g)));		
		
		//System.out.println("g " + g);
		
		// the ecliptic longitude (lambda) of the sun.
		double lambda = L + 1.915 * Math.sin(Math.toRadians(g)) + 0.020 * Math.sin(Math.toRadians(2*g));

		//System.out.println("lambda " + lambda);
		
		// Finds the obliquity of the ecliptic plane (epsilon), in degrees.
		double epsilon = 23.439 - 0.0000004 * d;
		
		//System.out.println("epsilon " + epsilon);

		// Find the Right Ascension (alpha) and Declination (delta) of the Sun.
		double y = Math.cos(Math.toRadians(epsilon)) * Math.sin(Math.toRadians(lambda));
		double x = Math.cos(Math.toRadians(lambda));
		
		// Radius of the orbit is the length of the vector times on A.U.
		double r = Math.sqrt(x*x + y*y) * 149598261.0E3;			
		double a = Math.toDegrees(Math.atan(y/x));
		
		double alpha;
		if (x < 0) 
		{
			alpha = a + 180.0;
		}
		else if ((y < 0) && (x > 0))
		{
			alpha = a + 360.0;
		}
		else 
		{
			alpha = a;
		}
		
		// Convert alpha to radians.
		alpha = Math.toRadians(alpha);
		
		double delta = Math.asin(Math.sin(Math.toRadians(epsilon)) * Math.sin(Math.toRadians(lambda)));												

		EquatorialCoordinates coordinates = SymphonyEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
		coordinates.setRightAscension(alpha);
		coordinates.setDeclination(delta); 
		coordinates.setRadius(r);		
		
		return coordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public HorizontalCoordinates getHorizontalSunPosition(Date date, double observerLongitude, double observerLatitude)
  {
		double julianDay = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);
		
		// Compute the Equatorial Coordinates of the sun.
		EquatorialCoordinates equatorialCoordinates = getSunEquatorialPosition(julianDay);
							
		HorizontalCoordinates horizontalCoords  = convertToHorizontalCoordinates(equatorialCoordinates, observerLongitude, observerLatitude, date);		
		horizontalCoords.setAzimuth(clampAngleToZero2PI(horizontalCoords.getAzimuth()));
		
		return horizontalCoords;

  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EquatorialCoordinates getMoonEquatorialPosition(double julianDay)
  {
		// All computation are in degrees.
		
		// See : http://stjarnhimlen.se/comp/tutorial.html
		
		double d = getTimeSinceJ2000(julianDay) + 1.5; //-3543
		
		//System.out.println("-----------------------------------------");
		//System.out.println("d " + d);
		
		// Longitude of the ascending node, in degrees.
		double longitudeOfAscendingNode = 125.1228 - 0.0529538083 * d;
		longitudeOfAscendingNode = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(longitudeOfAscendingNode)));		
		//System.out.println("Longitude Ascending Node [N] (deg)  : " + longitudeOfAscendingNode);		
		
		// Inclination, in degrees.
	    double i = 5.1454; 
	    
	    // Argument of perigee, in degrees. This is denoted w in the documentation.
	    double argumentOfPerigee = 318.0634 + 0.1643573223  * d;
	    argumentOfPerigee = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(argumentOfPerigee)));
	    //System.out.println("Argument Of Perigee [w] (deg)       : " + argumentOfPerigee);
	   
	    
	    // Mean distance, in Earth radius
	    double a =  60.2666;
	    
	    // Eccentricity
	    double e = 0.054900;
	    
	    // Moon's Mean anomaly, in degree. This is denoted Mm in the documentation.
	    double moonMeanAnomaly = 115.3654 + 13.0649929509 * d;
	    moonMeanAnomaly = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(moonMeanAnomaly)));
	    
	    //System.out.println("Moon's Mean Anomaly [M, Mm] (deg)   : " + moonMeanAnomaly);	    
	   
	    // Eccentric Anomaly
	    double E0 = 10;
	    double E1 = 0;
	    while(Math.abs(E1-E0) > 0.005)
	    {
	    	E0 = moonMeanAnomaly + (180 / Math.PI) * e * Math.sin(Math.toRadians(moonMeanAnomaly)) * (1 + e * Math.cos(Math.toRadians(moonMeanAnomaly)));
		    E1 = E0 - (E0 - (180/Math.PI) * e * Math.sin(Math.toRadians(E0)) - moonMeanAnomaly) / (1 - e * Math.cos(Math.toRadians(E0)));		    
		    E0 = E1;
	    }
	    double E = E1;
	    //System.out.println("Moon's Eccentric Anomaly [E] (deg)  : " + E);
	    	
	    double x = a * ( Math.cos(Math.toRadians(E)) - e );
	    double y = a * ( Math.sqrt(1.0 - e*e) * Math.sin(Math.toRadians(E)));
	    	    
	    double r = Math.sqrt( x*x + y*y );
	    double v = Math.atan2(y, x);
	    v = Math.toDegrees(clampAngleToZero2PI(v));
	    
	    double xeclip = r * ( Math.cos(Math.toRadians(longitudeOfAscendingNode)) * Math.cos(Math.toRadians(v+argumentOfPerigee)) - Math.sin(Math.toRadians(longitudeOfAscendingNode)) * Math.sin(Math.toRadians(v+argumentOfPerigee)) * Math.cos(Math.toRadians(i)));
	    double yeclip = r * ( Math.sin(Math.toRadians(longitudeOfAscendingNode)) * Math.cos(Math.toRadians(v+argumentOfPerigee)) + Math.cos(Math.toRadians(longitudeOfAscendingNode)) * Math.sin(Math.toRadians(v+argumentOfPerigee)) * Math.cos(Math.toRadians(i)));	    
	    double zeclip = r * Math.sin(Math.toRadians(v+argumentOfPerigee)) * Math.sin(Math.toRadians(i));	    
	    EclipticCoordinates eclipCoord = convertFromEclipticRectangularToEclipticCoordinates(new Point3d(xeclip, yeclip, zeclip));
	    
	    // Computes the perturbations to the Moon's Orbit.
	    
	    // Computes the Sun terms.

	    
	    // Sun's Mean Anomaly, in degrees. This is denoted M or Ms in the documentation.
	    double sunMeanAnomaly = 356.0470 + 0.9856002585 * d;
	    sunMeanAnomaly = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(sunMeanAnomaly)));
	    //System.out.println("Sun Mean Anomaly [M, Ms] (deg)      : " + sunMeanAnomaly);

	    // Sun's Longitude of perihelion, in degrees. This is denoted w in the documentation.
	    double sunLongitudeOfPerihelion = 282.9404 + 4.70935E-5 * d; 
	    sunLongitudeOfPerihelion = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(sunLongitudeOfPerihelion)));
	    	    
	    // Sun's Mean Longitude, in degrees. This is denoted Ls in the documentation.
	    double sunMeanLongitude = sunMeanAnomaly + sunLongitudeOfPerihelion;
	    sunMeanLongitude = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(sunMeanLongitude)));
	    
	    //System.out.println("Sun's Mean Longitude [Ls] (deg)     : " + sunMeanLongitude);

	    // Computes the Moon's terms.
	    
	    // The Moon's Mean Longitude, in degrees. This is denoted Lm in the documentation.
	    double moonMeanLongitude =  longitudeOfAscendingNode + argumentOfPerigee + moonMeanAnomaly; 
	    moonMeanLongitude = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(moonMeanLongitude)));
	    //System.out.println("Moon Mean Longitude [Lm] (deg)      : " + moonMeanLongitude);
	    
	    // The Moon's Mean Elongation, in degrees. This is denoted D in the documentation.
	    double moonMeanElongation = moonMeanLongitude - sunMeanLongitude;
	    moonMeanElongation = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(moonMeanElongation)));
	    //System.out.println("Moon Mean Elongation [D] (deg)      : " + moonMeanElongation);
	    	   	    
	    // The Moon's Argument of Latitude, in degrees. This is denoted F in the documentation.
	    double moonArgumentOfLatitude = moonMeanLongitude - longitudeOfAscendingNode;
	    moonArgumentOfLatitude = Math.toDegrees(clampAngleToZero2PI(Math.toRadians(moonArgumentOfLatitude)));
	    //System.out.println("Moon Argument Of Latitude [F] (deg) : " + moonArgumentOfLatitude);
	    
	    // Computes the Moon's perturbation terms.
	    double distancePerturbations = computeMoonDistancePerturbations(Math.toRadians(moonMeanAnomaly), Math.toRadians(moonMeanElongation));	    
	    double longitudePerturbations = computeMoonLongitudePerturbations(Math.toRadians(moonMeanAnomaly), Math.toRadians(sunMeanAnomaly), Math.toRadians(moonMeanElongation), Math.toRadians(moonArgumentOfLatitude));	    
	    double latitudePerturbations = computeMoonLatitudePerturbations(Math.toRadians(moonMeanAnomaly), Math.toRadians(moonMeanElongation), Math.toRadians(moonArgumentOfLatitude));
	    	    	   	    
	    //System.out.println("Moon Distance Perturbations         : " + distancePerturbations);	 
	    //System.out.println("Moon Longitude Perturbations (deg)  : " + Math.toDegrees(longitudePerturbations));
	    //System.out.println("Moon Latitude Perturbations (deg)   : " + Math.toDegrees(latitudePerturbations));

	    
	    // double longitude = clampAngleToZero2PI(eclipCoord.getLongitude() + longitudePerturbations);
	    //System.out.println("Ecliptic Longitude (deg)            : " + Math.toDegrees(longitude) + " expected " + 308.3616);
	    //System.out.println("Ecliptic Latitude (deg)             : " + Math.toDegrees(eclipCoord.getLatitude()) + " expected " + -0.3937);
	    //System.out.println("Ecliptic Radius                     : " + eclipCoord.getRadius());
	    
	    double correctedLongitude = clampAngleToZero2PI(eclipCoord.getLongitude() + longitudePerturbations);
	    double correctedLatitude = clampAngleToZero2PI(eclipCoord.getLatitude() + latitudePerturbations);
	    double correctedRadius = eclipCoord.getRadius() + distancePerturbations;
	    
	    eclipCoord.setLongitude(correctedLongitude);
	    eclipCoord.setLatitude(correctedLatitude);
	    eclipCoord.setRadius(correctedRadius);
	    
	    //System.out.println("Corrected longitude (deg)          : " + Math.toDegrees(correctedLongitude) );
	    //System.out.println("Corrected latitude (deg)           : " + Math.toDegrees(correctedLatitude));
	    //System.out.println("Corrected radius                   : " + correctedRadius );
	    
		EquatorialCoordinates equatorialCoordinates = convertToEquatorialCoordinates(eclipCoord);
			    
	    return equatorialCoordinates;
  }
  
	/**
	 * Computes the Moon longitude perturbations terms.
	 * @param moonMeanAnomaly The Moon's Mean Anomaly, in radians.
	 * @param sunMeanAnomaly The Sun's Mean Anomaly, in radians.
	 * @param moonMeanElongation The Moon's Mean Elongation, in radians.
	 * @param moonArgumentOfLatitude The Moon's Argument Of Latitude, in radians.
	 * @return The Moon's longitude perturbation, in radians.
	 */
	private double computeMoonLongitudePerturbations(double moonMeanAnomaly, double sunMeanAnomaly, double moonMeanElongation, double moonArgumentOfLatitude)
	{
		double longitudePerturbations = 0;
		
		longitudePerturbations += -1.274 * Math.sin(moonMeanAnomaly - 2 * moonMeanElongation);		// (Evection)		
		longitudePerturbations += 0.658 * Math.sin(2 * moonMeanElongation);      		// (Variation)
		longitudePerturbations += -0.186 * Math.sin(sunMeanAnomaly);			// (Yearly equation)
		longitudePerturbations +=-0.059 * Math.sin(2 * moonMeanAnomaly - 2 * moonMeanElongation);
		longitudePerturbations +=-0.057 * Math.sin(moonMeanAnomaly - 2 * moonMeanElongation + sunMeanAnomaly);
		longitudePerturbations +=+0.053 * Math.sin(moonMeanAnomaly + 2 * moonMeanElongation);
		longitudePerturbations +=+0.046 * Math.sin(2 * moonMeanElongation - sunMeanAnomaly);
		longitudePerturbations +=+0.041 * Math.sin(moonMeanAnomaly - sunMeanAnomaly);
		longitudePerturbations +=-0.035 * Math.sin(moonMeanElongation);            	// (Parallactic equation)
		longitudePerturbations +=-0.031 * Math.sin(moonMeanAnomaly + sunMeanAnomaly);
		longitudePerturbations +=-0.015 * Math.sin(2*moonArgumentOfLatitude - 2 * moonMeanElongation);
		longitudePerturbations +=+0.011 * Math.sin(moonMeanAnomaly - 4 * moonMeanElongation);
		
		return Math.toRadians(longitudePerturbations);
	}
	
	/**
	 * Computes the Moon latitude perturbations terms.
	 * @param moonMeanAnomaly The Moon's Mean Anomaly, in radians.
	 * @param moonMeanElongation The Moon's Mean Elongation, in radians.
	 * @param moonArgumentOfLatitude The Moon's Argument Of Latitude, in radians.
	 * @return The Moon's latitude perturbation, in radians. 
	 */
	private double computeMoonLatitudePerturbations(double moonMeanAnomaly, double moonMeanElongation, double moonArgumentOfLatitude)
	{
		double latitudePerturbations = 0;		
		latitudePerturbations += -0.173 * Math.sin(moonArgumentOfLatitude - 2 * moonMeanElongation);
		latitudePerturbations += -0.055 * Math.sin(moonMeanAnomaly - moonArgumentOfLatitude - 2 * moonMeanElongation);
	    latitudePerturbations += -0.046 * Math.sin(moonMeanAnomaly + moonArgumentOfLatitude - 2 * moonMeanElongation);
	    latitudePerturbations += +0.033 * Math.sin(moonArgumentOfLatitude + 2 * moonMeanElongation);
	    latitudePerturbations += +0.017 * Math.sin(2 * moonMeanAnomaly + moonArgumentOfLatitude);		
		return Math.toRadians(latitudePerturbations);
	}
	
	/**
	 * Computes the Moon distance perturbations terms.
	 * @param moonMeanAnomaly The Moon's Mean Anomaly, in radians.
	 * @param moonMeanElongation The Moon's Mean Elongation, in radians.
	 * @return The moon distance perturbation, in Earth radius.
	 */
	private double computeMoonDistancePerturbations(double moonMeanAnomaly, double moonMeanElongation)
	{
		double distancePerturbations = 0;
		distancePerturbations += -0.58 * Math.cos(moonMeanAnomaly - 2 * moonMeanElongation);
		distancePerturbations += -0.46 * Math.cos(2 * moonMeanElongation);
		return distancePerturbations;
	}	
	

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EquatorialCoordinates getMoonTopocentricEquatorialPosition(Date date, double observerLongitude, double observerLatitude)
  {
		// Computes the Moon geocentric equatorial position.
		double julianDay = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);
		EquatorialCoordinates geocentricCoords = getMoonEquatorialPosition(julianDay);
		
//		System.out.println("RA (deg)   : " + Math.toDegrees(geocentricCoords.getRightAscension()));
//		System.out.println("Decl (deg) : " + Math.toDegrees(geocentricCoords.getDeclination()));
		
		double mpar = Math.asin( 1.0 / geocentricCoords.getRadius() );
		//System.out.println("mpar (deg) : " + Math.toDegrees(mpar));
		
		// Accounting for the flattening of the Earth.
	    double gclat = Math.toRadians(Math.toDegrees(observerLatitude) - 0.1924 * Math.sin(2 * observerLatitude));	    
	    double rho   = 0.99833 + 0.00167 * Math.cos(2 * observerLatitude);
	    
	    //System.out.println("gclat (deg) : " + Math.toDegrees(gclat));
	    //System.out.println("rho         : " + rho);
	    
	    // Moon's geocentric Hour Angle (hourAngle), in radians.
	    double hourAngle = getLocalSideralTime(date, observerLongitude) - geocentricCoords.getRightAscension();
	    hourAngle = clampAngleToZero2PI(hourAngle);
	    //System.out.println("hourAngle (deg) : " + Math.toDegrees(hourAngle));
	    
	    // Auxiliary angle g, in radians
	    double  g = Math.atan( Math.tan(gclat) / Math.cos(hourAngle));
	    
	    // Ensure g is never 0.0;
	    if(g == 0.0) g = 1E-9;
	    
	    //System.out.println("g (deg) : " + Math.toDegrees(g));
	    	    
	    double rightAscensionCorrection =  - mpar * rho * Math.cos(gclat) * Math.sin(hourAngle) / Math.cos(geocentricCoords.getDeclination());
	    double declinationCorrection =  - mpar * rho * Math.sin(gclat) * Math.sin(g - geocentricCoords.getDeclination()) / Math.sin(g);

	    //System.out.println("Right Ascension Correction (deg) : " + Math.toDegrees(rightAscensionCorrection));
	    //System.out.println("Declination Correction (deg)     : " + Math.toDegrees(declinationCorrection));
		
	    double correctedRightAscension = clampAngleToZero2PI(geocentricCoords.getRightAscension() + rightAscensionCorrection);
	    double correctedDeclination = geocentricCoords.getDeclination() + declinationCorrection;
	    
	    // Uses corrected values.	
		EquatorialCoordinates equatorialCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
	    equatorialCoordinates.setRightAscension(correctedRightAscension);
	    equatorialCoordinates.setDeclination(correctedDeclination);
	    equatorialCoordinates.setRadius(rho * geocentricCoords.getRadius() * EARTH_EQUATORIAL_RADIUS);
	    	    
		return equatorialCoordinates;	
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public HorizontalCoordinates getHorizontalMoonPosition(Date date, double observerLongitude, double observerLatitude)
  {
		// Compute the Equatorial Coordinates of the sun.
		EquatorialCoordinates equatorialCoordinates = getMoonTopocentricEquatorialPosition(date, observerLongitude, observerLatitude);
		
		HorizontalCoordinates horizontalCoords  = convertToHorizontalCoordinates(equatorialCoordinates, observerLongitude, observerLatitude, date);
		
		horizontalCoords.setAzimuth(clampAngleToZero2PI(horizontalCoords.getAzimuth()));
		
		return horizontalCoords;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getTimeSinceJ2000(double julianDay)
  {
	  return julianDay - J2000;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getLocalSideralTime(Date date, double observerLongitude)
  {
		double jd = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);
		
		// The number of days and fraction (+ or -) from 2000 January 1, 12h UT, Julian date 2451545.0:
		double d = getTimeSinceJ2000(jd);
		                		
		// The Greenwich mean sidereal time in hours is:
		double gmst = 18.697374558 + 24.06570982441908 * d;
				
		// Clamps the Greenwich mean sidereal time to 0 - 24 hours,
		if((gmst > 24.0) || (gmst < -24.0))
		{		
			gmst = gmst - (Math.floor(gmst /  24.0) * 24.0);
		}
		
		// Converts the time to radians.
		double gmstInRadians = (gmst / 24.0) * 2 * Math.PI;
		
		// The mean or apparent sidereal time locally is found by obtaining the local longitude 
		// and adding it to or subtracting it from the Greenwich time depending on whether the 
		// local position is east (add) or west (subtract) of Greenwich.
		double localSideralTime = gmstInRadians + observerLongitude;
		
		// Clamps between 0 and 360.
		localSideralTime = clampAngleToZero2PI(localSideralTime);
		
		return localSideralTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getUTCDecimalHours(Date date)
  {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		
		// Get the current hour-of-day at GMT
		cal.setTimeZone(TimeZone.getTimeZone("GMT"));
		int hours = cal.get(Calendar.HOUR_OF_DAY);  // 0..23	
		int minutes = cal.get(Calendar.MINUTE);
		int seconds = cal.get(Calendar.SECOND);    
		int miliseconds = cal.get(Calendar.MILLISECOND);
		
		// System.out.println(hours + " " + minutes + " " + seconds);
		
		double time = hours + ((double) minutes / 60.0) + ((double) seconds / 3600.0) + ((double) miliseconds / (3600.0 * 1000.0));		
		return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public HorizontalCoordinates convertToHorizontalCoordinates(EquatorialCoordinates equatorialCoordinates, double observerLongitude, double observerLatitude, Date date)
  {
		HorizontalCoordinates result = SymphonyEnvironmentFactory.eINSTANCE.createHorizontalCoordinates();
		
		double localSideralTime = getLocalSideralTime(date, observerLongitude);		
		
		// System.out.println("localSideralTime : " + Math.toDegrees(localSideralTime));
		
		double hourAngle = localSideralTime - equatorialCoordinates.getRightAscension();
		
		// Calculate the right hand side of the three equations given above.
		double sinA = Math.sin(observerLatitude) * Math.sin(equatorialCoordinates.getDeclination()) + Math.cos(observerLatitude) * Math.cos(equatorialCoordinates.getDeclination()) * Math.cos(hourAngle);
		double cosAcosAlpha = Math.cos(observerLatitude) * Math.sin(equatorialCoordinates.getDeclination()) - Math.sin(observerLatitude) * Math.cos(equatorialCoordinates.getDeclination()) * Math.cos(hourAngle);
		double sinAcosAlpha = -Math.cos(equatorialCoordinates.getDeclination()) * Math.sin(hourAngle);
		
		// Apply a Rectangular→Polar conversion taking X = cos A cos a, and Y = sin A cos a.
		double x = cosAcosAlpha;
		double y = sinAcosAlpha;
		
		// The angle part of the answer is the azimuth.
		double azimuth = Math.atan2(y, x);		
		double radius = Math.sqrt(x*x + y*y);
		
		// Apply a second Rectangular→Polar conversion taking the radius part of the last answer as the X and the sin a of the first equation as the Y value.
		x = radius;
		y = sinA;				
		
		// The angle part of the answer is the altitude, an angle between −90° and +90°.		
		double altitude = Math.atan2(y, x);				
		radius = Math.sqrt(x*x + y*y);				
				
		// Sets the results
		result.setAltitude(altitude);
		result.setAzimuth(azimuth);
		
		// TODO : Check this !
		result.setRadius(equatorialCoordinates.getRadius());
		
		return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double convertTimeToAngle(int hours, int minutes, int seconds)
  {
		double result = (hours + ((double) minutes / 60.0) + ( (double) seconds / 3600.0))* Math.toRadians(15.0);
		
		return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double clampAngleToZero2PI(double angleInRadians)
  {
		double clampedAngle;
		if((angleInRadians < 0) || (angleInRadians > 2 * Math.PI))
		{			
			clampedAngle = angleInRadians - (Math.floor(angleInRadians / (2 * Math.PI)) * 2* Math.PI);
		}
		else
		{
			clampedAngle = angleInRadians;
		}
		
		return clampedAngle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EquatorialCoordinates convertToEquatorialCoordinates(EclipticCoordinates eclipticCoordinates)
  {
		EquatorialCoordinates equatorialCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
		
		double eradius = eclipticCoordinates.getRadius();
		double elongitude = eclipticCoordinates.getLongitude();
		double elatitude = eclipticCoordinates.getLatitude();
		
		double xeclip = eradius * Math.cos(elongitude) * Math.cos(elatitude);
	    double yeclip = eradius * Math.sin(elongitude) * Math.cos(elatitude);
	    double zeclip = eradius * Math.sin(elatitude);
			    	       	   
	    double xequat = xeclip;
	    double yequat = yeclip * Math.cos(ECLIPTIC_OBLIQUITY) - zeclip * Math.sin(ECLIPTIC_OBLIQUITY);
	    double zequat = yeclip * Math.sin(ECLIPTIC_OBLIQUITY) + zeclip * Math.cos(ECLIPTIC_OBLIQUITY);	   
	    
	    double r    = Math.sqrt( xequat*xequat + yequat*yequat + zequat*zequat);
	    double ra   = clampAngleToZero2PI(Math.atan2( yequat, xequat ));
	    double dec = Math.asin( zequat / r );
	    
	    equatorialCoordinates.setDeclination(dec);
	    equatorialCoordinates.setRightAscension(ra);
	    equatorialCoordinates.setRadius(r);
	    
		return equatorialCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EclipticCoordinates convertToEclipticCoordinates(EquatorialCoordinates equatorialCoordinates)
  {
		EclipticCoordinates eclipticCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createEclipticCoordinates();
		
		double rightAscension = equatorialCoordinates.getRightAscension();
		double declination = equatorialCoordinates.getDeclination();
		
		double xEquatorial = Math.cos(rightAscension) * Math.cos(declination);
	    double yEquatorial = Math.sin(rightAscension) * Math.cos(declination);
	    double zEquatorial = Math.sin(declination);	    
	    
	    double xEcliptic = xEquatorial;
	    double yEcliptic = yEquatorial * Math.cos(ECLIPTIC_OBLIQUITY) - zEquatorial * Math.sin(-ECLIPTIC_OBLIQUITY);
	    double zEcliptic = yEquatorial * Math.sin(-ECLIPTIC_OBLIQUITY) + zEquatorial * Math.cos(-ECLIPTIC_OBLIQUITY);

	    double r = Math.sqrt( xEcliptic*xEcliptic + yEcliptic*yEcliptic + zEcliptic*zEcliptic);
	    double longitude = Math.atan2( yEcliptic, xEcliptic );
	    double latitude = Math.asin( zEcliptic / r );
	    
	    eclipticCoordinates.setLatitude(latitude);
	    eclipticCoordinates.setLongitude(longitude);
	    
		return eclipticCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point3d convertFromEquatorialRectangularToEclipticRectangular(Point3d equatorialRectangularCoordinates)
  {
		Point3d eclipticCoordinates = new Point3d();
		
		eclipticCoordinates.x = equatorialRectangularCoordinates.x;
		eclipticCoordinates.y = equatorialRectangularCoordinates.y * Math.cos(-ECLIPTIC_OBLIQUITY) - equatorialRectangularCoordinates.z * Math.sin(-ECLIPTIC_OBLIQUITY);
		eclipticCoordinates.z = equatorialRectangularCoordinates.y * Math.sin(-ECLIPTIC_OBLIQUITY) + equatorialRectangularCoordinates.z * Math.cos(-ECLIPTIC_OBLIQUITY); 
	    
		return eclipticCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point3d convertFromEclipticRectangularToEquatorialRectangular(Point3d eclipticCoordinates)
  {
		Point3d equatorialCoordinates = new Point3d();
		
		equatorialCoordinates.x = eclipticCoordinates.x;
		equatorialCoordinates.y = eclipticCoordinates.y * Math.cos(ECLIPTIC_OBLIQUITY) - eclipticCoordinates.z * Math.sin(ECLIPTIC_OBLIQUITY);
		equatorialCoordinates.z = eclipticCoordinates.y * Math.sin(ECLIPTIC_OBLIQUITY) + eclipticCoordinates.z * Math.cos(ECLIPTIC_OBLIQUITY);	   
	    
	    return equatorialCoordinates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EclipticCoordinates convertFromEclipticRectangularToEclipticCoordinates(Point3d eclipticCoordinates)
  {
		EclipticCoordinates eclipticCoord = SymphonyEnvironmentFactory.eINSTANCE.createEclipticCoordinates();
		
		double radius = Math.sqrt(eclipticCoordinates.x * eclipticCoordinates.x  + eclipticCoordinates.y * eclipticCoordinates.y + eclipticCoordinates.z * eclipticCoordinates.z);
	    double latitude = Math.asin(eclipticCoordinates.z /radius);
	    double longitude = Math.atan2(eclipticCoordinates.y, eclipticCoordinates.x);
	    
	    eclipticCoord.setLatitude(latitude);
	    eclipticCoord.setLongitude(longitude);
	    eclipticCoord.setRadius(radius);
		
		return eclipticCoord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EquatorialCoordinates convertFromEquatorialRectangularToEquatorialCoordinates(Point3d equatorialCoordinates)
  {
		EquatorialCoordinates equatorialCoord = SymphonyEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
		
		double radius = Math.sqrt(equatorialCoordinates.x * equatorialCoordinates.x  + equatorialCoordinates.y * equatorialCoordinates.y + equatorialCoordinates.z * equatorialCoordinates.z);
	    double declination = Math.asin(equatorialCoordinates.z /radius);
	    double rightAscension = Math.atan2(equatorialCoordinates.y, equatorialCoordinates.x);
	    
	    equatorialCoord.setRightAscension(rightAscension);
	    equatorialCoord.setDeclination(declination);
	    equatorialCoord.setRadius(radius);
	    
		return equatorialCoord;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point3d convertFromHorizontalCoordinatesToHorizontalRectangular(HorizontalCoordinates horizontalCoordinates)
  {
		Point3d position = new Point3d();
		
		double r = horizontalCoordinates.getRadius();
				
		position.x = r * Math.cos(horizontalCoordinates.getAltitude()) * Math.cos(horizontalCoordinates.getAzimuth());
		position.y = - r * Math.cos(horizontalCoordinates.getAltitude()) * Math.sin(horizontalCoordinates.getAzimuth());
		position.z = r * Math.sin(horizontalCoordinates.getAltitude());		
		
		return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Point3d convertFromEquatorialCoordinatesToEquatorialRectangular(EquatorialCoordinates equatorialCoordinates)
  {
		Point3d position = new Point3d();
		
		double r = equatorialCoordinates.getRadius();
				
		position.x = r * Math.cos(equatorialCoordinates.getRightAscension()) * Math.cos(equatorialCoordinates.getDeclination());
		position.y = r * Math.sin(equatorialCoordinates.getRightAscension()) * Math.cos(equatorialCoordinates.getDeclination());
		position.z = r * Math.sin(equatorialCoordinates.getDeclination());	   	
		
		return position;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double convertAUtoMeters(double astronomicalUnits)
  {
	  return astronomicalUnits * METERS_PER_ASTRONOMICAL_UNIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getMaximumSunAltitude(double observerLatitude)
  {
		double maximumSunAltitude = (Math.PI / 2.0) - Math.abs(observerLatitude) + ECLIPTIC_OBLIQUITY;
		if(maximumSunAltitude > Math.PI / 2.0)
		{
			maximumSunAltitude = Math.PI / 2.0;
		}
		
		return maximumSunAltitude;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String convertToHHmmssString(double sideralTime)
  {
		String string = new String();
		double hoursOfDay = (sideralTime / (2.0 * Math.PI)) * 24.0;
		
		DecimalFormat numberFormat = new DecimalFormat("00");
						
		long hours = Math.round(Math.floor(hoursOfDay));
		string += numberFormat.format(hours) + ":";
		
		double minutesOfHour = (hoursOfDay - hours) * 60.0;
		long minutes = Math.round(Math.floor(minutesOfHour));
		string += numberFormat.format(minutes) + ":";
		
		double secondsOfMinute = (minutesOfHour - minutes) * 60.0;
		long seconds = Math.round(Math.floor(secondsOfMinute));
		string += numberFormat.format(seconds);
		string.trim();
		
		return string;
  }
  	  	
  	private Date findHorizonCrossing(Date from, Date to, double observerLongitude, double observerLatitude)
  	{
		long a = from.getTime();
		long b = to.getTime();
			  		  				
  		long c = 0;    	    
  	    long output = 0;  
  	    
  		int i = 0;
  		while(i < 10)
  		{
  			double fa = getHorizontalSunPosition(new Date(a), observerLongitude, observerLatitude).getAltitude();  	  		
  			double fb = getHorizontalSunPosition(new Date(b), observerLongitude, observerLatitude).getAltitude();
 			 
   			double slope = (fb - fa)/(b - a);
  			double deltaX = -fb / slope;
  			c = b + Math.round(deltaX);  			 			
  			i++;
  			
  			double fc = getHorizontalSunPosition(new Date(c), observerLongitude, observerLatitude).getAltitude();  		  					
  			if (Math.abs(fc) < Math.toRadians(0.1)) 
  			{  
  	            output = c;  
  	            break;  
  	        } 
  			else 
  			{    	 			 				  	            
  	            if ((fa * fc) > 0)  
  	                a = c;  
  	            else   
  	                b = c;  
  	        }  
  		}
  		
  		if(output >= from.getTime() && output <= to.getTime())
  		{
  			return new Date(output);
  		}
  		else
  		{
  			return null;
  		}  		  		
  	}
  	
 	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  	public Date getSunRiseTime(Date day, double observerLongitude, double observerLatitude) 
  	{  	
  		Calendar calendar = Calendar.getInstance();
  		calendar.setTime(day);
  		 		
  		calendar.set(Calendar.HOUR_OF_DAY, 0);
  		calendar.set(Calendar.MINUTE, 0);
  		calendar.set(Calendar.SECOND, 1);
  		
  		Date from = calendar.getTime(); 
  		
  		calendar.set(Calendar.HOUR_OF_DAY,12);
  		calendar.set(Calendar.MINUTE, 0);
  		calendar.set(Calendar.SECOND, 0);
  		Date to = calendar.getTime(); 
  		
  		return findHorizonCrossing(from, to, observerLongitude, observerLatitude);
  	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getSunSetTime(Date day, double observerLongitude, double observerLatitude) 
	{
		Calendar calendar = Calendar.getInstance();
  		calendar.setTime(day);
  	 		
  		calendar.set(Calendar.HOUR_OF_DAY, 12);
  		calendar.set(Calendar.MINUTE, 0);
  		calendar.set(Calendar.SECOND, 0);
  		
  		Date from = calendar.getTime(); 
  		
  		calendar.set(Calendar.HOUR_OF_DAY,23);
  		calendar.set(Calendar.MINUTE, 59);
  		calendar.set(Calendar.SECOND, 59);
  		Date to = calendar.getTime(); 		
  		
  		return findHorizonCrossing(from, to, observerLongitude, observerLatitude);
	}

	/**
	 * Implements a Golden Section Search for a minimum.
	 * @param function The unimodal function to find the minimum for.
	 * @param a The minimum side interval bound.
	 * @param b The current estimate. 
	 * @param c The maximum side interval bound.
	 * @param tau The tolerance parameter.
	 * @return The value of x where the minimum is located. 
	 */
	private double goldenSectionSearch(final UnimodalFunction function, double a, double b, double c, double tau)
	{
		double x;
	    if (c - b > b - a)
	    	x = b + (2.0 -GOLDEN_RATIO) * (c - b);	    	
	    else
	    	x = b - (2.0 -GOLDEN_RATIO) * (b - a);	    	
	    
	    if (Math.abs(c - a) < tau * (Math.abs(b) + Math.abs(x))) 
	      return (c + a) / 2.0; 
	    assert(function.f(x) != function.f(b));
	    
	    if (function.f(x) < function.f(b)) 
	    {
		      if (c - b > b - a)
		      {
		    	  return goldenSectionSearch(function, b, x, c, tau);
		      }
		      else
		      {
		    	  return goldenSectionSearch(function, a, x, b, tau);
		      }
	    }
	    else 
	    {
		      if (c - b > b - a) 
		      {
		    	  return goldenSectionSearch(function, a, b, x, tau);
		      }
		      else 
		      {
		    	  return goldenSectionSearch(function, x, b, c, tau);
		      }
	    }
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getSunHighestElevationTime(Date day, double observerLongitude, double observerLatitude) 
	{		
		Calendar calendar = Calendar.getInstance();
  		calendar.setTime(day);
  		 		
  		calendar.set(Calendar.HOUR_OF_DAY, 12);
  		calendar.set(Calendar.MINUTE, 0);
  		calendar.set(Calendar.SECOND, 0);
  		
  		double x2 = calendar.getTime().getTime();
  		double x1 = x2 - 3*60*60*1000;
  		double x3 = x2 + 3*60*60*1000;
  		
  		double tau = 1E-10;
  		
  		SunElevationFunction function = new SunElevationFunction(observerLongitude, observerLatitude);
  		  		
  		long time = Math.round(goldenSectionSearch(function, x1, x2, x3, tau));
  		  		  	
  		return new Date(time);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_SUN_EQUATORIAL_POSITION__DOUBLE:
				return getSunEquatorialPosition((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_HORIZONTAL_SUN_POSITION__DATE_DOUBLE_DOUBLE:
				return getHorizontalSunPosition((Date)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_MOON_EQUATORIAL_POSITION__DOUBLE:
				return getMoonEquatorialPosition((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_MOON_TOPOCENTRIC_EQUATORIAL_POSITION__DATE_DOUBLE_DOUBLE:
				return getMoonTopocentricEquatorialPosition((Date)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_HORIZONTAL_MOON_POSITION__DATE_DOUBLE_DOUBLE:
				return getHorizontalMoonPosition((Date)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_TIME_SINCE_J2000__DOUBLE:
				return getTimeSinceJ2000((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_LOCAL_SIDERAL_TIME__DATE_DOUBLE:
				return getLocalSideralTime((Date)arguments.get(0), (Double)arguments.get(1));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_UTC_DECIMAL_HOURS__DATE:
				return getUTCDecimalHours((Date)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_TO_HORIZONTAL_COORDINATES__EQUATORIALCOORDINATES_DOUBLE_DOUBLE_DATE:
				return convertToHorizontalCoordinates((EquatorialCoordinates)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Date)arguments.get(3));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_TIME_TO_ANGLE__INT_INT_INT:
				return convertTimeToAngle((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CLAMP_ANGLE_TO_ZERO2_PI__DOUBLE:
				return clampAngleToZero2PI((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_TO_EQUATORIAL_COORDINATES__ECLIPTICCOORDINATES:
				return convertToEquatorialCoordinates((EclipticCoordinates)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_TO_ECLIPTIC_COORDINATES__EQUATORIALCOORDINATES:
				return convertToEclipticCoordinates((EquatorialCoordinates)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_ECLIPTIC_RECTANGULAR__POINT3D:
				return convertFromEquatorialRectangularToEclipticRectangular((Point3d)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_EQUATORIAL_RECTANGULAR__POINT3D:
				return convertFromEclipticRectangularToEquatorialRectangular((Point3d)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_FROM_ECLIPTIC_RECTANGULAR_TO_ECLIPTIC_COORDINATES__POINT3D:
				return convertFromEclipticRectangularToEclipticCoordinates((Point3d)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_RECTANGULAR_TO_EQUATORIAL_COORDINATES__POINT3D:
				return convertFromEquatorialRectangularToEquatorialCoordinates((Point3d)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_FROM_HORIZONTAL_COORDINATES_TO_HORIZONTAL_RECTANGULAR__HORIZONTALCOORDINATES:
				return convertFromHorizontalCoordinatesToHorizontalRectangular((HorizontalCoordinates)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_FROM_EQUATORIAL_COORDINATES_TO_EQUATORIAL_RECTANGULAR__EQUATORIALCOORDINATES:
				return convertFromEquatorialCoordinatesToEquatorialRectangular((EquatorialCoordinates)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_AUTO_METERS__DOUBLE:
				return convertAUtoMeters((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_MAXIMUM_SUN_ALTITUDE__DOUBLE:
				return getMaximumSunAltitude((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___CONVERT_TO_HHMMSS_STRING__DOUBLE:
				return convertToHHmmssString((Double)arguments.get(0));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_SUN_RISE_TIME__DATE_DOUBLE_DOUBLE:
				return getSunRiseTime((Date)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_SUN_SET_TIME__DATE_DOUBLE_DOUBLE:
				return getSunSetTime((Date)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
			case SymphonyEnvironmentPackage.ASTRONOMY_UTILS___GET_SUN_HIGHEST_ELEVATION_TIME__DATE_DOUBLE_DOUBLE:
				return getSunHighestElevationTime((Date)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

  	protected abstract class UnimodalFunction
  	{
  		public abstract double f(double x);
  	}
  	
  	protected class SunElevationFunction extends UnimodalFunction
  	{
  		private double observerLongitude = 0;
		private double observerLatitude = 0;
  		
  		public SunElevationFunction(double observerLongitude, double observerLatitude)
  		{
  			this.observerLongitude = observerLongitude;
			this.observerLatitude = observerLatitude;
  		}
  		
  		@Override
  		public double f(double x) 
  		{
  			long time = Math.round(x);  			  			  		
  			return Math.toRadians(90) - getHorizontalSunPosition(new Date(time), observerLongitude, observerLatitude).getAltitude();
  		}
  	}
} //AstronomyUtilsImpl
