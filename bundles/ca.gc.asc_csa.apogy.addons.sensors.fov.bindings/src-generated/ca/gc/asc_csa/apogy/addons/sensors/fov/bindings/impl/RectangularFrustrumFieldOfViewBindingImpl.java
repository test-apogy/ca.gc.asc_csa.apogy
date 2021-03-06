package ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.addons.sensors.fov.DistanceRange;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.RectangularFrustrumFieldOfViewBinding;
import ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.ApogyAddonsSensorsFOVBindingsPackage;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.impl.AbstractTopologyBindingImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rectangular Frustrum Field Of View Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.bindings.impl.RectangularFrustrumFieldOfViewBindingImpl#getFov <em>Fov</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RectangularFrustrumFieldOfViewBindingImpl extends AbstractTopologyBindingImpl implements RectangularFrustrumFieldOfViewBinding
{
  /**
	 * The cached value of the '{@link #getFov() <em>Fov</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFov()
	 * @generated
	 * @ordered
	 */
  protected RectangularFrustrumFieldOfView fov;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RectangularFrustrumFieldOfViewBindingImpl()
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
		return ApogyAddonsSensorsFOVBindingsPackage.Literals.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularFrustrumFieldOfView getFov()
  {
		if (fov != null && fov.eIsProxy()) {
			InternalEObject oldFov = (InternalEObject)fov;
			fov = (RectangularFrustrumFieldOfView)eResolveProxy(oldFov);
			if (fov != oldFov) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV, oldFov, fov));
			}
		}
		return fov;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RectangularFrustrumFieldOfView basicGetFov()
  {
		return fov;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setFov(RectangularFrustrumFieldOfView newFov)
  {
		RectangularFrustrumFieldOfView oldFov = fov;
		fov = newFov;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV, oldFov, fov));
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
			case ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV:
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
			case ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV:
				setFov((RectangularFrustrumFieldOfView)newValue);
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
			case ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV:
				setFov((RectangularFrustrumFieldOfView)null);
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
			case ApogyAddonsSensorsFOVBindingsPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW_BINDING__FOV:
				return fov != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {
	  RectangularFrustrumFieldOfViewBinding fovBindingCopy = EcoreUtil.copy(this);
	  fovBindingCopy.setFov((RectangularFrustrumFieldOfView) originalToCopyNodeMap.get(this.getFov()) );	  
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
				  if(notification.getFeatureID(FeatureNodeAdapter.class) == ApogyCommonEMFPackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE)
				  {		
						if(notification.getOldValue() instanceof RectangularFrustrumFieldOfView)
					  	{
							RectangularFrustrumFieldOfView oldFOV = (RectangularFrustrumFieldOfView) notification.getOldValue();
					  		oldFOV.eAdapters().remove(getAdapter());
					  		
					  		if(oldFOV.getRange() != null)
							{
					  			oldFOV.getRange().eAdapters().remove(getAdapter());
							}
					  	}
					  					  												
						if(notification.getNewValue() instanceof RectangularFrustrumFieldOfView)
						{
							RectangularFrustrumFieldOfView newFOV = (RectangularFrustrumFieldOfView) notification.getNewValue();
							newFOV.eAdapters().add(getAdapter());
							
							if(newFOV.getRange() != null)
							{
								newFOV.getRange().eAdapters().add(getAdapter());
							}
							
							valueChanged(newFOV);
						}						
				  }				
				  else if(notification.getNotifier() instanceof RectangularFrustrumFieldOfView)
				  {					  
					  if(notification.getFeatureID(RectangularFrustrumFieldOfView.class) == ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE)						  
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
							  
							  // Update Distance Range.
							  updateDistanceRange(newDistanceRange);
						  }						  						 
					  }
					  else if(notification.getFeatureID(RectangularFrustrumFieldOfView.class) == ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE)
					  {
						  updateHorizontalFieldOfViewAngle(notification.getNewDoubleValue());
					  }
					  else if(notification.getFeatureID(RectangularFrustrumFieldOfView.class) == ApogyAddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE)
					  {
						  updateVerticalFieldOfViewAngle(notification.getNewDoubleValue());
					  }
				  }
				  else if(notification.getNotifier() instanceof DistanceRange)
				  {
					  DistanceRange newDistanceRange = (DistanceRange) notification.getNotifier();
					  
					  // Updates.
					  updateDistanceRange(newDistanceRange);
				  }					  				  			  		
			  }
		  };
	  }
	  
	  return adapter;
  } 

  private void updateHorizontalFieldOfViewAngle(double hfov)
  {
	  getFov().setHorizontalFieldOfViewAngle(hfov);
  }
  
  private void updateVerticalFieldOfViewAngle(double vfov)
  {
	  getFov().setVerticalFieldOfViewAngle(vfov);
  }
  
  private void updateDistanceRange(DistanceRange newDistanceRange)
  {
	  getFov().getRange().setMinimumDistance(newDistanceRange.getMinimumDistance());
	  getFov().getRange().setMaximumDistance(newDistanceRange.getMaximumDistance());
  }
  
  @Override
  protected void valueChanged(Object newValue) 
  {
	  if(newValue instanceof RectangularFrustrumFieldOfView)
	  {
		  // Just update everything.		  		  
		  RectangularFrustrumFieldOfView sourceFOV = (RectangularFrustrumFieldOfView) newValue;
		  
		  getFov().setDescription(sourceFOV.getDescription());
		  
		  updateHorizontalFieldOfViewAngle(sourceFOV.getHorizontalFieldOfViewAngle());
		  updateVerticalFieldOfViewAngle(sourceFOV.getVerticalFieldOfViewAngle());
		  		 
		  if(sourceFOV.getRange() != null)
		  {
			  updateDistanceRange(sourceFOV.getRange());
		  }
		  else
		  {
			  getFov().setRange(null);
		  }
	  }
  }

} //RectangularFrustrumFieldOfViewBindingImpl
