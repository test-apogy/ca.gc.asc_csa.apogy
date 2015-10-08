/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.environment.AbstractMapLayer;
import org.eclipse.symphony.core.environment.AbstractMapLayerNode;
import org.eclipse.symphony.core.environment.SymphonyEnvironmentPackage;

import ca.gc.space.topology.INodeVisitor;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.impl.AggregateGroupNodeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.impl.AbstractMapLayerNodeImpl#getAbstractMapLayer <em>Abstract Map Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AbstractMapLayerNodeImpl extends AggregateGroupNodeImpl implements AbstractMapLayerNode
{	
  /**
	 * The cached value of the '{@link #getAbstractMapLayer() <em>Abstract Map Layer</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getAbstractMapLayer()
	 * @generated
	 * @ordered
	 */
  protected AbstractMapLayer abstractMapLayer;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractMapLayerNodeImpl()
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
		return SymphonyEnvironmentPackage.Literals.ABSTRACT_MAP_LAYER_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractMapLayer getAbstractMapLayer()
  {
		if (abstractMapLayer != null && abstractMapLayer.eIsProxy()) {
			InternalEObject oldAbstractMapLayer = (InternalEObject)abstractMapLayer;
			abstractMapLayer = (AbstractMapLayer)eResolveProxy(oldAbstractMapLayer);
			if (abstractMapLayer != oldAbstractMapLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER, oldAbstractMapLayer, abstractMapLayer));
			}
		}
		return abstractMapLayer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractMapLayer basicGetAbstractMapLayer()
  {
		return abstractMapLayer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setAbstractMapLayer(AbstractMapLayer newAbstractMapLayer)
  {
		AbstractMapLayer oldAbstractMapLayer = abstractMapLayer;
		abstractMapLayer = newAbstractMapLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER, oldAbstractMapLayer, abstractMapLayer));
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
			case SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
				if (resolve) return getAbstractMapLayer();
				return basicGetAbstractMapLayer();
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
			case SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
				setAbstractMapLayer((AbstractMapLayer)newValue);
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
			case SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
				setAbstractMapLayer((AbstractMapLayer)null);
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
			case SymphonyEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
				return abstractMapLayer != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public void accept(INodeVisitor visitor) 
  {
	  if (visitor.getType().isInstance(this)) 
	  {
			visitor.visit(this);
	  }

	  // We do the same for all the children.
	  for (Node child : getChildren()) 
	  {	
		  if(child != null) child.accept(visitor);
	  }
  }
  
  @Override
  public String getNodeId() 
  {	
	  if(getAbstractMapLayer() != null)
	  {
		  return getAbstractMapLayer().getName();
	  }
	  else
	  {
		  return null;
	  }
  }
} //AbstractMapLayerNodeImpl
