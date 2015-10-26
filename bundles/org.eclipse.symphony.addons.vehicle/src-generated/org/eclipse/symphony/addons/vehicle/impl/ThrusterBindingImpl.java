/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.addons.vehicle.SymphonyToolsVehiclePackage;
import org.eclipse.symphony.addons.vehicle.Thruster;
import org.eclipse.symphony.addons.vehicle.ThrusterBinding;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.FeatureNodeAdapter;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.impl.AbstractTopologyBindingImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thruster Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.vehicle.impl.ThrusterBindingImpl#getThruster <em>Thruster</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ThrusterBindingImpl extends AbstractTopologyBindingImpl implements ThrusterBinding
{
  /**
	 * The cached value of the '{@link #getThruster() <em>Thruster</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getThruster()
	 * @generated
	 * @ordered
	 */
  protected Thruster thruster;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ThrusterBindingImpl()
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
		return SymphonyToolsVehiclePackage.Literals.THRUSTER_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Thruster getThruster()
  {
		if (thruster != null && thruster.eIsProxy()) {
			InternalEObject oldThruster = (InternalEObject)thruster;
			thruster = (Thruster)eResolveProxy(oldThruster);
			if (thruster != oldThruster) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyToolsVehiclePackage.THRUSTER_BINDING__THRUSTER, oldThruster, thruster));
			}
		}
		return thruster;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Thruster basicGetThruster()
  {
		return thruster;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setThruster(Thruster newThruster)
  {
		Thruster oldThruster = thruster;
		thruster = newThruster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyToolsVehiclePackage.THRUSTER_BINDING__THRUSTER, oldThruster, thruster));
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
			case SymphonyToolsVehiclePackage.THRUSTER_BINDING__THRUSTER:
				if (resolve) return getThruster();
				return basicGetThruster();
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
			case SymphonyToolsVehiclePackage.THRUSTER_BINDING__THRUSTER:
				setThruster((Thruster)newValue);
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
			case SymphonyToolsVehiclePackage.THRUSTER_BINDING__THRUSTER:
				setThruster((Thruster)null);
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
			case SymphonyToolsVehiclePackage.THRUSTER_BINDING__THRUSTER:
				return thruster != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {
	  Thruster thrusterCopy = (Thruster) originalToCopyNodeMap.get(this.getThruster());
	  ThrusterBinding thrusterBindingCopy = EcoreUtil.copy(this);
	  thrusterBindingCopy.setThruster(thrusterCopy);
	  return thrusterBindingCopy;
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
						if(notification.getOldValue() instanceof Thruster)
					  	{
							Thruster oldFOV = (Thruster) notification.getOldValue();
					  		oldFOV.eAdapters().remove(getAdapter());					  							  		
					  	}
					  					  												
						if(notification.getNewValue() instanceof Thruster)
						{
							Thruster newFOV = (Thruster) notification.getNewValue();
							newFOV.eAdapters().add(getAdapter());							
							valueChanged(newFOV);
						}						
				  }				
				  else if(notification.getNotifier() instanceof ThrusterBinding)
				  {
					  if(notification.getOldValue() instanceof Thruster)
					  {
						  Thruster oldThruster = (Thruster) notification.getOldValue();
						  oldThruster.eAdapters().remove(getAdapter());					  		
					  }
					  					  												
					  if(notification.getNewValue() instanceof Thruster)
					  {
						  Thruster newThruster = (Thruster) notification.getNewValue();
						  newThruster.eAdapters().add(getAdapter());														
						  valueChanged(newThruster);
					  }	
				  }
				  else if(notification.getNotifier() instanceof Thruster)
				  {
					  int featureId = notification.getFeatureID(Thruster.class);
					  switch (featureId) 
					  {
					  	case SymphonyToolsVehiclePackage.THRUSTER__PLUME_ANGLE:
					  			getThruster().setPlumeAngle(notification.getNewDoubleValue());						
						break;
						
					  	case SymphonyToolsVehiclePackage.THRUSTER__CURRENT_THRUST:
					  		getThruster().setCurrentThrust(notification.getNewDoubleValue());
					  	break;
					  	
					  	case SymphonyToolsVehiclePackage.THRUSTER__MINIMUM_THRUST:
					  		getThruster().setMinimumThrust(notification.getNewDoubleValue());
					  	break;

					  	case SymphonyToolsVehiclePackage.THRUSTER__MAXIMUM_THRUST:
					  		getThruster().setMaximumThrust(notification.getNewDoubleValue());
					  	break;

					  	case SymphonyToolsVehiclePackage.THRUSTER__THRUST_LEVEL:
					  		getThruster().setThrustLevel(notification.getNewDoubleValue());
					  	break;
					  	
					  	default:
						break;
					}
							
				  }
			  }
		  };
	  }
	  
	  return adapter;
  }

  @Override
  protected void valueChanged(Object newValue) 
  {
	  
	  if(newValue instanceof Thruster)
	  {
		  Thruster sourceThruster = (Thruster) newValue;
		  
		  getThruster().setCurrentThrust(sourceThruster.getCurrentThrust());
		  getThruster().setMaximumThrust(sourceThruster.getMaximumThrust());
		  getThruster().setMinimumThrust(sourceThruster.getMinimumThrust());
		  getThruster().setPlumeAngle(sourceThruster.getPlumeAngle());
		  getThruster().setThrustLevel(sourceThruster.getThrustLevel());
	  }	  	
  }
} //ThrusterBindingImpl
