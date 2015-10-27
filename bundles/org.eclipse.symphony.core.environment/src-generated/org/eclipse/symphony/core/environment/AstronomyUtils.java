/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment;

import java.util.Date;

import javax.vecmath.Point3d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.environment.impl.AstronomyUtilsImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Astronomy Utils</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that provides methods to find the position of the Moon and Sun in the sky.
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage#getAstronomyUtils()
 * @model
 * @generated
 */
public interface AstronomyUtils extends EObject
{
	
	public static AstronomyUtils INSTANCE = AstronomyUtilsImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the Sun's equatorial coordinates for a given Julian date.
	 * The calculation are based on page C24 of the 1996 Astronomical Almanac
	 * which provides a method for finding the position of the Sun in the sky
	 * to an accuracy of 0.01 degree between the years 1950 and 2050. The
	 * formulas are based on an elliptical orbit for the Earth, using mean
	 * orbital elements and a two term approximation for the 'equation of centre'.
	 * 
	 * There is also an approximate allowance made for the change in obliquity of
	 * the ecliptic with time, needed when converting to right ascension and
	 * declination. The positions are thus apparent positions, they are referred to
	 * the mean ecliptic and equinox of date. The positions found using this low
	 * precision formula with values referred to the mean ecliptic and equinox of
	 * date from a more accurate program. The results (for the whole 1950 to 2050 range)
	 * have been found to be accurate within 3 seconds of RA and 15 arc seconds in declination.
	 * 
	 * @see http://www.stargazing.net/kepler/sun.html#twig02
	 * <!-- end-model-doc -->
	 * @model unique="false" julianDayUnique="false"
	 * @generated
	 */
  EquatorialCoordinates getSunEquatorialPosition(double julianDay);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the Sun's horizontal coordinates for a date and location on
	 * the surface of the Earth.
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  HorizontalCoordinates getHorizontalSunPosition(Date date, double observerLongitude, double observerLatitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the Moon's equatorial coordinates for a given Julian date for
	 * an observer a the center of the Earth.
	 * See doc/tutorial.html for more details.
	 * <!-- end-model-doc -->
	 * @model unique="false" julianDayUnique="false"
	 * @generated
	 */
  EquatorialCoordinates getMoonEquatorialPosition(double julianDay);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the Moon's equatorial coordinates for a date and location on
	 * the surface of the Earth. This position take into account the radius of
	 * the Earth.
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  EquatorialCoordinates getMoonTopocentricEquatorialPosition(Date date, double observerLongitude, double observerLatitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the Moon's horizontal coordinates.
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  HorizontalCoordinates getHorizontalMoonPosition(Date date, double observerLongitude, double observerLatitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the number of days since epoch J2000.
	 * <!-- end-model-doc -->
	 * @model unique="false" julianDayUnique="false"
	 * @generated
	 */
  double getTimeSinceJ2000(double julianDay);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the local sideral time, in radians, clamped between 0 and 2π (360 degrees).
	 * 
	 * Sidereal time is a system of timekeeping based on the rotation of the Earth with respect
	 * to the fixed stars in the sky. More specifically, it is the measure of the hour angle of
	 * the vernal equinox. If the hour angle is measured with respect to the true equinox, apparent
	 * sidereal time is being measured. If the hour angle is measured with respect to the mean
	 * equinox, mean sidereal time is being measured. When the measurements are made with respect to
	 * the meridian at Greenwich, the times are referred to as Greenwich mean sidereal time (GMST)
	 * and Greenwich apparent sidereal time (GAST). Given below is a simple algorithm for computing
	 * apparent sidereal time to an accuracy of about 0.1 second, equivalent to about 1.5 arcseconds
	 * on the sky. The input time required by the algorithm is represented as a Julian date (Julian
	 * dates can be used to determine Universal Time.)Let JD be the Julian date of the time of interest.
	 * Let JD0 be the Julian date of the previous midnight (0h) UT (the value of JD0 will end in .5
	 * exactly), and let H be the hours of UT elapsed since that time. Thus we have JD = JD0 + H/24.
	 * 
	 * For both of these Julian dates, compute the number of days and fraction (+ or -) from 2000
	 * January 1, 12h UT, Julian date 2451545.0:
	 * 
	 * D = JD - 2451545.0
	 * D0 = JD0 - 2451545.0
	 * 
	 * Then the Greenwich mean sidereal time in hours is:
	 * 
	 * GMST = 6.697374558 + 0.06570982441908 D0 + 1.00273790935 H + 0.000026 T
	 * 	 * where T = D/36525 is the number of centuries since the year 2000; thus the
	 * last term can be omitted in most applications. It will be necessary to
	 * reduce GMST to the range 0h to 24h. Setting H = 0 in the above formula yields
	 * the Greenwich mean sidereal time at 0h UT, which is tabulated in The Astronomical Almanac.
	 * 
	 * The following alternative formula can be used with a loss of precision of 0.1 second per century:
	 * 
	 * GMST = 18.697374558 + 24.06570982441908 D
	 * 	 * where, as above, GMST must be reduced to the range 0h to 24h. The equations for GMST given
	 * above are adapted from those given in Appendix A of USNO Circular No. 163 (1981).
	 * 	 * The Greenwich apparent sidereal time is obtained by adding a correction to the Greenwich
	 * mean sidereal time computed above. The correction term is called the nutation in right
	 * ascension or the equation of the equinoxes. Thus,
	 * 
	 * GAST = GMST + eqeq.
	 * 
	 * The equation of the equinoxes is given as eqeq = Δψ cos ε where Δψ, the nutation in longitude,
	 * is given in hours approximately by:
	 * 
	 *  Δψ ≈ -0.000319 sin Ω - 0.000024 sin 2L
	 * 
	 * with Ω,  the Longitude of the ascending node of the Moon, given as:
	 * 
	 * Ω = 125.04 - 0.052954 D,
	 * 	 * and L, the Mean Longitude of the Sun, given as:
	 * 
	 * L = 280.47 + 0.98565 D.
	 * 
	 *  ε is the obliquity and is given as:
	 * 
	 *  ε = 23.4393 - 0.0000004 D.
	 * 
	 * The above expressions for Ω, L, and ε are all expressed in degrees.
	 * 	 * The mean or apparent sidereal time locally is found by obtaining the local longitude in degrees,
	 * converting it to hours by dividing by 15, and then adding it to or subtracting it from the Greenwich
	 * time depending on whether the local position is east (add) or west (subtract) of Greenwich.
	 * 
	 * @param date The date
	 * @param observerLongitude The observer longitude, in radians. Longitude East of Greenwich are positive, West of Greenwich are negative.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getLocalSideralTime(Date date, double observerLongitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the decimal time of day in UTC for a given date.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false"
	 * @generated
	 */
  double getUTCDecimalHours(Date date);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Equatorial Coordinates to HorizontalCoordinates for a given geographic location and date.
	 * @param equatorialCoordinates The location, in equatorial coordinates
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * @param date The date
	 * <!-- end-model-doc -->
	 * @model unique="false" equatorialCoordinatesUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" dateDataType="org.eclipse.symphony.core.environment.Date" dateUnique="false"
	 * @generated
	 */
  HorizontalCoordinates convertToHorizontalCoordinates(EquatorialCoordinates equatorialCoordinates, double observerLongitude, double observerLatitude, Date date);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convert a day's hour, minutes and seconds to an angle, in radians. 24 hours converts to 2π (360 degrees).
	 * <!-- end-model-doc -->
	 * @model unique="false" hoursUnique="false" minutesUnique="false" secondsUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double convertTimeToAngle(int hours, int minutes, int seconds);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clamps the specified angle between 0 and 2π (360 degrees).
	 * <!-- end-model-doc -->
	 * @model unique="false" angleInRadiansUnique="false"
	 *        angleInRadiansAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double clampAngleToZero2PI(double angleInRadians);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Ecliptic Coordinates to Equatorial Coordinates.
	 * <!-- end-model-doc -->
	 * @model unique="false" eclipticCoordinatesUnique="false"
	 * @generated
	 */
  EquatorialCoordinates convertToEquatorialCoordinates(EclipticCoordinates eclipticCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Equatorial Coordinates to Ecliptic Coordinates.
	 * <!-- end-model-doc -->
	 * @model unique="false" equatorialCoordinatesUnique="false"
	 * @generated
	 */
  EclipticCoordinates convertToEclipticCoordinates(EquatorialCoordinates equatorialCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Rectangular (x,y,z) Equatorial Coordinates to Equatorial Coordinates
	 * (Right Ascension and Declination).
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Point3d" unique="false" equatorialRectangularCoordinatesDataType="org.eclipse.symphony.core.environment.Point3d" equatorialRectangularCoordinatesUnique="false"
	 * @generated
	 */
  Point3d convertFromEquatorialRectangularToEclipticRectangular(Point3d equatorialRectangularCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Rectangular (x,y,z) Ecliptic Coordinates to Rectangular (x,y,z) Equatorial Coordinates.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Point3d" unique="false" eclipticCoordinatesDataType="org.eclipse.symphony.core.environment.Point3d" eclipticCoordinatesUnique="false"
	 * @generated
	 */
  Point3d convertFromEclipticRectangularToEquatorialRectangular(Point3d eclipticCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Rectangular (x,y,z) Ecliptic Coordinates to Ecliptic Coordinates (longitude, latitude, radius).
	 * <!-- end-model-doc -->
	 * @model unique="false" eclipticCoordinatesDataType="org.eclipse.symphony.core.environment.Point3d" eclipticCoordinatesUnique="false"
	 * @generated
	 */
  EclipticCoordinates convertFromEclipticRectangularToEclipticCoordinates(Point3d eclipticCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts Rectangular (x,y,z) Equatorial Coordinates to Equatorial Coordinates (Right Ascension, Declination).
	 * <!-- end-model-doc -->
	 * @model unique="false" equatorialCoordinatesDataType="org.eclipse.symphony.core.environment.Point3d" equatorialCoordinatesUnique="false"
	 * @generated
	 */
  EquatorialCoordinates convertFromEquatorialRectangularToEquatorialCoordinates(Point3d equatorialCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts HorizontalCoordinates () to Rectangular Horizontal (x,y,z) coordinates. Rectangular
	 * Horizontal coordinates are defined as followed:
	 * - X point to True North.
	 * - Y points West.
	 * - Z point toward nadir (up)
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Point3d" unique="false" horizontalCoordinatesUnique="false"
	 * @generated
	 */
  Point3d convertFromHorizontalCoordinatesToHorizontalRectangular(HorizontalCoordinates horizontalCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Point3d" unique="false" equatorialCoordinatesUnique="false"
	 * @generated
	 */
  Point3d convertFromEquatorialCoordinatesToEquatorialRectangular(EquatorialCoordinates equatorialCoordinates);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Convert Astronomical Units (A.U.) to meters.
	 * <!-- end-model-doc -->
	 * @model unique="false" astronomicalUnitsUnique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='m'"
	 * @generated
	 */
  double convertAUtoMeters(double astronomicalUnits);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the maximum altitude angle that the sun could reach at the specified latitude, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getMaximumSunAltitude(double observerLatitude);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts a sidreal time in HH:mm:ss string
	 * <!-- end-model-doc -->
	 * @model unique="false" sideralTimeUnique="false"
	 * @generated
	 */
  String convertToHHmmssString(double sideralTime);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the sun rise time for a given day and location.
	 * @param day The date of the day
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Date" unique="false" dayDataType="org.eclipse.symphony.core.environment.Date" dayUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	Date getSunRiseTime(Date day, double observerLongitude, double observerLatitude);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the sun set time for a given day and location.
	 * @param day The date of the day
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Date" unique="false" dayDataType="org.eclipse.symphony.core.environment.Date" dayUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	Date getSunSetTime(Date day, double observerLongitude, double observerLatitude);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Computes the time of maximum sun elevation for a given day and location.
	 * @param day The date of the day
	 * @param observerLongitude The observer longitude, in radians. Longitude east of Greenwich are positive, west of Greenwich are negative.
	 * @param observerLatitude The observer latitude, in radians. Latitude North of the equator are positive, Southe of the equator are negative.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.core.environment.Date" unique="false" dayDataType="org.eclipse.symphony.core.environment.Date" dayUnique="false" observerLongitudeUnique="false"
	 *        observerLongitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" observerLatitudeUnique="false"
	 *        observerLatitudeAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	Date getSunHighestElevationTime(Date day, double observerLongitude, double observerLatitude);

} // AstronomyUtils
