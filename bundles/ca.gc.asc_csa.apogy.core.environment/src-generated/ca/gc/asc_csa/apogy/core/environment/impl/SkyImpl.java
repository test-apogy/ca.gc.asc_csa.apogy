/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.core.AbstractWorksite;
import org.eclipse.symphony.core.Symphony__CorePackage;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.HorizontalCoordinates;
import org.eclipse.symphony.core.environment.Sky;
import org.eclipse.symphony.core.environment.SkyNode;
import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.SurfaceWorksite;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyImpl#getSurfaceWorksite <em>Surface Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyImpl#getSkyNode <em>Sky Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyImpl#getSun <em>Sun</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyImpl#getSunHorizontalCoordinates <em>Sun Horizontal Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.SkyImpl#getStarField <em>Star Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkyImpl extends MinimalEObjectImpl.Container implements Sky
{	
	protected Adapter worksiteAdapter;
	
  /**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
  protected static final Date TIME_EDEFAULT = null;
  
  /**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
  protected Date time = TIME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getSkyNode() <em>Sky Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSkyNode()
	 * @generated
	 * @ordered
	 */
  protected SkyNode skyNode;
  /**
	 * The cached value of the '{@link #getSun() <em>Sun</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSun()
	 * @generated
	 * @ordered
	 */
  protected Sun sun;
  /**
	 * The cached value of the '{@link #getSunHorizontalCoordinates() <em>Sun Horizontal Coordinates</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSunHorizontalCoordinates()
	 * @generated
	 * @ordered
	 */
  protected HorizontalCoordinates sunHorizontalCoordinates;

  /**
	 * The cached value of the '{@link #getStarField() <em>Star Field</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStarField()
	 * @generated
	 * @ordered
	 */
  protected StarField starField;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected SkyImpl()
  {
		super();
		
		eAdapters().add(getWorksiteAdapter());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return Symphony__CoreEnvironmentPackage.Literals.SKY;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getTime()
  {
		return time;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTime(Date newTime)
  {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.SKY__TIME, oldTime, time));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SurfaceWorksite getSurfaceWorksite()
  {
		if (eContainerFeatureID() != Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE) return null;
		return (SurfaceWorksite)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SurfaceWorksite basicGetSurfaceWorksite()
  {
		if (eContainerFeatureID() != Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE) return null;
		return (SurfaceWorksite)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  public NotificationChain basicSetSurfaceWorksite(SurfaceWorksite newSurfaceWorksite, NotificationChain msgs)
  {
	  if(basicGetSurfaceWorksite() != null)
	  {
		  // Un-Register Listener from previous to the worksite.
		  basicGetSurfaceWorksite().eAdapters().remove(getWorksiteAdapter());		 
	  }
	  
	  if(newSurfaceWorksite != null)
	  {
		  // Register Listener for changes to the worksite.
		  newSurfaceWorksite.eAdapters().add(getWorksiteAdapter());		  		 
	  }
		  
	  return basicSetSurfaceWorksiteGen(newSurfaceWorksite, msgs);
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSurfaceWorksiteGen(SurfaceWorksite newSurfaceWorksite, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newSurfaceWorksite, Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSurfaceWorksite(SurfaceWorksite newSurfaceWorksite)
  {
		if (newSurfaceWorksite != eInternalContainer() || (eContainerFeatureID() != Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE && newSurfaceWorksite != null)) {
			if (EcoreUtil.isAncestor(this, newSurfaceWorksite))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSurfaceWorksite != null)
				msgs = ((InternalEObject)newSurfaceWorksite).eInverseAdd(this, Symphony__CoreEnvironmentPackage.SURFACE_WORKSITE__SKY, SurfaceWorksite.class, msgs);
			msgs = basicSetSurfaceWorksite(newSurfaceWorksite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE, newSurfaceWorksite, newSurfaceWorksite));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SkyNode getSkyNode()
  {
	  if(getSkyNodeGen() == null)
	  {
		  	skyNode = Symphony__CoreEnvironmentFactory.eINSTANCE.createSkyNode();			
			Symphony__CoreEnvironmentFacade.INSTANCE.initializeSkyNode(this, skyNode);
	  }
	  
	  return getSkyNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SkyNode getSkyNodeGen()
  {
		if (skyNode != null && skyNode.eIsProxy()) {
			InternalEObject oldSkyNode = (InternalEObject)skyNode;
			skyNode = (SkyNode)eResolveProxy(oldSkyNode);
			if (skyNode != oldSkyNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreEnvironmentPackage.SKY__SKY_NODE, oldSkyNode, skyNode));
			}
		}
		return skyNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SkyNode basicGetSkyNode()
  {
		return skyNode;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Sun getSun()
  {
		// Explores children to find the Sun.
		if(basicGetSun() == null)
		{
			sun = findSunInTopology();						
		}
		return sun;
  }

	/**
	 * Searches the topology to find the Sun.
	 * @return The Sun, null if not found. 
	 */
	private Sun findSunInTopology()
	{
		Sun sunFound = null;
		
		EList<Node> children = getSkyNode().getChildren();
		Iterator<Node> it = children.iterator();
		while(it.hasNext() && (sunFound == null))
		{
			Node node = it.next();
			
			if(node instanceof TransformNode)
			{
				TransformNode t = (TransformNode) node;
				
				EList<Node> tChildren = t.getChildren();
				Iterator<Node> tIt = tChildren.iterator();
				while(tIt.hasNext() && (sunFound == null))
				{
					Node n = tIt.next();
					
					if(n instanceof Sun)
					{
						sunFound = (Sun) n;
					}
				}				
			}
		}
		
		return sunFound;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sun basicGetSun()
  {
		return sun;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public HorizontalCoordinates getSunHorizontalCoordinates()
  {
		if(getSunHorizontalCoordinatesGen() == null)
		{
			HorizontalCoordinates newHorizontalCoordinates = Symphony__CoreEnvironmentFactory.eINSTANCE.createHorizontalCoordinates();
			setSunHorizontalCoordinates(newHorizontalCoordinates);
		}
		
		return sunHorizontalCoordinates;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HorizontalCoordinates getSunHorizontalCoordinatesGen()
  {
		if (sunHorizontalCoordinates != null && sunHorizontalCoordinates.eIsProxy()) {
			InternalEObject oldSunHorizontalCoordinates = (InternalEObject)sunHorizontalCoordinates;
			sunHorizontalCoordinates = (HorizontalCoordinates)eResolveProxy(oldSunHorizontalCoordinates);
			if (sunHorizontalCoordinates != oldSunHorizontalCoordinates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES, oldSunHorizontalCoordinates, sunHorizontalCoordinates));
			}
		}
		return sunHorizontalCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public HorizontalCoordinates basicGetSunHorizontalCoordinates()
  {
		return sunHorizontalCoordinates;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSunHorizontalCoordinates(HorizontalCoordinates newSunHorizontalCoordinates)
  {
		HorizontalCoordinates oldSunHorizontalCoordinates = sunHorizontalCoordinates;
		sunHorizontalCoordinates = newSunHorizontalCoordinates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES, oldSunHorizontalCoordinates, sunHorizontalCoordinates));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public StarField getStarField()
  {
		// Explores children to find the StarField.
		if(basicGetStarField() == null)
		{
			starField = findStarFieldInTopology();						
		}
		
		return starField;
  }

	/**
	 * Searches the topology to find the StarField.
	 * @return The StarField, null if not found. 
	 */
	private StarField findStarFieldInTopology()
	{
		StarField foundStarField = null;
		
		EList<Node> children = getSkyNode().getChildren();
		Iterator<Node> it = children.iterator();
		while(it.hasNext() && (foundStarField == null))
		{
			Node node = it.next();
			
			if(node instanceof TransformNode)
			{
				TransformNode t = (TransformNode) node;
				
				EList<Node> tChildren = t.getChildren();
				Iterator<Node> tIt = tChildren.iterator();
				while(tIt.hasNext() && (foundStarField == null))
				{
					Node n = tIt.next();
					
					if(n instanceof StarField)
					{
						foundStarField = (StarField) n;
					}
				}				
			}
		}
		
		return foundStarField;
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StarField basicGetStarField()
  {
		return starField;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getSunAngularDiameter()
  {
		// TODO : Fix the problem with the distance calculation.
		
//		// Find the distance between the sun and the origin.
//		TransformNode transform = (TransformNode) getSun().getParent();		
//		Vector3d vector = new Vector3d();
//		transform.asMatrix4d().get(vector);		
//		double distance = vector.length();		
//		
//		// Computes the angular diameter.
//		double angularDiameter = Math.atan(getSun().getRadius() / distance) * 2;
		
		
		// Return the average angular size for now.
		double angularDiameter =  Math.toRadians(0.535833333);
		
		return angularDiameter;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSurfaceWorksite((SurfaceWorksite)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				return basicSetSurfaceWorksite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				return eInternalContainer().eInverseRemove(this, Symphony__CoreEnvironmentPackage.SURFACE_WORKSITE__SKY, SurfaceWorksite.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case Symphony__CoreEnvironmentPackage.SKY__TIME:
				return getTime();
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				if (resolve) return getSurfaceWorksite();
				return basicGetSurfaceWorksite();
			case Symphony__CoreEnvironmentPackage.SKY__SKY_NODE:
				if (resolve) return getSkyNode();
				return basicGetSkyNode();
			case Symphony__CoreEnvironmentPackage.SKY__SUN:
				if (resolve) return getSun();
				return basicGetSun();
			case Symphony__CoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES:
				if (resolve) return getSunHorizontalCoordinates();
				return basicGetSunHorizontalCoordinates();
			case Symphony__CoreEnvironmentPackage.SKY__STAR_FIELD:
				if (resolve) return getStarField();
				return basicGetStarField();
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
			case Symphony__CoreEnvironmentPackage.SKY__TIME:
				setTime((Date)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				setSurfaceWorksite((SurfaceWorksite)newValue);
				return;
			case Symphony__CoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES:
				setSunHorizontalCoordinates((HorizontalCoordinates)newValue);
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
			case Symphony__CoreEnvironmentPackage.SKY__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				setSurfaceWorksite((SurfaceWorksite)null);
				return;
			case Symphony__CoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES:
				setSunHorizontalCoordinates((HorizontalCoordinates)null);
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
			case Symphony__CoreEnvironmentPackage.SKY__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
				return basicGetSurfaceWorksite() != null;
			case Symphony__CoreEnvironmentPackage.SKY__SKY_NODE:
				return skyNode != null;
			case Symphony__CoreEnvironmentPackage.SKY__SUN:
				return sun != null;
			case Symphony__CoreEnvironmentPackage.SKY__SUN_HORIZONTAL_COORDINATES:
				return sunHorizontalCoordinates != null;
			case Symphony__CoreEnvironmentPackage.SKY__STAR_FIELD:
				return starField != null;
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
			case Symphony__CoreEnvironmentPackage.SKY___GET_SUN_ANGULAR_DIAMETER:
				return getSunAngularDiameter();
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}
  
  protected Adapter getWorksiteAdapter()
  {
	  if(worksiteAdapter == null)
	  {
		  worksiteAdapter = new AdapterImpl()
		  {
			  @Override
			  public void notifyChanged(Notification msg) 
			  {				 			
				  if(msg.getNotifier() instanceof AbstractWorksite)
				  {
					  int featureId = msg.getFeatureID(AbstractWorksite.class);
					  
					  // The Worksite time has changed, update the Sky time.
					  if(featureId == Symphony__CorePackage.ABSTRACT_WORKSITE__TIME)
					  {							
						  if(msg.getNewValue() instanceof Date)
						  {
							  Date newDate = (Date) msg.getNewValue(); 
							  setTime(newDate);
						  }
					  }
				  }
				  else if(msg.getNotifier() instanceof Sky)
				  {
					  int featureId = msg.getFeatureID(Sky.class);
					  
					  switch (featureId) 
					  {
					  	// The worksite has changed, unregister from previous, register to new and update.
					  	case Symphony__CoreEnvironmentPackage.SKY__SURFACE_WORKSITE:
					  	{
					  		
					  		if(msg.getOldValue() instanceof SurfaceWorksite)
					  		{
					  			SurfaceWorksite oldSurfaceWorksite = (SurfaceWorksite) msg.getOldValue();
					  			oldSurfaceWorksite.eAdapters().remove(getWorksiteAdapter());
					  		}
					  		
					  		if(msg.getNewValue() instanceof SurfaceWorksite)
					  		{
					  			SurfaceWorksite newSurfaceWorksite = (SurfaceWorksite) msg.getNewValue();
					  			newSurfaceWorksite.eAdapters().add(getWorksiteAdapter());
					  			
					  			// Updates time.
					  			setTime(newSurfaceWorksite.getTime());
					  		}
					  	}
						break;

					default:
						break;
					}
				  }
			  }
		  };			  
	  }
	  
	  return worksiteAdapter;
  }
} //SkyImpl
