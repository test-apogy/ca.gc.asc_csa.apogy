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
import org.eclipse.symphony.common.math.MathFacade;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.PositionNode;
import org.eclipse.symphony.common.topology.bindings.AXIS;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;
import org.eclipse.symphony.common.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl#getPositionNode <em>Position Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl#getTranslationAxis <em>Translation Axis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TranslationBindingImpl extends AbstractTopologyBindingImpl implements TranslationBinding
{
  /**
	 * The cached value of the '{@link #getPositionNode() <em>Position Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPositionNode()
	 * @generated
	 * @ordered
	 */
  protected PositionNode positionNode;

		/**
	 * The default value of the '{@link #getTranslationAxis() <em>Translation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTranslationAxis()
	 * @generated
	 * @ordered
	 */
  protected static final AXIS TRANSLATION_AXIS_EDEFAULT = AXIS.XAXIS;

		/**
	 * The cached value of the '{@link #getTranslationAxis() <em>Translation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTranslationAxis()
	 * @generated
	 * @ordered
	 */
  protected AXIS translationAxis = TRANSLATION_AXIS_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TranslationBindingImpl()
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
		return TopologyBindingsPackage.Literals.TRANSLATION_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AXIS getTranslationAxis()
  {
		return translationAxis;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTranslationAxis(AXIS newTranslationAxis)
  {
		AXIS oldTranslationAxis = translationAxis;
		translationAxis = newTranslationAxis == null ? TRANSLATION_AXIS_EDEFAULT : newTranslationAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS, oldTranslationAxis, translationAxis));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PositionNode getPositionNode()
  {
		if (positionNode != null && positionNode.eIsProxy()) {
			InternalEObject oldPositionNode = (InternalEObject)positionNode;
			positionNode = (PositionNode)eResolveProxy(oldPositionNode);
			if (positionNode != oldPositionNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE, oldPositionNode, positionNode));
			}
		}
		return positionNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PositionNode basicGetPositionNode()
  {
		return positionNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPositionNode(PositionNode newPositionNode)
  {
		PositionNode oldPositionNode = positionNode;
		positionNode = newPositionNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE, oldPositionNode, positionNode));
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
			case TopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				if (resolve) return getPositionNode();
				return basicGetPositionNode();
			case TopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
				return getTranslationAxis();
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
			case TopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				setPositionNode((PositionNode)newValue);
				return;
			case TopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
				setTranslationAxis((AXIS)newValue);
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
			case TopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				setPositionNode((PositionNode)null);
				return;
			case TopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
				setTranslationAxis(TRANSLATION_AXIS_EDEFAULT);
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
			case TopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				return positionNode != null;
			case TopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
				return translationAxis != TRANSLATION_AXIS_EDEFAULT;
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
		result.append(" (translationAxis: ");
		result.append(translationAxis);
		result.append(')');
		return result.toString();
	}

  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {		
		TranslationBinding translationCopy = EcoreUtil.copy(this);
		translationCopy.setPositionNode((PositionNode) originalToCopyNodeMap.get(this.getPositionNode()));
		return translationCopy;
  }
  
  @Override
  protected void valueChanged(Object newValue) 
  {
		double value = 0.0;
		
		if(newValue instanceof Double)
		{
			value = ((Double) newValue).doubleValue();
		}
		else if(newValue instanceof Float)
		{
			value = ((Float) newValue).doubleValue();
		}
			
		// Applies the value.
		applyValue(value);
  }
  
  private void applyValue(final double newValue)
  {
		/* Rotate around the specified axis.*/
		switch(getTranslationAxis().getValue())
		{					
			case AXIS.XAXIS_VALUE:
				double x = newValue;
				double y = getPositionNode().getPosition().getY();
				double z = getPositionNode().getPosition().getZ();								
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case AXIS.MINUS_XAXIS_VALUE:
				x = -newValue;
				y = getPositionNode().getPosition().getY();
				z = getPositionNode().getPosition().getZ();								
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case AXIS.YAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = newValue;
				z = getPositionNode().getPosition().getZ();
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case AXIS.MINUS_YAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = -newValue;
				z = getPositionNode().getPosition().getZ();
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case AXIS.ZAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = getPositionNode().getPosition().getY();
				z = newValue;
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case AXIS.MINUS_ZAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = getPositionNode().getPosition().getY();
				z = -newValue;
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
		}	
  }
} //TranslationBindingImpl
