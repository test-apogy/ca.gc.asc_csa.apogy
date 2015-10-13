/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.bindings.impl;

import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.math.Matrix4x4;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.bindings.AbstractTopologyBinding;
import org.eclipse.symphony.common.topology.bindings.TopologyBindingsPackage;
import org.eclipse.symphony.common.topology.bindings.TransformMatrixBinding;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.FeatureNodeAdapter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform Matrix Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.bindings.impl.TransformMatrixBindingImpl#getTransformNode <em>Transform Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformMatrixBindingImpl extends AbstractTopologyBindingImpl implements TransformMatrixBinding
{
  /**
	 * The cached value of the '{@link #getTransformNode() <em>Transform Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTransformNode()
	 * @generated
	 * @ordered
	 */
  protected TransformNode transformNode;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TransformMatrixBindingImpl()
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
		return TopologyBindingsPackage.Literals.TRANSFORM_MATRIX_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TransformNode getTransformNode()
  {
		if (transformNode != null && transformNode.eIsProxy()) {
			InternalEObject oldTransformNode = (InternalEObject)transformNode;
			transformNode = (TransformNode)eResolveProxy(oldTransformNode);
			if (transformNode != oldTransformNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE, oldTransformNode, transformNode));
			}
		}
		return transformNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TransformNode basicGetTransformNode()
  {
		return transformNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTransformNode(TransformNode newTransformNode)
  {
		TransformNode oldTransformNode = transformNode;
		transformNode = newTransformNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE, oldTransformNode, transformNode));
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
			case TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE:
				if (resolve) return getTransformNode();
				return basicGetTransformNode();
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
			case TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE:
				setTransformNode((TransformNode)newValue);
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
			case TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE:
				setTransformNode((TransformNode)null);
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
			case TopologyBindingsPackage.TRANSFORM_MATRIX_BINDING__TRANSFORM_NODE:
				return transformNode != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap) 
  {	  
	  TransformMatrixBinding transformCopy = EcoreUtil.copy(this);
	  transformCopy.setTransformNode((TransformNode) originalToCopyNodeMap.get(this.getTransformNode()));
	  return transformCopy;
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
					  	if(notification.getOldValue() instanceof Matrix4x4)
					  	{
					  		Matrix4x4 oldMatrix = (Matrix4x4) notification.getOldValue();
					  		oldMatrix.eAdapters().remove(getAdapter());
					  	}
					  					  
						valueChanged(notification.getNewValue());
						
						if(notification.getNewValue() instanceof Matrix4x4)
						{
							Matrix4x4 newMatrix = (Matrix4x4) notification.getNewValue();
							newMatrix.eAdapters().add(getAdapter());
						}						
				  }				
				  else if(notification.getNotifier() instanceof Matrix4x4)
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
		if(newValue instanceof Matrix4x4)
		{
			applyValue((Matrix4x4) newValue);
		}
  }

  private void applyValue(final Matrix4x4 matrix4x4)
  {
	  getTransformNode().setTransformation(matrix4x4.asMatrix4d());
  }
} //TransformMatrixBindingImpl
