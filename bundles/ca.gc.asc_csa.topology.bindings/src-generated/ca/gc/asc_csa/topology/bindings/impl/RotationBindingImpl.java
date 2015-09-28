/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.topology.bindings.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.topology.bindings.ANGLE_UNITS;
import ca.gc.asc_csa.topology.bindings.AXIS;
import ca.gc.asc_csa.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.topology.bindings.RotationBinding;
import ca.gc.asc_csa.topology.bindings.TopologyBindingsPackage;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.RotationNode;
import ca.gc.space.topology.TopologyFacade;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rotation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.bindings.impl.RotationBindingImpl#getRotationNode <em>Rotation Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.bindings.impl.RotationBindingImpl#getRotationAxis <em>Rotation Axis</em>}</li>
 *   <li>{@link ca.gc.asc_csa.topology.bindings.impl.RotationBindingImpl#getRotationUnits <em>Rotation Units</em>}</li>
 * </ul>
 * </p>
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
  protected static final AXIS ROTATION_AXIS_EDEFAULT = AXIS.XAXIS;

  /**
	 * The cached value of the '{@link #getRotationAxis() <em>Rotation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationAxis()
	 * @generated
	 * @ordered
	 */
  protected AXIS rotationAxis = ROTATION_AXIS_EDEFAULT;

  /**
	 * The default value of the '{@link #getRotationUnits() <em>Rotation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationUnits()
	 * @generated
	 * @ordered
	 */
  protected static final ANGLE_UNITS ROTATION_UNITS_EDEFAULT = ANGLE_UNITS.DEGREES;

  /**
	 * The cached value of the '{@link #getRotationUnits() <em>Rotation Units</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRotationUnits()
	 * @generated
	 * @ordered
	 */
  protected ANGLE_UNITS rotationUnits = ROTATION_UNITS_EDEFAULT;

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
		return TopologyBindingsPackage.Literals.ROTATION_BINDING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE, oldRotationNode, rotationNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE, oldRotationNode, rotationNode));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AXIS getRotationAxis()
  {
		return rotationAxis;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRotationAxis(AXIS newRotationAxis)
  {
		AXIS oldRotationAxis = rotationAxis;
		rotationAxis = newRotationAxis == null ? ROTATION_AXIS_EDEFAULT : newRotationAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS, oldRotationAxis, rotationAxis));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ANGLE_UNITS getRotationUnits()
  {
		return rotationUnits;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRotationUnits(ANGLE_UNITS newRotationUnits)
  {
		ANGLE_UNITS oldRotationUnits = rotationUnits;
		rotationUnits = newRotationUnits == null ? ROTATION_UNITS_EDEFAULT : newRotationUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS, oldRotationUnits, rotationUnits));
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
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				if (resolve) return getRotationNode();
				return basicGetRotationNode();
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				return getRotationAxis();
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
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
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				setRotationNode((RotationNode)newValue);
				return;
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				setRotationAxis((AXIS)newValue);
				return;
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
				setRotationUnits((ANGLE_UNITS)newValue);
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
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				setRotationNode((RotationNode)null);
				return;
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				setRotationAxis(ROTATION_AXIS_EDEFAULT);
				return;
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
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
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_NODE:
				return rotationNode != null;
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_AXIS:
				return rotationAxis != ROTATION_AXIS_EDEFAULT;
			case TopologyBindingsPackage.ROTATION_BINDING__ROTATION_UNITS:
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
				case ANGLE_UNITS.DEGREES_VALUE:
					value = Math.toRadians(newValue);
				break;

				default:
				break;
		}
		
		/* Rotate around the specified axis.*/
		switch(getRotationAxis().getValue())
		{
			case AXIS.XAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(value, 0, 0).getRotationMatrix());
				break;
			case AXIS.MINUS_XAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(-value, 0, 0).getRotationMatrix());
				break;
			case AXIS.YAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, value, 0).getRotationMatrix());
				break;
			case AXIS.MINUS_YAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, -value, 0).getRotationMatrix());
				break;
			case AXIS.ZAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, 0,value).getRotationMatrix());
				break;
			case AXIS.MINUS_ZAXIS_VALUE:
				getRotationNode().setRotationMatrix(TopologyFacade.INSTANCE.createRotationNodeXYZ(0, 0,-value).getRotationMatrix());
				break;
		}	
  }
} //RotationBindingImpl
