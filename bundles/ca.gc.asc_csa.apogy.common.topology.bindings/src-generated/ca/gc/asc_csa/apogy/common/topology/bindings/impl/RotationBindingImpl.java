package ca.gc.asc_csa.apogy.common.topology.bindings.impl;
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

import javax.measure.unit.Unit;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.RotationNode;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.Activator;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.Axis;
import ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.RotationBindingImpl#getRotationNode <em>Rotation Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.RotationBindingImpl#getRotationAxis <em>Rotation Axis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationBindingImpl extends AbstractTopologyBindingImpl implements RotationBinding
{
  private static Unit<?> RADIANS = Unit.valueOf("rad");
	
  /** The conversion factor to use to convert from the feature value to radians.*/
  private double featureToRadiansConversionFactor = 1.0;
  
	
  /**
	 * The cached value of the '{@link #getRotationNode() <em>Rotation Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationNode()
	 * @generated
	 * @ordered
	 */
  protected RotationNode rotationNode;

  /**
	 * The default value of the '{@link #getRotationAxis() <em>Rotation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationAxis()
	 * @generated
	 * @ordered
	 */
  protected static final Axis ROTATION_AXIS_EDEFAULT = Axis.XAXIS;

  /**
	 * The cached value of the '{@link #getRotationAxis() <em>Rotation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationAxis()
	 * @generated
	 * @ordered
	 */
  protected Axis rotationAxis = ROTATION_AXIS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RotationBindingImpl()
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
		return ApogyCommonTopologyBindingsPackage.Literals.ROTATION_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RotationNode getRotationNode()
  {
		if (rotationNode != null && rotationNode.eIsProxy()) {
			InternalEObject oldRotationNode = (InternalEObject)rotationNode;
			rotationNode = (RotationNode)eResolveProxy(oldRotationNode);
			if (rotationNode != oldRotationNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE, oldRotationNode, rotationNode));
			}
		}
		return rotationNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RotationNode basicGetRotationNode()
  {
		return rotationNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRotationNode(RotationNode newRotationNode)
  {
		RotationNode oldRotationNode = rotationNode;
		rotationNode = newRotationNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE, oldRotationNode, rotationNode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Axis getRotationAxis()
  {
		return rotationAxis;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRotationAxis(Axis newRotationAxis)
  {
		Axis oldRotationAxis = rotationAxis;
		rotationAxis = newRotationAxis == null ? ROTATION_AXIS_EDEFAULT : newRotationAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS, oldRotationAxis, rotationAxis));
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
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				if (resolve) return getRotationNode();
				return basicGetRotationNode();
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				return getRotationAxis();
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
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				setRotationNode((RotationNode)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				setRotationAxis((Axis)newValue);
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
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				setRotationNode((RotationNode)null);
				return;
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				setRotationAxis(ROTATION_AXIS_EDEFAULT);
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
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				return rotationNode != null;
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				return rotationAxis != ROTATION_AXIS_EDEFAULT;
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
		result.append(" (rotationAxis: ");
		result.append(rotationAxis);
		result.append(')');
		return result.toString();
	}

  @Override
  public void bind() 
  {
	  // Determine the conversion factor to use.
	  featureToRadiansConversionFactor = determineConversionFactor();
	  
	  super.bind();
  }
  
  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {
	  RotationBinding rotationCopy = EcoreUtil.copy(this);
	  rotationCopy.setRotationNode((RotationNode) originalToCopyNodeMap.get(this.getRotationNode()));
	  return rotationCopy;
  }

  @Override
  protected void valueChanged(Object newValue) 
  {
		double value = 0.0;
		
		if(newValue instanceof Double)
		{
			value = ((Double)newValue).doubleValue();
		}
		else if(newValue instanceof Float)
		{
			value = ((Float)newValue).doubleValue();
		}
		
		// Applies the value.
		applyValue(value);	
  }
      
  private double determineConversionFactor()
  {
	  double factor = 1.0;

	  
	  // Gets the units associated with the feature node.
	  if(getFeatureNode() instanceof AbstractFeatureSpecifier)
	  {
		  AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) getFeatureNode();
		  Unit<?> units = ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(featureSpecifier.getStructuralFeature());
		
		  // If units have been defined in the model.
		  if(units != null)
		  {
			  try
			  {
				  factor = units.getConverterTo(RADIANS).convert(1.0);
			  }
			  catch(Exception e)
			  {
				  String message = this.getName() + ": Engineering units of the feature <" + units.toString() +"> are not an angle value !";
				  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR, e);
			  }
		  }
		  else
		  {
			  String message = this.getName() + ": No Engineering units defined for feature, assuming radians !";
			  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);
		  }
	  }
	  
	  return factor;
  }
  
  private void applyValue(final double newValue)
  {
	  	// Converts value to radians.
		double value = newValue * featureToRadiansConversionFactor;
		
		/* Rotate around the specified axis.*/
		switch(getRotationAxis().getValue())
		{
			case Axis.XAXIS_VALUE:
				getRotationNode().setRotationMatrix(ApogyCommonTopologyFacade.INSTANCE.createRotationNodeXYZ(value, 0, 0).getRotationMatrix());
				break;
			case Axis.MINUS_XAXIS_VALUE:
				getRotationNode().setRotationMatrix(ApogyCommonTopologyFacade.INSTANCE.createRotationNodeXYZ(-value, 0, 0).getRotationMatrix());
				break;
			case Axis.YAXIS_VALUE:
				getRotationNode().setRotationMatrix(ApogyCommonTopologyFacade.INSTANCE.createRotationNodeXYZ(0, value, 0).getRotationMatrix());
				break;
			case Axis.MINUS_YAXIS_VALUE:
				getRotationNode().setRotationMatrix(ApogyCommonTopologyFacade.INSTANCE.createRotationNodeXYZ(0, -value, 0).getRotationMatrix());
				break;
			case Axis.ZAXIS_VALUE:
				getRotationNode().setRotationMatrix(ApogyCommonTopologyFacade.INSTANCE.createRotationNodeXYZ(0, 0,value).getRotationMatrix());
				break;
			case Axis.MINUS_ZAXIS_VALUE:
				getRotationNode().setRotationMatrix(ApogyCommonTopologyFacade.INSTANCE.createRotationNodeXYZ(0, 0,-value).getRotationMatrix());
				break;
		}	
  }
} //RotationBindingImpl
