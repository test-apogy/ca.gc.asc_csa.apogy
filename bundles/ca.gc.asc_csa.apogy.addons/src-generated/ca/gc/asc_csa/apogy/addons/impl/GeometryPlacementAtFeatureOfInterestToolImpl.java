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
package ca.gc.asc_csa.apogy.addons.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.GroupNode;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.ApogyCoreFacade;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.GeometryPlacementAtFeatureOfInterestToolImpl#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.GeometryPlacementAtFeatureOfInterestToolImpl#getFeatureOfInterestNode <em>Feature Of Interest Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.GeometryPlacementAtFeatureOfInterestToolImpl#getTransformNode <em>Transform Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GeometryPlacementAtFeatureOfInterestToolImpl extends Simple3DToolImpl implements GeometryPlacementAtFeatureOfInterestTool 
{
	private TransformNode transformNode;
	private Node geometryNode;
	
	/**
	 * The cached value of the '{@link #getFeatureOfInterest() <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterest()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterest featureOfInterest;

	/**
	 * The cached value of the '{@link #getFeatureOfInterestNode() <em>Feature Of Interest Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureOfInterestNode()
	 * @generated
	 * @ordered
	 */
	protected FeatureOfInterestNode featureOfInterestNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeometryPlacementAtFeatureOfInterestToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest getFeatureOfInterest() {
		if (featureOfInterest != null && featureOfInterest.eIsProxy()) {
			InternalEObject oldFeatureOfInterest = (InternalEObject)featureOfInterest;
			featureOfInterest = (FeatureOfInterest)eResolveProxy(oldFeatureOfInterest);
			if (featureOfInterest != oldFeatureOfInterest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST, oldFeatureOfInterest, featureOfInterest));
			}
		}
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterest basicGetFeatureOfInterest() {
		return featureOfInterest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setFeatureOfInterest(FeatureOfInterest newFeatureOfInterest) 
	{		
		setFeatureOfInterestGen(newFeatureOfInterest);

		// Forces update.
		update();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestGen(FeatureOfInterest newFeatureOfInterest) {
		FeatureOfInterest oldFeatureOfInterest = featureOfInterest;
		featureOfInterest = newFeatureOfInterest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST, oldFeatureOfInterest, featureOfInterest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestNode getFeatureOfInterestNode() {
		if (featureOfInterestNode != null && featureOfInterestNode.eIsProxy()) {
			InternalEObject oldFeatureOfInterestNode = (InternalEObject)featureOfInterestNode;
			featureOfInterestNode = (FeatureOfInterestNode)eResolveProxy(oldFeatureOfInterestNode);
			if (featureOfInterestNode != oldFeatureOfInterestNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE, oldFeatureOfInterestNode, featureOfInterestNode));
			}
		}
		return featureOfInterestNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureOfInterestNode basicGetFeatureOfInterestNode() {
		return featureOfInterestNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureOfInterestNode(FeatureOfInterestNode newFeatureOfInterestNode) {
		FeatureOfInterestNode oldFeatureOfInterestNode = featureOfInterestNode;
		featureOfInterestNode = newFeatureOfInterestNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE, oldFeatureOfInterestNode, featureOfInterestNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformNode getTransformNode() 
	{
		TransformNode transformNode = basicGetTransformNode();
		return transformNode != null && transformNode.eIsProxy() ? (TransformNode)eResolveProxy((InternalEObject)transformNode) : transformNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public abstract Node loadGeometry();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST:
				if (resolve) return getFeatureOfInterest();
				return basicGetFeatureOfInterest();
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE:
				if (resolve) return getFeatureOfInterestNode();
				return basicGetFeatureOfInterestNode();
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__TRANSFORM_NODE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST:
				setFeatureOfInterest((FeatureOfInterest)newValue);
				return;
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE:
				setFeatureOfInterestNode((FeatureOfInterestNode)newValue);
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
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST:
				setFeatureOfInterest((FeatureOfInterest)null);
				return;
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE:
				setFeatureOfInterestNode((FeatureOfInterestNode)null);
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
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST:
				return featureOfInterest != null;
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__FEATURE_OF_INTEREST_NODE:
				return featureOfInterestNode != null;
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__TRANSFORM_NODE:
				return basicGetTransformNode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsPackage.GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL___LOAD_GEOMETRY:
				return loadGeometry();
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public void initialise() 
	{		
		super.initialise();		
		
		// Force update.
		update();
	}

	@Override
	public void setActive(boolean value)
	{
		super.setActive(value);
		
		// Forces update.
		update();
	}
	
	@Override
	public void setVisible(boolean visible)
	{
		super.setVisible(visible);
		
		// Forces update.
		update();
	}
	
	public void setName(String name)
	{
		super.setName(name);
		
		getTransformNode().setNodeId(name);
	}
	
	@Override
	public void dispose() 
	{	
		if(transformNode != null)
		{
			if(transformNode.getParent() instanceof GroupNode)
			{
				GroupNode parent = (GroupNode) transformNode.getParent();
				parent.getChildren().remove(transformNode);
			}			
		}
		
		super.dispose();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public TransformNode basicGetTransformNode() 
	{
		if(transformNode == null)
		{
			transformNode = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
			transformNode.setNodeId(getName());			
			transformNode.setDescription("Tranform used to orient the geometry.");
			
			transformNode.setTransformation(ApogyCommonMathFacade.INSTANCE.createIdentityMatrix4x4().asMatrix4d());
			
			// Loads geometry
			try
			{
				transformNode.getChildren().add(getGeometryNode());
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
		
		return transformNode;
	}

	protected Node getGeometryNode()
	{
		if(geometryNode == null)
		{
			geometryNode = loadGeometry();
		}
		
		return geometryNode;
	}
	
	protected void update()
	{
		if(getFeatureOfInterestNode() != null)
		{
			// Detach from previous FeatureOfInterestNode.	
			getFeatureOfInterestNode().getChildren().remove(getTransformNode());			
		}
		
		if(getFeatureOfInterest() != null)
		{			
			// Get new FeatureOfInterestNode.
			FeatureOfInterestNode newFeatureOfInterestNode = ApogyCoreFacade.INSTANCE.getFeatureOfInterestNode(getFeatureOfInterest());
			
			// Updates the FeatureOfInterestNode.
			setFeatureOfInterestNode(newFeatureOfInterestNode);
			
			if(newFeatureOfInterestNode != null)
			{				
				newFeatureOfInterestNode.getChildren().add(getTransformNode());				
			}
		}
	}
} //GeometryPlacementAtFeatureOfInterestToolImpl
