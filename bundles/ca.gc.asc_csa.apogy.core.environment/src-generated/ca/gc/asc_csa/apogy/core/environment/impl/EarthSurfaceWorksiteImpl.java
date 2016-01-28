/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.core.environment.Activator;
import ca.gc.asc_csa.apogy.core.environment.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import org.gavaghan.geodesy.Ellipsoid;
import org.gavaghan.geodesy.GeodeticCalculator;
import org.gavaghan.geodesy.GeodeticCurve;
import org.gavaghan.geodesy.GlobalCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl#getGeographicalCoordinates <em>Geographical Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl#getXAxisAzimuth <em>XAxis Azimuth</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.EarthSurfaceWorksiteImpl#getEarthSky <em>Earth Sky</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EarthSurfaceWorksiteImpl extends SurfaceWorksiteImpl implements EarthSurfaceWorksite
{
	
  /**
	 * The cached value of the '{@link #getGeographicalCoordinates() <em>Geographical Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getGeographicalCoordinates()
	 * @generated
	 * @ordered
	 */
  protected GeographicCoordinates geographicalCoordinates;
  /**
	 * The default value of the '{@link #getXAxisAzimuth() <em>XAxis Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXAxisAzimuth()
	 * @generated
	 * @ordered
	 */
  protected static final double XAXIS_AZIMUTH_EDEFAULT = 0.0;
  /**
	 * The cached value of the '{@link #getXAxisAzimuth() <em>XAxis Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getXAxisAzimuth()
	 * @generated
	 * @ordered
	 */
  protected double xAxisAzimuth = XAXIS_AZIMUTH_EDEFAULT;
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EarthSurfaceWorksiteImpl()
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
		return ApogyCoreEnvironmentPackage.Literals.EARTH_SURFACE_WORKSITE;
	}

  @Override
  public WorksiteNode getWorksiteNode() 
  	{
	  if(!(super.getWorksiteNode() instanceof EarthSurfaceWorksiteNode))
		{
			worksiteNode = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksiteNode();
			worksiteNode.setWorksite(this);  			
		}
		
		return worksiteNode;
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public GeographicCoordinates getGeographicalCoordinates()
  {
	  
	  GeographicCoordinates coords = getGeographicalCoordinatesGen();
	  if(coords == null)
	  {
		  coords = ApogyCoreEnvironmentFacade.INSTANCE.getMarsYardGeographicalCoordinates();		  
		  setGeographicalCoordinates(coords);
	  }
	  
	  return coords;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public GeographicCoordinates getGeographicalCoordinatesGen()
  {
		return geographicalCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetGeographicalCoordinates(GeographicCoordinates newGeographicalCoordinates, NotificationChain msgs)
  {
		GeographicCoordinates oldGeographicalCoordinates = geographicalCoordinates;
		geographicalCoordinates = newGeographicalCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, oldGeographicalCoordinates, newGeographicalCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setGeographicalCoordinates(GeographicCoordinates newGeographicalCoordinates)
  {
		if (newGeographicalCoordinates != geographicalCoordinates) {
			NotificationChain msgs = null;
			if (geographicalCoordinates != null)
				msgs = ((InternalEObject)geographicalCoordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, null, msgs);
			if (newGeographicalCoordinates != null)
				msgs = ((InternalEObject)newGeographicalCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, null, msgs);
			msgs = basicSetGeographicalCoordinates(newGeographicalCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES, newGeographicalCoordinates, newGeographicalCoordinates));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getXAxisAzimuth()
  {
		return xAxisAzimuth;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setXAxisAzimuth(double newXAxisAzimuth)
  {
		double oldXAxisAzimuth = xAxisAzimuth;
		xAxisAzimuth = newXAxisAzimuth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH, oldXAxisAzimuth, xAxisAzimuth));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EarthSky getEarthSky()
  {
	  EarthSky es = getEarthSkyGen();
	  
	  if(es == null)
	  {
		  es = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSky();		  
		  setSky(es);
	  }
	  
	  return es;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EarthSky getEarthSkyGen()
  {
		EarthSky earthSky = basicGetEarthSky();
		return earthSky != null && earthSky.eIsProxy() ? (EarthSky)eResolveProxy((InternalEObject)earthSky) : earthSky;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public EarthSky basicGetEarthSky()
  {
	  return (EarthSky) super.getSky();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setEarthSky(EarthSky newEarthSky)
  {
	super.setSky(newEarthSky);
  }

  	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public GeographicCoordinates convertToGeographicCoordinates(Tuple3d position) 
	{		
		GlobalCoordinates origin = new GlobalCoordinates(Math.toDegrees(getGeographicalCoordinates().getLatitude()), 
														 Math.toDegrees(getGeographicalCoordinates().getLongitude()));
		
		// Select a reference ellipsoid, for more information go to: http://en.wikipedia.org/wiki/World_Geodetic_System
		Ellipsoid reference = Ellipsoid.WGS84;
		
		// Computes the distance traveled on the XY plane.
		double distance = Math.sqrt(position.getX() * position.getX() + position.getY() * position.getY());
		
		// Computes the bearing of the displacement.
		double angleInWorksiteFrame = Math.atan2(position.getY(), position.getX());		
		double startBearing = -Math.toDegrees(angleInWorksiteFrame  + getXAxisAzimuth());
		
		GeodeticCalculator geoCalc = new GeodeticCalculator();
		GlobalCoordinates endGlobalCoordinates = geoCalc.calculateEndingGlobalCoordinates(reference, origin, startBearing, distance);
						
		GeographicCoordinates result = ApogyCoreEnvironmentFactory.eINSTANCE.createGeographicCoordinates();
		
		double latitude = Math.toRadians(endGlobalCoordinates.getLatitude());
		double longitude = Math.toRadians(endGlobalCoordinates.getLongitude());
		double elevation = getGeographicalCoordinates().getElevation() + position.getZ();

		result.setLatitude(latitude);
		result.setLongitude(longitude);
		result.setElevation(elevation);
		
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Tuple3d convertToXYZPosition(GeographicCoordinates geographicalCoordinates) 
	{
		Tuple3d result = ApogyCommonMathFactory.eINSTANCE.createTuple3d();
		
		GlobalCoordinates origin = new GlobalCoordinates(Math.toDegrees(getGeographicalCoordinates().getLatitude()), 
														 Math.toDegrees(getGeographicalCoordinates().getLongitude()));

		GlobalCoordinates coordinates = new GlobalCoordinates(Math.toDegrees(geographicalCoordinates.getLatitude()),  
															  Math.toDegrees(geographicalCoordinates.getLongitude()));
		GeodeticCalculator geoCalc = new GeodeticCalculator();
		
		// Select a reference ellipsoid, for more information go to: http://en.wikipedia.org/wiki/World_Geodetic_System
		Ellipsoid reference = Ellipsoid.WGS84;

		GeodeticCurve geoCurve = geoCalc.calculateGeodeticCurve(reference, origin, coordinates);
		double x = 0;
		double y = 0;
		if(geoCurve.getEllipsoidalDistance() != 0)
		{
			double northEastAngle = Math.PI - getXAxisAzimuth();
			// System.out.println("northEastAngle (deg) : " + Math.toDegrees(northEastAngle));
			
			double DN = -geoCurve.getEllipsoidalDistance() * Math.cos(Math.toRadians(geoCurve.getAzimuth()));
			double DE = -geoCurve.getEllipsoidalDistance() * Math.sin(Math.toRadians(geoCurve.getAzimuth()));
			x = DN * Math.cos(northEastAngle) + DE * Math.sin(northEastAngle);
			y = -1 * (-DN * Math.sin(northEastAngle) + DE * Math.cos(northEastAngle));
		}
		double z = geographicalCoordinates.getElevation() - getGeographicalCoordinates().getElevation();

		result.setX(x);
		result.setY(y);
		result.setZ(z);
		
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				return basicSetGeographicalCoordinates(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				return getGeographicalCoordinates();
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				return getXAxisAzimuth();
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				if (resolve) return getEarthSky();
				return basicGetEarthSky();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				setGeographicalCoordinates((GeographicCoordinates)newValue);
				return;
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				setXAxisAzimuth((Double)newValue);
				return;
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				setEarthSky((EarthSky)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				setGeographicalCoordinates((GeographicCoordinates)null);
				return;
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				setXAxisAzimuth(XAXIS_AZIMUTH_EDEFAULT);
				return;
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				setEarthSky((EarthSky)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
				return geographicalCoordinates != null;
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__XAXIS_AZIMUTH:
				return xAxisAzimuth != XAXIS_AZIMUTH_EDEFAULT;
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE__EARTH_SKY:
				return basicGetEarthSky() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE___CONVERT_TO_GEOGRAPHIC_COORDINATES__TUPLE3D:
				return convertToGeographicCoordinates((Tuple3d)arguments.get(0));
			case ApogyCoreEnvironmentPackage.EARTH_SURFACE_WORKSITE___CONVERT_TO_XYZ_POSITION__GEOGRAPHICCOORDINATES:
				return convertToXYZPosition((GeographicCoordinates)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (xAxisAzimuth: ");
		result.append(xAxisAzimuth);
		result.append(')');
		return result.toString();
	}
  
  @Override
  public void setSky(Sky newSky) 
  {
	  // Removes topology from previous Sky if applicable.
	  if(this.getSky() != null)
	  {
		  if(this.getWorksiteNode() instanceof EarthSurfaceWorksiteNode)
		  {
			  EarthSurfaceWorksiteNode earthSurfaceWorksiteNode = (EarthSurfaceWorksiteNode) this.getWorksiteNode();			  			  			  
			  earthSurfaceWorksiteNode.getSkyTransformNode().getChildren().remove(this.getSky().getSkyNode());
			  earthSurfaceWorksiteNode.getChildren().remove(this.getSky().getSkyNode());
		  } 		  
	  }
	  	  	  
	  // Updates sky
	  setSkyGen(newSky);
	  
	  // Adds topology from new Sky Sky if applicable.
	  if(newSky != null) 
	  {		  
		  if(this.getWorksiteNode() instanceof EarthSurfaceWorksiteNode)
		  {
			  EarthSurfaceWorksiteNode earthSurfaceWorksiteNode = (EarthSurfaceWorksiteNode) this.getWorksiteNode();				  
			  earthSurfaceWorksiteNode.getSkyTransformNode().getChildren().add(newSky.getSkyNode());
			  
			  // Should not have to do this..
			  newSky.getSkyNode().setParent(earthSurfaceWorksiteNode.getSkyTransformNode());
		  }		  
	  }	
  }
  
  
  @SuppressWarnings("unused")
  private void updateTime(long newTime)
  {
	  try
	  {
			if(getGeographicalCoordinates() != null)
			{		
				if(getEarthSky() != null)
				{
					getEarthSky().setTime(new Date(newTime));
				}
				else
				{
					// Log an error.
					Logger.INSTANCE.log(Activator.ID, this, "The Earth Sky is null!", EventSeverity.ERROR);																		
				}
			}
			else
			{
				Logger.INSTANCE.log(Activator.ID, this, "No location defined for the worksite !", EventSeverity.ERROR);
			}
	  }
	  catch(Exception e)
	  {
			e.printStackTrace();
			
			Logger.INSTANCE.log(Activator.ID, this, "An error occured while updating the time !", EventSeverity.ERROR, e);				
	  }		
  }
} //EarthSurfaceWorksiteImpl
