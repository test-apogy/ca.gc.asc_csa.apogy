/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.fov.bindings.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.addons.sensors.fov.AngularSpan;
import org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.fov.bindings.CircularSectorFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsPackage;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circular Sector Field Of View Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.bindings.impl.CircularSectorFieldOfViewBindingImpl#getFov <em>Fov</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircularSectorFieldOfViewBindingImpl extends AbstractTopologyBindingImpl implements CircularSectorFieldOfViewBinding
{  	
  /**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
  protected CircularSectorFieldOfView fov;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CircularSectorFieldOfViewBindingImpl()
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
		return Symphony__AddonsSensorsFOVBindingsPackage.Literals.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CircularSectorFieldOfView getFov()
  {
		if (fov != null && fov.eIsProxy()) {
			InternalEObject oldFov = (InternalEObject)fov;
			fov = (CircularSectorFieldOfView)eResolveProxy(oldFov);
			if (fov != oldFov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV, oldFov, fov));
			}
		}
		return fov;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public CircularSectorFieldOfView basicGetFov()
  {
		return fov;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFov(CircularSectorFieldOfView newFov)
  {
		CircularSectorFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV, oldFov, fov));
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV:
				if (resolve) return getFov();
				return basicGetFov();
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV:
				setFov((CircularSectorFieldOfView)newValue);
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV:
				setFov((CircularSectorFieldOfView)null);
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW_BINDING__FOV:
				return fov != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {
	  CircularSectorFieldOfViewBinding fovBindingCopy = EcoreUtil.copy(this);	  	  	 
	  fovBindingCopy.setFov((CircularSectorFieldOfView) originalToCopyNodeMap.get(this.getFov()));	  
	  return fovBindingCopy;
  }
  
  @Override
  protected Adapter getAdapter() 
  {
	  if(adapter == null)
	  {
		  adapter = new AdapterImpl()
		  {				
			  @Override
			  public void notifyChanged(Notification notification) 
			  {
				  if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE)
				  {		
						if(notification.getOldValue() instanceof CircularSectorFieldOfView)
					  	{
							CircularSectorFieldOfView oldFOV = (CircularSectorFieldOfView) notification.getOldValue();
					  		oldFOV.eAdapters().remove(getAdapter());
					  		
					  		if(oldFOV.getAngularSpan() != null)
							{
					  			oldFOV.getAngularSpan().eAdapters().remove(getAdapter());
							}
							
							if(oldFOV.getRange() != null)
							{
								oldFOV.getRange().eAdapters().remove(getAdapter());
							}
					  	}
					  					  
						valueChanged(notification.getNewValue());
						
						if(notification.getNewValue() instanceof CircularSectorFieldOfView)
						{
							CircularSectorFieldOfView newFOV = (CircularSectorFieldOfView) notification.getNewValue();
							newFOV.eAdapters().add(getAdapter());
							
							if(newFOV.getAngularSpan() != null)
							{
								newFOV.getAngularSpan().eAdapters().add(getAdapter());
							}
							
							if(newFOV.getRange() != null)
							{
								newFOV.getRange().eAdapters().add(getAdapter());
							}
						}						
				  }				
				  else if(notification.getNotifier() instanceof CircularSectorFieldOfView)
				  {					  
					  if(notification.getFeatureID(CircularSectorFieldOfView.class) == Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__RANGE)
					  {
						  if(notification.getOldValue() instanceof DistanceRange)
						  {
							  DistanceRange oldDistanceRange = (DistanceRange) notification.getOldValue();
							  oldDistanceRange.eAdapters().remove(getAdapter());
						  }
						  
						  if(notification.getNewValue() instanceof DistanceRange)
						  {
							  DistanceRange newDistanceRange = (DistanceRange) notification.getNewValue();
							  newDistanceRange.eAdapters().add(getAdapter());
							  updateDistanceRange(newDistanceRange);
						  }						  						 
					  }
					  else if(notification.getFeatureID(CircularSectorFieldOfView.class) == Symphony__AddonsSensorsFOVPackage.CIRCULAR_SECTOR_FIELD_OF_VIEW__ANGULAR_SPAN)
					  {
						  if(notification.getOldValue() instanceof AngularSpan)
						  {
							  AngularSpan oldAngularSpan = (AngularSpan) notification.getOldValue();
							  oldAngularSpan.eAdapters().remove(getAdapter());
						  }
						  
						  if(notification.getNewValue() instanceof AngularSpan)
						  {
							  AngularSpan newAngularSpan = (AngularSpan) notification.getNewValue();
							  newAngularSpan.eAdapters().add(getAdapter());
							  updateAngularSpan(newAngularSpan);							  
						  }						  						  
					  }					  
				  }
				  else if(notification.getNotifier() instanceof DistanceRange)
				  {
					  DistanceRange distanceRange = (DistanceRange) notification.getNotifier();
					  
					  // Updates.
					  updateDistanceRange(distanceRange);			  					  
				  }
				  else if(notification.getNotifier() instanceof AngularSpan)
				  {
					  AngularSpan angularSpan = (AngularSpan) notification.getNotifier();
					  
					  // Updates.
					  updateAngularSpan(angularSpan);					  					 
				  }
			  }
			};
	  }
	  
	  return adapter;
  }
  
  private void updateDistanceRange(DistanceRange newDistanceRange)
  {
	  getFov().getRange().setMinimumDistance(newDistanceRange.getMinimumDistance());
	  getFov().getRange().setMaximumDistance(newDistanceRange.getMaximumDistance());
  }
  
  private void updateAngularSpan(AngularSpan newAngularSpan)
  {	  
	  getFov().getAngularSpan().setMinimumAngle(newAngularSpan.getMinimumAngle());
	  getFov().getAngularSpan().setMaximumAngle(newAngularSpan.getMaximumAngle());
  }
  
  @Override
  protected void valueChanged(Object newValue) 
  {
	  if(newValue instanceof CircularSectorFieldOfView)
	  {
		  // Just update everything.
		  CircularSectorFieldOfView sourceFOV = (CircularSectorFieldOfView) newValue;
		  
		  getFov().setDescription(sourceFOV.getDescription());
		  
		  // Updates Range.
		  if(sourceFOV.getRange() != null)
		  {
			  updateDistanceRange(sourceFOV.getRange());			  
		  }
		  else
		  {
			  getFov().setRange(null);
		  }
		  
		  // Updates AngularSpan
		  if(sourceFOV.getAngularSpan() != null)
		  {
			  updateAngularSpan(sourceFOV.getAngularSpan());			 
		  }
		  else
		  {
			  getFov().setAngularSpan(null);
		  }		  		 
	  }	
  }

} //CircularSectorFieldOfViewBindingImpl
