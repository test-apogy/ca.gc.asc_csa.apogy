package ca.gc.asc_csa.apogy.core.programs.controllers.impl;
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

import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.EdgeType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller Edge Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerEdgeTriggerImpl#getEdgeType <em>Edge Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerEdgeTriggerImpl extends ControllerTriggerImpl implements ControllerEdgeTrigger
{	
  /**
	 * The default value of the '{@link #getEdgeType() <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEdgeType()
	 * @generated
	 * @ordered
	 */
  protected static final EdgeType EDGE_TYPE_EDEFAULT = EdgeType.RISING;
  /**
	 * The cached value of the '{@link #getEdgeType() <em>Edge Type</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEdgeType()
	 * @generated
	 * @ordered
	 */
  protected EdgeType edgeType = EDGE_TYPE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControllerEdgeTriggerImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_EDGE_TRIGGER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EdgeType getEdgeType()
  {
		return edgeType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEdgeType(EdgeType newEdgeType)
  {
		EdgeType oldEdgeType = edgeType;
		edgeType = newEdgeType == null ? EDGE_TYPE_EDEFAULT : newEdgeType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE, oldEdgeType, edgeType));
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE:
				return getEdgeType();
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE:
				setEdgeType((EdgeType)newValue);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE:
				setEdgeType(EDGE_TYPE_EDEFAULT);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER__EDGE_TYPE:
				return edgeType != EDGE_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (edgeType: ");
		result.append(edgeType);
		result.append(')');
		return result.toString();
	}
  
  protected void update()
  {
	  if(getOperationCallControllerBinding() != null)
	  {
		  if(getOperationCallControllerBinding().isActive())
		  {			  
			  getOperationCallControllerBinding().update();
		  }
	  }
	  
  }

  @Override
  protected void update(boolean oldValue, boolean newValue) 
  {		
	  try
	  {
		 switch (getEdgeType().getValue())
		 {
		  	case EdgeType.RISING_VALUE:
		  	{
		  		if(!oldValue && newValue)
		  		{
		  			 update();
		  		}
		  	}
		  	break;
		  	
		  	case EdgeType.FALLING_VALUE:
		  	{
		  		if(oldValue && !newValue)
		  		{
		  			 update();
		  		}
		  	}						  	
			break;
			
		  	case EdgeType.BOTH_VALUE:
		  	{
		  		update();						  		
		  	}						  	
			break;
	
			default:
				break;
		}
	  }
	  catch(Throwable t)
	  {
		  t.printStackTrace();
	  }
  }
} //ControllerEdgeTriggerImpl
