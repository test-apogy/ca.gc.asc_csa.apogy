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
import org.eclipse.symphony.addons.sensors.fov.ConicalFieldOfView;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.FOVFacade;
import org.eclipse.symphony.addons.sensors.fov.bindings.ConicalFieldOfViewBinding;
import org.eclipse.symphony.addons.sensors.fov.bindings.Symphony__AddonsSensorsFOVBindingsPackage;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conical Field Of View Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.bindings.impl.ConicalFieldOfViewBindingImpl#getFov <em>Fov</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConicalFieldOfViewBindingImpl extends AbstractTopologyBindingImpl implements ConicalFieldOfViewBinding
{
  /**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
  protected ConicalFieldOfView fov;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ConicalFieldOfViewBindingImpl()
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
		return Symphony__AddonsSensorsFOVBindingsPackage.Literals.CONICAL_FIELD_OF_VIEW_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConicalFieldOfView getFov()
  {
		if (fov != null && fov.eIsProxy()) {
			InternalEObject oldFov = (InternalEObject)fov;
			fov = (ConicalFieldOfView)eResolveProxy(oldFov);
			if (fov != oldFov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING__FOV, oldFov, fov));
			}
		}
		return fov;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ConicalFieldOfView basicGetFov()
  {
		return fov;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFov(ConicalFieldOfView newFov)
  {
		ConicalFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING__FOV, oldFov, fov));
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING__FOV:
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING__FOV:
				setFov((ConicalFieldOfView)newValue);
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING__FOV:
				setFov((ConicalFieldOfView)null);
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
			case Symphony__AddonsSensorsFOVBindingsPackage.CONICAL_FIELD_OF_VIEW_BINDING__FOV:
				return fov != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {
	  ConicalFieldOfViewBinding fovBindingCopy = EcoreUtil.copy(this);	  
	  fovBindingCopy.setFov((ConicalFieldOfView) originalToCopyNodeMap.get(this.getFov()) );	  
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
						if(notification.getOldValue() instanceof ConicalFieldOfView)
					  	{
							ConicalFieldOfView oldFOV = (ConicalFieldOfView) notification.getOldValue();
					  		oldFOV.eAdapters().remove(getAdapter());
					  	}
					  					  
						valueChanged(notification.getNewValue());
						
						if(notification.getNewValue() instanceof ConicalFieldOfView)
						{
							ConicalFieldOfView newFOV = (ConicalFieldOfView) notification.getNewValue();
							newFOV.eAdapters().add(getAdapter());
						}						
				  }				
				  else if(notification.getNotifier() instanceof ConicalFieldOfView)
				  {					  
					  valueChanged(notification.getNotifier());
				  }
			  }
			};
	  }
	  
	  return adapter;
  }  

  @Override
  protected void valueChanged(Object newValue) 
  {	
	  if(newValue instanceof ConicalFieldOfView)
	  {
		  // Just update everything.		  		  
		  ConicalFieldOfView sourceFOV = (ConicalFieldOfView) newValue;
		  
		  getFov().setDescription(sourceFOV.getDescription());
		   
		  // Updates Range.
		  if(sourceFOV.getRange() != null)
		  {
			  DistanceRange newRange = FOVFacade.INSTANCE.createDistanceRange(sourceFOV.getRange());
			  getFov().setRange(newRange);
		  }
		  else
		  {
			  getFov().setRange(null);
		  }
		  
		  // Updates FOV Angle.
		  getFov().setFieldOfViewAngle(sourceFOV.getFieldOfViewAngle());
	  }
  }

} //ConicalFieldOfViewBindingImpl
