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
import org.eclipse.symphony.common.topology.bindings.Axis;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.Symphony__CommonTopologyBindingsPackage;
import org.eclipse.symphony.common.topology.bindings.TranslationBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Translation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl#getPositionNode <em>Position Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.TranslationBindingImpl#getTranslationAxis <em>Translation Axis</em>}</li>
 * </ul>
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
  protected static final Axis TRANSLATION_AXIS_EDEFAULT = Axis.XAXIS;

		/**
	 * The cached value of the '{@link #getTranslationAxis() <em>Translation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTranslationAxis()
	 * @generated
	 * @ordered
	 */
  protected Axis translationAxis = TRANSLATION_AXIS_EDEFAULT;

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
		return Symphony__CommonTopologyBindingsPackage.Literals.TRANSLATION_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Axis getTranslationAxis()
  {
		return translationAxis;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTranslationAxis(Axis newTranslationAxis)
  {
		Axis oldTranslationAxis = translationAxis;
		translationAxis = newTranslationAxis == null ? TRANSLATION_AXIS_EDEFAULT : newTranslationAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS, oldTranslationAxis, translationAxis));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE, oldPositionNode, positionNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE, oldPositionNode, positionNode));
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
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				if (resolve) return getPositionNode();
				return basicGetPositionNode();
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
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
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				setPositionNode((PositionNode)newValue);
				return;
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
				setTranslationAxis((Axis)newValue);
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
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				setPositionNode((PositionNode)null);
				return;
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
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
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__POSITION_NODE:
				return positionNode != null;
			case Symphony__CommonTopologyBindingsPackage.TRANSLATION_BINDING__TRANSLATION_AXIS:
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
			case Axis.XAXIS_VALUE:
				double x = newValue;
				double y = getPositionNode().getPosition().getY();
				double z = getPositionNode().getPosition().getZ();								
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case Axis.MINUS_XAXIS_VALUE:
				x = -newValue;
				y = getPositionNode().getPosition().getY();
				z = getPositionNode().getPosition().getZ();								
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case Axis.YAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = newValue;
				z = getPositionNode().getPosition().getZ();
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case Axis.MINUS_YAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = -newValue;
				z = getPositionNode().getPosition().getZ();
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case Axis.ZAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = getPositionNode().getPosition().getY();
				z = newValue;
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
			case Axis.MINUS_ZAXIS_VALUE:
				x = getPositionNode().getPosition().getX();
				y = getPositionNode().getPosition().getY();
				z = -newValue;
				getPositionNode().setPosition(MathFacade.INSTANCE.createTuple3d(x, y, z));
				break;
		}	
  }
} //TranslationBindingImpl
