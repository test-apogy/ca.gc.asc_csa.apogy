/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.RotationNode;
import org.eclipse.symphony.common.topology.TopologyFacade;
import org.eclipse.symphony.common.topology.bindings.AngleUnits;
import org.eclipse.symphony.common.topology.bindings.Axis;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.RotationBinding;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl#getRotationNode <em>Rotation Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl#getRotationAxis <em>Rotation Axis</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.RotationBindingImpl#getRotationUnits <em>Rotation Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RotationBindingImpl extends AbstractTopologyBindingImpl implements RotationBinding
{
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
	 * The default value of the '{@link #getRotationUnits() <em>Rotation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationUnits()
	 * @generated
	 * @ordered
	 */
  protected static final AngleUnits ROTATION_UNITS_EDEFAULT = AngleUnits.DEGREES;

  /**
	 * The cached value of the '{@link #getRotationUnits() <em>Rotation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationUnits()
	 * @generated
	 * @ordered
	 */
  protected AngleUnits rotationUnits = ROTATION_UNITS_EDEFAULT;

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
		return Symphony__CommonTopologyBindingsPackage.Literals.ROTATION_BINDING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE, oldRotationNode, rotationNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE, oldRotationNode, rotationNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS, oldRotationAxis, rotationAxis));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AngleUnits getRotationUnits()
  {
		return rotationUnits;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRotationUnits(AngleUnits newRotationUnits)
  {
		AngleUnits oldRotationUnits = rotationUnits;
		rotationUnits = newRotationUnits == null ? ROTATION_UNITS_EDEFAULT : newRotationUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS, oldRotationUnits, rotationUnits));
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
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				if (resolve) return getRotationNode();
				return basicGetRotationNode();
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				return getRotationAxis();
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
				return getRotationUnits();
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
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				setRotationNode((RotationNode)newValue);
				return;
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				setRotationAxis((Axis)newValue);
				return;
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
				setRotationUnits((AngleUnits)newValue);
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
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				setRotationNode((RotationNode)null);
				return;
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				setRotationAxis(ROTATION_AXIS_EDEFAULT);
				return;
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
				setRotationUnits(ROTATION_UNITS_EDEFAULT);
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
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				return rotationNode != null;
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				return rotationAxis != ROTATION_AXIS_EDEFAULT;
			case Symphony__CommonTopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
				return rotationUnits != ROTATION_UNITS_EDEFAULT;
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
		result.append(", rotationUnits: ");
		result.append(rotationUnits);
		result.append(')');
		return result.toString();
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
  
  private void applyValue(final double newValue)
  {
		double value = newValue;
				
		/* Converts to radians if required.*/					
		switch (getRotationUnits().getValue()) 
		{
				case AngleUnits.DEGREES_VALUE:
					value = Math.toRadians(newValue);
				break;

				default:
				break;
		}
		
		/* Rotate around the specified axis.*/
		switch(getRotationAxis().getValue())
		{
			case Axis.XAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(value, 0, 0).getRotationMatrix());
				break;
			case Axis.MINUS_XAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(-value, 0, 0).getRotationMatrix());
				break;
			case Axis.YAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, value, 0).getRotationMatrix());
				break;
			case Axis.MINUS_YAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, -value, 0).getRotationMatrix());
				break;
			case Axis.ZAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, 0,value).getRotationMatrix());
				break;
			case Axis.MINUS_ZAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, 0,-value).getRotationMatrix());
				break;
		}	
  }
} //RotationBindingImpl
