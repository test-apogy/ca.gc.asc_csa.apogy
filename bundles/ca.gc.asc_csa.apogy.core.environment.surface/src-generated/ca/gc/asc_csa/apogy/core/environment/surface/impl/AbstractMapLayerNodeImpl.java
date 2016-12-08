/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.impl.AggregateGroupNodeImpl;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer;
import ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayerNode;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Map Layer Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.AbstractMapLayerNodeImpl#getAbstractMapLayer <em>Abstract Map Layer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractMapLayerNodeImpl extends AggregateGroupNodeImpl implements AbstractMapLayerNode {
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
	protected AbstractMapLayerNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.ABSTRACT_MAP_LAYER_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapLayer getAbstractMapLayer() {
		if (abstractMapLayer != null && abstractMapLayer.eIsProxy()) {
			InternalEObject oldAbstractMapLayer = (InternalEObject)abstractMapLayer;
			abstractMapLayer = (AbstractMapLayer)eResolveProxy(oldAbstractMapLayer);
			if (abstractMapLayer != oldAbstractMapLayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER, oldAbstractMapLayer, abstractMapLayer));
			}
		}
		return abstractMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMapLayer basicGetAbstractMapLayer() {
		return abstractMapLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstractMapLayer(AbstractMapLayer newAbstractMapLayer) {
		AbstractMapLayer oldAbstractMapLayer = abstractMapLayer;
		abstractMapLayer = newAbstractMapLayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER, oldAbstractMapLayer, abstractMapLayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.ABSTRACT_MAP_LAYER_NODE__ABSTRACT_MAP_LAYER:
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
