/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.vecmath.Matrix3d;

import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Rotation;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.math.MathFactory;
import org.eclipse.symphony.common.math.Matrix3x3;
import org.eclipse.symphony.common.math.Tuple3d;
import org.eclipse.symphony.core.environment.GeographicCoordinates;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.Orbit;
import org.eclipse.symphony.core.environment.orbit.SpacecraftState;
import org.eclipse.symphony.core.environment.orbit.SymphonyOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates;
import org.eclipse.symphony.core.environment.orbit.TimedStampedPVACoordinates;
import org.eclipse.symphony.core.environment.orbit.earth.CartesianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitFacade;
import org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;
import org.eclipse.symphony.core.environment.orbit.earth.KeplerianEarthOrbit;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedFrame;
import org.eclipse.symphony.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import org.eclipse.symphony.core.environment.orbit.earth.TLE;
import org.eclipse.symphony.core.environment.orbit.earth.TLEEarthOrbitPropagator;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import org.orekit.bodies.BodyShape;
import org.orekit.bodies.GeodeticPoint;
import org.orekit.bodies.OneAxisEllipsoid;
import org.orekit.frames.Frame;
import org.orekit.frames.FramesFactory;
import org.orekit.frames.LOFType;
import org.orekit.frames.LocalOrbitalFrame;
import org.orekit.frames.TopocentricFrame;
import org.orekit.frames.Transform;
import org.orekit.orbits.CartesianOrbit;
import org.orekit.orbits.KeplerianOrbit;
import org.orekit.time.AbsoluteDate;
import org.orekit.time.TimeScalesFactory;
import org.orekit.time.UTCScale;
import org.orekit.utils.Constants;
import org.orekit.utils.IERSConventions;
import org.orekit.utils.PVCoordinates;
import org.orekit.utils.TimeStampedAngularCoordinates;
import org.orekit.utils.TimeStampedPVCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EarthOrbitFacadeImpl extends MinimalEObjectImpl.Container implements EarthOrbitFacade 
{	
	private static EarthOrbitFacade instance = null;
	public static EarthOrbitFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new EarthOrbitFacadeImpl();
		}
		return instance;
	}
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyEarthOrbitEnvironmentPackage.Literals.EARTH_ORBIT_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getMu() 
	{
		return org.orekit.utils.Constants.GRIM5C1_EARTH_MU;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public AbsoluteDate createAbsoluteDate(Date date) 
	{
		try
		{			
			UTCScale utcScale = TimeScalesFactory.getUTC();
			return new AbsoluteDate(date, utcScale);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date createDate(AbsoluteDate absoluteDate) 
	{
		try
		{
			UTCScale utcScale = TimeScalesFactory.getUTC();
			Date date = absoluteDate.toDate(utcScale);						
			return date;
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			return null;
		}
	}

		

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public EarthSurfaceLocation createEarthSurfaceLocation(String name, String description, double longitude, double latitude, double elevation) 
	{
		EarthSurfaceLocation loc = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createEarthSurfaceLocation();
		loc.setName(name);
		loc.setDescription(description);
		
		GeographicCoordinates coord = SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		coord.setLatitude(latitude);
		coord.setLongitude(longitude);
		coord.setElevation(elevation);
		
		loc.setGeographicalCoordinates(coord);
		
		return loc;
		
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OreKitBackedFrame createOreKitBackedFrame(Frame oreKitFrame) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public GeographicCoordinates getSpacecraftEarthSubPoint(OreKitBackedSpacecraftState oreKitBackedSpacecraftState) throws Exception
	{		
		org.orekit.propagation.SpacecraftState currentState = oreKitBackedSpacecraftState.getOreKitSpacecraftState();
		
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, FramesFactory.getITRF(IERSConventions.IERS_2010, false));
		
        AbsoluteDate  date    = currentState.getDate();
        PVCoordinates pvInert = currentState.getPVCoordinates();
        Transform     t       = currentState.getFrame().getTransformTo(earth.getBodyFrame(), date);
        Vector3D      p       = t.transformPosition(pvInert.getPosition());
        
        // Computes center line.                      
        Line          centerLine   = new Line(p, new Vector3D(0,0,0));
        GeodeticPoint centerPoint = earth.getIntersectionPoint(centerLine, p, earth.getBodyFrame(), date);

        // Creates the GeographicCoordinates.
        GeographicCoordinates geographicCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
        geographicCoordinates.setLongitude(centerPoint.getLongitude());
        geographicCoordinates.setLatitude(centerPoint.getLatitude());
        geographicCoordinates.setElevation(0);
        return geographicCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getSpacecraftElevationAngle(SpacecraftState spacecraftState, EarthSurfaceLocation earthSurfaceLocation) throws Exception
	{
		GeographicCoordinates surfaceLocation = earthSurfaceLocation.getGeographicalCoordinates();
		OreKitBackedSpacecraftState oss = (OreKitBackedSpacecraftState) spacecraftState;
		
		GeodeticPoint location = new GeodeticPoint(surfaceLocation.getLatitude(), surfaceLocation.getLongitude(), surfaceLocation.getElevation());		
		Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, earthFrame);
		TopocentricFrame loc = new TopocentricFrame(earth, location, "location");
		
				
		Frame inertialFrame = FramesFactory.getEME2000();
		LocalOrbitalFrame lof = new LocalOrbitalFrame(inertialFrame, LOFType.QSW, oss.getOreKitSpacecraftState().getOrbit(), "QSW");
		PVCoordinates pv = lof.getTransformTo(loc, oss.getOreKitSpacecraftState().getDate()).transformPVCoordinates(PVCoordinates.ZERO);
		
		double l = Math.sqrt((pv.getPosition().getX() * pv.getPosition().getX() +  pv.getPosition().getY() *  pv.getPosition().getY()));
	    double elevation = Math.atan2(pv.getPosition().getZ(), l);
		
		return elevation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getSpacecraftAzimuthAngle(SpacecraftState spacecraftState, EarthSurfaceLocation earthSurfaceLocation) throws Exception 
	{
		GeographicCoordinates surfaceLocation = earthSurfaceLocation.getGeographicalCoordinates();
		OreKitBackedSpacecraftState oss = (OreKitBackedSpacecraftState) spacecraftState;
		
		GeodeticPoint location = new GeodeticPoint(surfaceLocation.getLatitude(), surfaceLocation.getLongitude(), surfaceLocation.getElevation());		
		Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, earthFrame);
		TopocentricFrame loc = new TopocentricFrame(earth, location, "location");
		
				
		Frame inertialFrame = FramesFactory.getEME2000();
		LocalOrbitalFrame lof = new LocalOrbitalFrame(inertialFrame, LOFType.QSW, oss.getOreKitSpacecraftState().getOrbit(), "QSW");
		PVCoordinates pv = lof.getTransformTo(loc, oss.getOreKitSpacecraftState().getDate()).transformPVCoordinates(PVCoordinates.ZERO);
		
		 // Calculate the azimuth.
	    double azimuth = Math.atan2(pv.getPosition().getX(), pv.getPosition().getY());
	    
	    return azimuth;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public double getRange(SpacecraftState spacecraftState, EarthSurfaceLocation earthSurfaceLocation) throws Exception 
	{
		GeographicCoordinates surfaceLocation = earthSurfaceLocation.getGeographicalCoordinates();
		OreKitBackedSpacecraftState oss = (OreKitBackedSpacecraftState) spacecraftState;
		
		GeodeticPoint location = new GeodeticPoint(surfaceLocation.getLatitude(), surfaceLocation.getLongitude(), surfaceLocation.getElevation());		
		Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, earthFrame);
		TopocentricFrame loc = new TopocentricFrame(earth, location, "location");
						
		Frame inertialFrame = FramesFactory.getEME2000();
		LocalOrbitalFrame lof = new LocalOrbitalFrame(inertialFrame, LOFType.QSW, oss.getOreKitSpacecraftState().getOrbit(), "QSW");
		PVCoordinates pv = lof.getTransformTo(loc, oss.getOreKitSpacecraftState().getDate()).transformPVCoordinates(PVCoordinates.ZERO);
		
		double range = pv.getPosition().getNorm();
		
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SpacecraftState createSpacecraftState(Orbit orbit, org.orekit.propagation.SpacecraftState oreKitSpacecraftState) 
	{
		OreKitBackedSpacecraftState ss = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createOreKitBackedSpacecraftState();
		
		// Sets Coordinates.
		TimedStampedPVACoordinates timedStampedPVACoordinates = createTimedStampedPVACoordinates(oreKitSpacecraftState.getPVCoordinates());
		ss.setCoordinates(timedStampedPVACoordinates);
		
		// TODO Sets Attitude.
		// TimedStampedAngularCoordinates attitude = createTimedStampedAngularCoordinates(oreKitSpacecraftState.getAttitude());
		// ss.setAttitude(attitude);
		
		// Sets orbit.		
		ss.setOrbit(orbit);
						
		// Sets date.
		Date date = createDate(oreKitSpacecraftState.getDate());
		ss.setTime(date);
		
		// Sets OreKitState.
		ss.setOreKitSpacecraftState(oreKitSpacecraftState);
		
		return ss;
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public OreKitBackedSpacecraftState createOreKitBackedSpacecraftState(Orbit orbit, org.orekit.propagation.SpacecraftState oreKitSpacecraftState) 
	{	
		OreKitBackedSpacecraftState ss = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createOreKitBackedSpacecraftState();
		
		// Sets Coordinates.
		TimedStampedPVACoordinates timedStampedPVACoordinates = createTimedStampedPVACoordinates(oreKitSpacecraftState.getPVCoordinates());
		ss.setCoordinates(timedStampedPVACoordinates);
		
		// Sets Attitude.
		// TODO TimedStampedAngularCoordinates attitude = createAttitude(oreKitSpacecraftState.getAttitude());
		// ss.setAttitude(attitude);
		
		// Sets orbit.
		ss.setOrbit(orbit);
						
		// Sets date.
		Date date = createDate(oreKitSpacecraftState.getDate());
		ss.setTime(date);
		
		// Set OreKit SpacecraftState
		ss.setOreKitSpacecraftState(oreKitSpacecraftState);
		
		return ss;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TimedStampedPVACoordinates createTimedStampedPVACoordinates(TimeStampedPVCoordinates oreKitTimeStampedPVCoordinates) 
	{
		TimedStampedPVACoordinates coord = SymphonyOrbitEnvironmentFactory.eINSTANCE.createTimedStampedPVACoordinates();
		
		// Sets date.
		Date date = createDate(oreKitTimeStampedPVCoordinates.getDate());
		coord.setTime(date);
		
		// Position
		Tuple3d position = MathFacade.INSTANCE.createTuple3d(oreKitTimeStampedPVCoordinates.getPosition().getX(), oreKitTimeStampedPVCoordinates.getPosition().getY(), oreKitTimeStampedPVCoordinates.getPosition().getZ());
		coord.setPosition(position);
		
		// Velocity
		Tuple3d velocity = MathFacade.INSTANCE.createTuple3d(oreKitTimeStampedPVCoordinates.getVelocity().getX(), oreKitTimeStampedPVCoordinates.getVelocity().getY(), oreKitTimeStampedPVCoordinates.getVelocity().getZ());
		coord.setVelocity(velocity);
		
		// Acceleration
		Tuple3d acceleration = MathFacade.INSTANCE.createTuple3d(oreKitTimeStampedPVCoordinates.getAcceleration().getX(), oreKitTimeStampedPVCoordinates.getAcceleration().getY(), oreKitTimeStampedPVCoordinates.getAcceleration().getZ());
		coord.setAcceleration(acceleration);
		
		// Angular Velocity
		Tuple3d angularVelocity = MathFacade.INSTANCE.createTuple3d(oreKitTimeStampedPVCoordinates.getAngularVelocity().getX(), oreKitTimeStampedPVCoordinates.getAngularVelocity().getY(), oreKitTimeStampedPVCoordinates.getAngularVelocity().getZ());
		coord.setAngularVelocity(angularVelocity);
		
		return coord;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TimedStampedAngularCoordinates createTimedStampedAngularCoordinates(TimeStampedAngularCoordinates oreKitTimeStampedAngularCoordinates) 
	{
		TimedStampedAngularCoordinates timedStampedAngularCoordinates =  SymphonyOrbitEnvironmentFactory.eINSTANCE.createTimedStampedAngularCoordinates();
		
		// Sets date.
		Date date = createDate(oreKitTimeStampedAngularCoordinates.getDate());
		timedStampedAngularCoordinates.setTime(date);
		
		// Sets angular acceleration.
		Tuple3d angularAcceleration = MathFacade.INSTANCE.createTuple3d(oreKitTimeStampedAngularCoordinates.getRotationAcceleration().getX(), oreKitTimeStampedAngularCoordinates.getRotationAcceleration().getY(), oreKitTimeStampedAngularCoordinates.getRotationAcceleration().getZ());
		timedStampedAngularCoordinates.setAngularAcceleration(angularAcceleration);
		
		// Sets rotation.
		Matrix3x3 rotationMatrix = createMatrix3x3(oreKitTimeStampedAngularCoordinates.getRotation());
		timedStampedAngularCoordinates.setRotation(rotationMatrix);
		
		return timedStampedAngularCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Matrix3x3 createMatrix3x3(Rotation rotation) 
	{
		Matrix3x3 matrix3x3 = MathFactory.eINSTANCE.createMatrix3x3();		
		
		Matrix3d rot = new Matrix3d();
		double[][] m = rotation.getMatrix();
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				rot.setElement(i, j, m[i][j]);
			}
		}
		
		return matrix3x3;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Rotation createRotation(Matrix3x3 matrix3x3) 
	{				
		Matrix3d rot = matrix3x3.asMatrix3d();
		double[][] m = new double[][]{{0,0,0},{0,0,0},{0,0,0}};
		
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				m[i][j] = rot.getElement(i, j);
			}
		}
		
		// TODO Check threshold value !
		Rotation rotation = new Rotation(m, 1.0e-10);
		
		return rotation;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws Exception 
	 * @generated_NOT
	 */
	public KeplerianEarthOrbit createKeplerianOrbit(EarthOrbitPropagator earthOrbitPropagator) throws Exception 
	{
		if(earthOrbitPropagator instanceof TLEEarthOrbitPropagator)
		{
			TLEEarthOrbitPropagator tlePropagator = (TLEEarthOrbitPropagator) earthOrbitPropagator;
			Date epoch = tlePropagator.getTle().getEpoch();
			
			AbsoluteDate startDate = createAbsoluteDate(epoch);
			org.orekit.propagation.SpacecraftState ss = tlePropagator.getOreKitTLEPropagator().propagate(startDate);
			
			KeplerianOrbit ko = new KeplerianOrbit(ss.getPVCoordinates(), ss.getFrame(), startDate, getMu());
			
			// Creates and return the Symphony KeplerianEarthOrbit.
			return createKeplerianOrbit(ko);
		}
		else if(earthOrbitPropagator.getInitialOrbit() instanceof EarthOrbit)
		{
			EarthOrbit eo = (EarthOrbit) earthOrbitPropagator.getInitialOrbit();
			
			// Creates the OreKit KeplerianOrbit.
			KeplerianOrbit ko = new KeplerianOrbit(eo.getOreKitOrbit());
			
			// Creates and return the Symphony KeplerianEarthOrbit.
			return createKeplerianOrbit(ko);
		}
		else
		{
			throw new Exception("Unsupported EarthOrbitPropagator type <" + earthOrbitPropagator + "> !");
		}
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianEarthOrbit createCartesianEarthOrbit(EarthOrbitPropagator earthOrbitPropagator) throws Exception 
	{
		// Gets a KeplerianEarthOrbit first
		KeplerianEarthOrbit keo = createKeplerianOrbit(earthOrbitPropagator);
		
		KeplerianOrbit ko = keo.getOreKitKeplerianOrbit();
		
		// Creates the OreKit CartesianOrbit.
		CartesianOrbit co = new CartesianOrbit(ko);
		
		// Creates and return the Symphony CartesianOrbit.
		return createCartesianEarthOrbit(co);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public KeplerianEarthOrbit createKeplerianOrbit(KeplerianOrbit oreKitKeplerianOrbit) 
	{
		KeplerianEarthOrbit keo = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createKeplerianEarthOrbit();
		
		keo.setTime(createDate(oreKitKeplerianOrbit.getDate()));
		keo.setEccentricity(oreKitKeplerianOrbit.getE());
		keo.setInclination(oreKitKeplerianOrbit.getI());
		keo.setMeanAnomaly(oreKitKeplerianOrbit.getMeanAnomaly());
		keo.setTrueAnomaly(oreKitKeplerianOrbit.getTrueAnomaly());
		keo.setPerigeeArgument(oreKitKeplerianOrbit.getPerigeeArgument());
		keo.setRightAscentionOfAscendingNode(oreKitKeplerianOrbit.getRightAscensionOfAscendingNode());
		keo.setSemiMajorAxis(oreKitKeplerianOrbit.getA());
		
		return keo;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public CartesianEarthOrbit createCartesianEarthOrbit(CartesianOrbit oreKitCartesianOrbit) 
	{
		CartesianEarthOrbit ceo = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createCartesianEarthOrbit();	
		TimedStampedPVACoordinates pva = createTimedStampedPVACoordinates(oreKitCartesianOrbit.getPVCoordinates());		
		ceo.setPvaCoordinates(pva);
		ceo.setTime(createDate(oreKitCartesianOrbit.getDate()));
		return ceo;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public GeographicCoordinates convertToGeographicCoordinates(OreKitBackedSpacecraftState oreKitBackedSpacecraftState) throws Exception 
	{
		GeographicCoordinates geographicCoordinates = null;
		
		// Sets up Earth model
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS, Constants.WGS84_EARTH_FLATTENING, FramesFactory.getITRF(IERSConventions.IERS_2010, false));									
		org.orekit.propagation.SpacecraftState currentState = oreKitBackedSpacecraftState.getOreKitSpacecraftState();
		
        // Compute sub-satellite track
        AbsoluteDate  date    = currentState.getDate();
        PVCoordinates pvInert = currentState.getPVCoordinates();
        Transform     t       = currentState.getFrame().getTransformTo(earth.getBodyFrame(), date);
        Vector3D      p       = t.transformPosition(pvInert.getPosition());
        //Vector3D      v       = t.transformVector(pvInert.getVelocity());
        GeodeticPoint center  = earth.transform(p, earth.getBodyFrame(), date);
        
        geographicCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
        geographicCoordinates.setLongitude(center.getLongitude());
        geographicCoordinates.setLatitude(center.getLatitude());
        geographicCoordinates.setElevation(center.getAltitude());                                   
				
		return geographicCoordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<VisibilityPass> getVisibilityPassSortedByStartDate(List<VisibilityPass> passes) 
	{				
		SortedSet<VisibilityPass> sortedSet = new TreeSet<VisibilityPass>(new VisibilityPassStartDateComparator());
		sortedSet.addAll(passes);
		return sortedSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<VisibilityPass> getVisibilityPassSortedByDuration(List<VisibilityPass> passes) 
	{
		SortedSet<VisibilityPass> sortedSet = new TreeSet<VisibilityPass>(new VisibilityPassDurationComparator());
		sortedSet.addAll(passes);
		return sortedSet;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<VisibilityPassSpacecraftPosition> getVisibilityPassSpacecraftPositionSortedByElevation(List<VisibilityPassSpacecraftPosition> positions) {
		SortedSet<VisibilityPassSpacecraftPosition> sortedSet = new TreeSet<VisibilityPassSpacecraftPosition>(new VisibilityPassSpacecraftPositionElevationComparator());
		sortedSet.addAll(positions);
		return sortedSet;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public SortedSet<VisibilityPassSpacecraftPosition> getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle(List<VisibilityPassSpacecraftPosition> positions) 
	{
		SortedSet<VisibilityPassSpacecraftPosition> sortedSet = new TreeSet<VisibilityPassSpacecraftPosition>(new VisibilityPassSpacecraftPositionSpacecraftCrossTrackAngleComparator());
		sortedSet.addAll(positions);
		return sortedSet;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TLE loadTLE(String urlString) throws Exception 
	{
		TLE tle = null;
		
		// Tries to open the file.
		URL url = new URL(urlString);
		File tempFile = copyURLContent(url);
						
		// Reads the first two lines of the file.
		FileInputStream fis = new FileInputStream(tempFile);
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));		
		String[] lines = new String[2];
		int i = 0;
		
		String line = null;
		while ((line = br.readLine()) != null && i < 2) 
		{		
			lines[i] = line;
			i++;
		}	 
		br.close();				
		
		// Create the TLE.
		tle = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createTLE();
		tle.setLine1(lines[0]);
		tle.setLine2(lines[1]);
		
		return tle;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TLEEarthOrbitPropagator createTLEEarthOrbitPropagator(TLE tle) throws Exception 
	{
		// Create a new TLEEarthOrbitPropagator
		TLEEarthOrbitPropagator propagator = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createTLEEarthOrbitPropagator();
		
		// Sets TLE.
		propagator.setTle(tle);
		
		return propagator;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_MU:
				return getMu();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_ABSOLUTE_DATE__DATE:
				return createAbsoluteDate((Date)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_DATE__ABSOLUTEDATE:
				return createDate((AbsoluteDate)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_EARTH_SURFACE_LOCATION__STRING_STRING_DOUBLE_DOUBLE_DOUBLE:
				return createEarthSurfaceLocation((String)arguments.get(0), (String)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3), (Double)arguments.get(4));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_ORE_KIT_BACKED_FRAME__FRAME:
				return createOreKitBackedFrame((Frame)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_SPACECRAFT_EARTH_SUB_POINT__OREKITBACKEDSPACECRAFTSTATE:
				try {
					return getSpacecraftEarthSubPoint((OreKitBackedSpacecraftState)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_SPACECRAFT_ELEVATION_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION:
				try {
					return getSpacecraftElevationAngle((SpacecraftState)arguments.get(0), (EarthSurfaceLocation)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_SPACECRAFT_AZIMUTH_ANGLE__SPACECRAFTSTATE_EARTHSURFACELOCATION:
				try {
					return getSpacecraftAzimuthAngle((SpacecraftState)arguments.get(0), (EarthSurfaceLocation)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_RANGE__SPACECRAFTSTATE_EARTHSURFACELOCATION:
				try {
					return getRange((SpacecraftState)arguments.get(0), (EarthSurfaceLocation)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE:
				return createSpacecraftState((Orbit)arguments.get(0), (org.orekit.propagation.SpacecraftState)arguments.get(1));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_ORE_KIT_BACKED_SPACECRAFT_STATE__ORBIT_SPACECRAFTSTATE:
				return createOreKitBackedSpacecraftState((Orbit)arguments.get(0), (org.orekit.propagation.SpacecraftState)arguments.get(1));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_TIMED_STAMPED_PVA_COORDINATES__TIMESTAMPEDPVCOORDINATES:
				return createTimedStampedPVACoordinates((TimeStampedPVCoordinates)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_TIMED_STAMPED_ANGULAR_COORDINATES__TIMESTAMPEDANGULARCOORDINATES:
				return createTimedStampedAngularCoordinates((TimeStampedAngularCoordinates)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_MATRIX3X3__ROTATION:
				return createMatrix3x3((Rotation)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_ROTATION__MATRIX3X3:
				return createRotation((Matrix3x3)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_KEPLERIAN_ORBIT__EARTHORBITPROPAGATOR:
				try {
					return createKeplerianOrbit((EarthOrbitPropagator)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__EARTHORBITPROPAGATOR:
				try {
					return createCartesianEarthOrbit((EarthOrbitPropagator)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_KEPLERIAN_ORBIT__KEPLERIANORBIT:
				try {
					return createKeplerianOrbit((KeplerianOrbit)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_CARTESIAN_EARTH_ORBIT__CARTESIANORBIT:
				try {
					return createCartesianEarthOrbit((CartesianOrbit)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CONVERT_TO_GEOGRAPHIC_COORDINATES__OREKITBACKEDSPACECRAFTSTATE:
				try {
					return convertToGeographicCoordinates((OreKitBackedSpacecraftState)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SORTED_BY_START_DATE__LIST:
				return getVisibilityPassSortedByStartDate((List<VisibilityPass>)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SORTED_BY_DURATION__LIST:
				return getVisibilityPassSortedByDuration((List<VisibilityPass>)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_ELEVATION__LIST:
				return getVisibilityPassSpacecraftPositionSortedByElevation((List<VisibilityPassSpacecraftPosition>)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___GET_VISIBILITY_PASS_SPACECRAFT_POSITION_SORTED_BY_SPACECRAFT_CROSS_TRACK_ANGLE__LIST:
				return getVisibilityPassSpacecraftPositionSortedBySpacecraftCrossTrackAngle((List<VisibilityPassSpacecraftPosition>)arguments.get(0));
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___LOAD_TLE__STRING:
				try {
					return loadTLE((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_FACADE___CREATE_TLE_EARTH_ORBIT_PROPAGATOR__TLE:
				try {
					return createTLEEarthOrbitPropagator((TLE)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	private class VisibilityPassStartDateComparator implements Comparator<VisibilityPass>
	{
		@Override
		public int compare(VisibilityPass arg0, VisibilityPass arg1) 
		{
			long startTime0 = arg0.getStartTime().getTime();
			long startTime1 = arg1.getStartTime().getTime();
			
			if(startTime0 > startTime1)
			{
				return 1;
			}
			else if(startTime0 < startTime1)
			{
				return -1;
			}
			else
			{
				double duration0 = arg0.getDuration();
				double duration1 = arg1.getDuration();
				
				if(duration0 > duration1)
				{
					return 1;
				}
				else if(duration0 < duration1)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		}
		
	}
	
	private class VisibilityPassDurationComparator implements Comparator<VisibilityPass>
	{
		@Override
		public int compare(VisibilityPass arg0, VisibilityPass arg1) 
		{
			double duration0 = arg0.getDuration();
			double duration1 = arg1.getDuration();
			
			if(duration0 > duration1)
			{
				return 1;
			}
			else if(duration0 < duration1)
			{
				return -1;
			}
			else
			{						
				long startTime0 = arg0.getStartTime().getTime();
				long startTime1 = arg1.getStartTime().getTime();
				
				if(startTime0 > startTime1)
				{
					return 1;
				}
				else if(startTime0 < startTime1)
				{
					return -1;
				}
				else
				{
					return 0;
				}
			}
		}		
	}
	
	private class VisibilityPassSpacecraftPositionElevationComparator implements Comparator<VisibilityPassSpacecraftPosition>
	{
		@Override
		public int compare(VisibilityPassSpacecraftPosition arg0,VisibilityPassSpacecraftPosition arg1) 
		{
			if(arg0.getElevation() > arg1.getElevation())
			{
				return 1;
			}
			else if(arg0.getElevation() < arg1.getElevation())
			{
				return -1;
			}
			else
			{
				return 0;
			}			
		}		
	}
	
	private class VisibilityPassSpacecraftPositionSpacecraftCrossTrackAngleComparator implements Comparator<VisibilityPassSpacecraftPosition>
	{
		@Override
		public int compare(VisibilityPassSpacecraftPosition arg0,VisibilityPassSpacecraftPosition arg1) 
		{
			if(arg0.getSpacecraftCrossTrackAngle() > arg1.getSpacecraftCrossTrackAngle())
			{
				return 1;
			}
			else if(arg0.getSpacecraftCrossTrackAngle() < arg1.getSpacecraftCrossTrackAngle())
			{
				return -1;
			}
			else
			{
				return 0;
			}			
		}		
	}
	
	private String getFileName(URL url)
	{
		String fileName = url.getFile();
		
		int startIndex = fileName.lastIndexOf(File.separator);				
		int endIndex = fileName.lastIndexOf(".");
		if(startIndex > 0 && endIndex > 0)
		{
			fileName = fileName.substring(startIndex+1, endIndex);
		}
		
		return fileName;
	}
	
	private String getFileExtension(URL url)
	{
		String fileExtension = url.getFile();
		
		int index = fileExtension.lastIndexOf(".");
		if(index > 0)
		{
			fileExtension = fileExtension.substring(index);
		}
		
		return fileExtension;
	}
	
	private File copyURLContent(URL url)
	{		
		File tempFile = null;
		try
		{	
			String fileName = getFileName(url);
			String fileExtension = getFileExtension(url);
					
			tempFile = File.createTempFile(fileName, fileExtension);
								
			url.openConnection();
			InputStream reader = url.openStream();
		 			 	    	   		
			FileOutputStream writer = new FileOutputStream(tempFile);
			byte[] buffer = new byte[153600];
			int bytesRead = 0;
			while ((bytesRead = reader.read(buffer)) > 0)
			{  
			    writer.write(buffer, 0, bytesRead);
			    buffer = new byte[153600];
			}
			writer.close();
			reader.close();			
			
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
		
		if(tempFile != null)
		{
			tempFile.deleteOnExit();
		}
		
		return tempFile;
	}
} //EarthOrbitFacadeImpl