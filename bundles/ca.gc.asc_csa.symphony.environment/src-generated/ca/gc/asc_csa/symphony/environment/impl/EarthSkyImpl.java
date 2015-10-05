/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Iterator;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.symphony.environment.Activator;
import ca.gc.asc_csa.symphony.environment.AstronomyUtils;
import ca.gc.asc_csa.symphony.environment.EarthSky;
import ca.gc.asc_csa.symphony.environment.EarthSkyNode;
import ca.gc.asc_csa.symphony.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.symphony.environment.EnvironmentFacade;
import ca.gc.asc_csa.symphony.environment.GeographicCoordinates;
import ca.gc.asc_csa.symphony.environment.HorizontalCoordinates;
import ca.gc.asc_csa.symphony.environment.Moon;
import ca.gc.asc_csa.symphony.environment.SkyNode;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TransformNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Sky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.EarthSkyImpl#getMoon <em>Moon</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.EarthSkyImpl#getMoonHorizontalCoordinates <em>Moon Horizontal Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarthSkyImpl extends SkyImpl implements EarthSky
{
	private Adapter adapter = null;
	
  /**
	 * The cached value of the '{@link #getMoon() <em>Moon</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMoon()
	 * @generated
	 * @ordered
	 */
  protected Moon moon;

  /**
	 * The cached value of the '{@link #getMoonHorizontalCoordinates() <em>Moon Horizontal Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMoonHorizontalCoordinates()
	 * @generated
	 * @ordered
	 */
  protected HorizontalCoordinates moonHorizontalCoordinates;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected EarthSkyImpl()
  {
    super();
    
    this.eAdapters().add(getAdapter());
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return SymphonyEnvironmentPackage.Literals.EARTH_SKY;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Moon getMoon()
  {
		// Explores children to find the Moon.
		if(basicGetMoon() == null)
		{			
			moon = findMoonInTopology();							
		}
		return moon;
  }
  
	/**
	 * Searches the topology to find the Moon.
	 * @return The Moon, null if not found. 
	 */
	private Moon findMoonInTopology()
	{
		Moon foundMoon = null;
		
		EList<Node> children = getSkyNode().getChildren();
		Iterator<Node> it = children.iterator();
		while(it.hasNext() && (foundMoon == null))
		{
			Node node = it.next();						
			
			if(node instanceof TransformNode)
			{
				TransformNode t = (TransformNode) node;
				
				EList<Node> tChildren = t.getChildren();
				Iterator<Node> tIt = tChildren.iterator();
				while(tIt.hasNext() && (foundMoon == null))
				{
					Node n = tIt.next();
					
					if(n instanceof Moon)
					{
						foundMoon = (Moon) n;
					}
				}					
			}
		}
		
		return foundMoon;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Moon basicGetMoon()
  {
		return moon;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public HorizontalCoordinates getMoonHorizontalCoordinates()
  {
		if(getMoonHorizontalCoordinatesGen() == null)
		{
			HorizontalCoordinates newHorizontalCoordinates = SymphonyEnvironmentFactory.eINSTANCE.createHorizontalCoordinates();
			setMoonHorizontalCoordinates(newHorizontalCoordinates);
		}
		
		return moonHorizontalCoordinates;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HorizontalCoordinates getMoonHorizontalCoordinatesGen()
  {
		if (moonHorizontalCoordinates != null && moonHorizontalCoordinates.eIsProxy()) {
			InternalEObject oldMoonHorizontalCoordinates = (InternalEObject)moonHorizontalCoordinates;
			moonHorizontalCoordinates = (HorizontalCoordinates)eResolveProxy(oldMoonHorizontalCoordinates);
			if (moonHorizontalCoordinates != oldMoonHorizontalCoordinates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES, oldMoonHorizontalCoordinates, moonHorizontalCoordinates));
			}
		}
		return moonHorizontalCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HorizontalCoordinates basicGetMoonHorizontalCoordinates()
  {
		return moonHorizontalCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMoonHorizontalCoordinates(HorizontalCoordinates newMoonHorizontalCoordinates)
  {
		HorizontalCoordinates oldMoonHorizontalCoordinates = moonHorizontalCoordinates;
		moonHorizontalCoordinates = newMoonHorizontalCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES, oldMoonHorizontalCoordinates, moonHorizontalCoordinates));
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getMoonAngularDiameter()
  {
		// Find the distance between the moon and the origin.
		TransformNode transform = (TransformNode) getMoon().getParent();		
		Vector3d vector = new Vector3d();
		transform.asMatrix4d().get(vector);		
		double distance = vector.length();
				
		// Computes the angular diameter.
		double angularDiameter = Math.atan(getMoon().getRadius() / distance) * 2;				
		return angularDiameter;
  }

  	@Override
	public SkyNode getSkyNode() 
  	{
	  	if(skyNode == null || !(skyNode instanceof EarthSkyNode))
	  	{	  		
	  		skyNode = SymphonyEnvironmentFactory.eINSTANCE.createEarthSkyNode();
	  		EnvironmentFacade.INSTANCE.initializeEarthSkyNode(this, (EarthSkyNode) skyNode);							
	  	}
	  	
	  	return getSkyNodeGen();
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
			case SymphonyEnvironmentPackage.EARTH_SKY__MOON:
				if (resolve) return getMoon();
				return basicGetMoon();
			case SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES:
				if (resolve) return getMoonHorizontalCoordinates();
				return basicGetMoonHorizontalCoordinates();
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
			case SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES:
				setMoonHorizontalCoordinates((HorizontalCoordinates)newValue);
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
			case SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES:
				setMoonHorizontalCoordinates((HorizontalCoordinates)null);
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
			case SymphonyEnvironmentPackage.EARTH_SKY__MOON:
				return moon != null;
			case SymphonyEnvironmentPackage.EARTH_SKY__MOON_HORIZONTAL_COORDINATES:
				return moonHorizontalCoordinates != null;
		}
		return super.eIsSet(featureID);
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
			case SymphonyEnvironmentPackage.EARTH_SKY___GET_MOON_ANGULAR_DIAMETER:
				return getMoonAngularDiameter();
		}
		return super.eInvoke(operationID, arguments);
	}

  	@Override
	public void setTime(Date newTime) 
  	{
	  	super.setTime(newTime);	 
	  	
	  	if(getSurfaceWorksite() != null)
	  	{
	  		if(newTime != null)
	  		{
	  			updateSky(newTime.getTime());
	  		}
	  		else
	  		{
	  			updateSky(new Date().getTime());
	  		}	  		
	  	}
	}
  
	private void updateSky(long newTime)
	{
		try
		{
			Date newDate = new Date(newTime);
			
			// Gets the Geographical coordinates.
			EarthSurfaceWorksite worksite = (EarthSurfaceWorksite) getSurfaceWorksite();
			double observerLongitude = worksite.getGeographicalCoordinates().getLongitude(); 
			double observerLatitude  = worksite.getGeographicalCoordinates().getLatitude();
			
			
			// Sun Position Update			
			// Computes the new Sun position.
			HorizontalCoordinates sunHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(newDate, observerLongitude, observerLatitude);			
			setSunHorizontalCoordinates(sunHorizontalCoordinates);
	
			// Moon Position Update			
			// Computes the new Moon position.
			HorizontalCoordinates moonHorizontalCoordinates = AstronomyUtils.INSTANCE.getHorizontalMoonPosition(newDate, observerLongitude, observerLatitude);				
			setMoonHorizontalCoordinates(moonHorizontalCoordinates);
		}
		catch(Exception e)
		{	
			e.printStackTrace();
			
			Logger.INSTANCE.log(Activator.ID, this, "Error occured during Sky Update !", EventSeverity.ERROR,e);					
		}
	}
	
	private Adapter getAdapter()
	{
		if(adapter == null)
		{
			adapter = new AdapterImpl()
			{
				public void notifyChanged(Notification msg) 
				{				
					try
					{
						// Note: Time changes on the Worksite is handled by the Sky class.
						
						if(msg.getNotifier() instanceof EarthSky)
						{	
							int featureId = msg.getFeatureID(EarthSky.class);
							
							switch (featureId) 
							{
								// Surface Worksite has changed.
								case SymphonyEnvironmentPackage.EARTH_SKY__SURFACE_WORKSITE:
								{
									// Unregister from previous Worksite if applicable.
									if(msg.getOldValue() instanceof EarthSurfaceWorksite)
									{
										EarthSurfaceWorksite oldWorksite = (EarthSurfaceWorksite) msg.getOldValue();
										oldWorksite.eAdapters().remove(getAdapter());
										
										if(oldWorksite.getGeographicalCoordinates() != null)
										{
											oldWorksite.getGeographicalCoordinates().eAdapters().remove(getAdapter());
										}
									}
									
									// Register to new Worksite if applicable.
									if(msg.getNewValue() instanceof EarthSurfaceWorksite)
									{
										EarthSurfaceWorksite newWorksite = (EarthSurfaceWorksite) msg.getNewValue();
										newWorksite.eAdapters().add(getAdapter());
										
										if(newWorksite.getGeographicalCoordinates() != null)
										{
											newWorksite.getGeographicalCoordinates().eAdapters().add(getAdapter());
											
											// Forces time updates Sun and Moon Position
											long time = new Date().getTime();
											if(getTime() != null) time = getTime().getTime() + 1;
											updateSky(time);
										}
									}
								}
								break;

								default:
								break;
							}							
						}						
						else if(msg.getNotifier() instanceof EarthSurfaceWorksite)
						{
							int featureId = msg.getFeatureID(EarthSurfaceWorksite.class);
							
							switch(featureId)
							{
								// Geographical Coordinates of the Surface Worksite have changed.
								case SymphonyEnvironmentPackage.EARTH_SURFACE_WORKSITE__GEOGRAPHICAL_COORDINATES:
								{
									// Unregister from previous GeographicCoordinates if applicable.
									if(msg.getOldValue() instanceof GeographicCoordinates)
									{
										GeographicCoordinates oldCoordinates = (GeographicCoordinates) msg.getOldValue();
										oldCoordinates.eAdapters().remove(getAdapter());
									}
									
									// Register to new GeographicCoordinates if applicable.
									if(msg.getNewValue() instanceof GeographicCoordinates)
									{
										GeographicCoordinates newCoordinates = (GeographicCoordinates) msg.getNewValue();
										newCoordinates.eAdapters().add(getAdapter());
										
										// Forces time updates Sun and Moon Position
										long time = new Date().getTime();
										if(getTime() != null) time = getTime().getTime() + 1;
										updateSky(time);
									}		
								}
								break;																
							}
							
						}		
						else if(msg.getNotifier() instanceof GeographicCoordinates)
						{					
							// Geographical Coordinates have changed.
							
							// Forces time updates Sun and Moon Position
							long time = new Date().getTime();
							if(getTime() != null)
							{	
								time = getTime().getTime() + 1;
							}
							updateSky(time);									
						}
					}
					catch(Throwable t)
					{
						t.printStackTrace();
						
						Logger.INSTANCE.log(Activator.ID, this, "Error occured during worksite coordinates update !", EventSeverity.ERROR,t);	
					}
				}
			};
		}
		
		return adapter;
	}
} //EarthSkyImpl
