/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.symphony.environment.MapsList;
import ca.gc.asc_csa.symphony.environment.Sky;
import ca.gc.asc_csa.symphony.environment.SurfaceWorksite;
import ca.gc.asc_csa.symphony.environment.SurfaceWorksiteNode;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SurfaceWorksiteImpl#getSky <em>Sky</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.impl.SurfaceWorksiteImpl#getMapsList <em>Maps List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SurfaceWorksiteImpl extends WorksiteImpl implements SurfaceWorksite
{
  /**
	 * The cached value of the '{@link #getSky() <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getSky()
	 * @generated
	 * @ordered
	 */
  protected Sky sky;

  /**
	 * The cached value of the '{@link #getMapsList() <em>Maps List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapsList()
	 * @generated
	 * @ordered
	 */
  protected MapsList mapsList;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SurfaceWorksiteImpl()
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
		return SymphonyEnvironmentPackage.Literals.SURFACE_WORKSITE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky getSky()
  {
		return sky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetSky(Sky newSky, NotificationChain msgs)
  {
		Sky oldSky = sky;
		sky = newSky;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY, oldSky, newSky);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    
  	public WorksiteNode getWorksiteNode() 
	{
  		if(!(super.getWorksiteNode() instanceof SurfaceWorksiteNode))
  		{
  			worksiteNode = SymphonyEnvironmentFactory.eINSTANCE.createSurfaceWorksiteNode();
  			worksiteNode.setWorksite(this);  			
  		}
  		
  		return worksiteNode;
	}
  
 
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setSky(Sky newSky)
  {
	  // Removes topology from previous Sky if applicable.
	  if(this.getSky() != null)
	  {
		  if(this.getWorksiteNode() instanceof WorksiteNode)
		  {
			  WorksiteNode worksiteNode = (WorksiteNode) this.getWorksiteNode();
			  worksiteNode.getChildren().remove(this.getSky().getSkyNode());
		  } 
	  }
	  
	  // Updates sky
	  setSkyGen(newSky);
	  
	  // Adds topology from new Sky Sky if applicable.
	  if(newSky != null) 
	  {		  
		  if(this.getWorksiteNode() instanceof WorksiteNode)
		  {
			  System.out.println("SurfaceWorksiteImpl.setSky() !!!!!!!!!!!!!!!!!!!");
			  
			  WorksiteNode worksiteNode = (WorksiteNode) this.getWorksiteNode();
			  worksiteNode.getChildren().add(newSky.getSkyNode());
		  }
	  }	  	  
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSkyGen(Sky newSky)
  {
		if (newSky != sky) {
			NotificationChain msgs = null;
			if (sky != null)
				msgs = ((InternalEObject)sky).eInverseRemove(this, SymphonyEnvironmentPackage.SKY__SURFACE_WORKSITE, Sky.class, msgs);
			if (newSky != null)
				msgs = ((InternalEObject)newSky).eInverseAdd(this, SymphonyEnvironmentPackage.SKY__SURFACE_WORKSITE, Sky.class, msgs);
			msgs = basicSetSky(newSky, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY, newSky, newSky));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public MapsList getMapsList()
  {
	  if(mapsList == null)
	  {
		  mapsList = SymphonyEnvironmentFactory.eINSTANCE.createMapsList();
		  setMapsList(mapsList);
	  }
	  return mapsList;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMapsList(MapsList newMapsList, NotificationChain msgs)
  {
		MapsList oldMapsList = mapsList;
		mapsList = newMapsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, oldMapsList, newMapsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMapsList(MapsList newMapsList)
  {
		if (newMapsList != mapsList) {
			NotificationChain msgs = null;
			if (mapsList != null)
				msgs = ((InternalEObject)mapsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, null, msgs);
			if (newMapsList != null)
				msgs = ((InternalEObject)newMapsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, null, msgs);
			msgs = basicSetMapsList(newMapsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, newMapsList, newMapsList));
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
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY:
				if (sky != null)
					msgs = ((InternalEObject)sky).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY, null, msgs);
				return basicSetSky((Sky)otherEnd, msgs);
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
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY:
				return basicSetSky(null, msgs);
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				return basicSetMapsList(null, msgs);
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
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY:
				return getSky();
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				return getMapsList();
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
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY:
				setSky((Sky)newValue);
				return;
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				setMapsList((MapsList)newValue);
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
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY:
				setSky((Sky)null);
				return;
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				setMapsList((MapsList)null);
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
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__SKY:
				return sky != null;
			case SymphonyEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				return mapsList != null;
		}
		return super.eIsSet(featureID);
	}

} //SurfaceWorksiteImpl
