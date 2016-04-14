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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage;
import ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.URLNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>URL Node Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.URLNodeGeometryPlacementAtFeatureOfInterestToolImpl#getGeometryURL <em>Geometry URL</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.impl.URLNodeGeometryPlacementAtFeatureOfInterestToolImpl#getUrlNode <em>Url Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class URLNodeGeometryPlacementAtFeatureOfInterestToolImpl extends GeometryPlacementAtFeatureOfInterestToolImpl implements URLNodeGeometryPlacementAtFeatureOfInterestTool 
{		
	private URLNode urlNode = null;
	
	/**
	 * The default value of the '{@link #getGeometryURL() <em>Geometry URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryURL()
	 * @generated
	 * @ordered
	 */
	protected static final String GEOMETRY_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeometryURL() <em>Geometry URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometryURL()
	 * @generated
	 * @ordered
	 */
	protected String geometryURL = GEOMETRY_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected URLNodeGeometryPlacementAtFeatureOfInterestToolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsPackage.Literals.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeometryURL() {
		return geometryURL;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setGeometryURL(String newGeometryURL) 
	{
		setGeometryURLGen(newGeometryURL);
		
		// Updates the URLNode.
		getUrlNode().setUrl(newGeometryURL);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeometryURLGen(String newGeometryURL) {
		String oldGeometryURL = geometryURL;
		geometryURL = newGeometryURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__GEOMETRY_URL, oldGeometryURL, geometryURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNode getUrlNode()
	{
		URLNode urlNode = basicGetUrlNode();
		return urlNode != null && urlNode.eIsProxy() ? (URLNode)eResolveProxy((InternalEObject)urlNode) : urlNode;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URLNode getUrlNodeGen() {
		URLNode urlNode = basicGetUrlNode();
		return urlNode != null && urlNode.eIsProxy() ? (URLNode)eResolveProxy((InternalEObject)urlNode) : urlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public URLNode basicGetUrlNode() 
	{
		if(urlNode == null)
		{
			urlNode = ApogyCommonTopologyFactory.eINSTANCE.createURLNode();
			urlNode.setUrl(getGeometryURL());
		}
		
		return urlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__GEOMETRY_URL:
				return getGeometryURL();
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE:
				if (resolve) return getUrlNode();
				return basicGetUrlNode();
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
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__GEOMETRY_URL:
				setGeometryURL((String)newValue);
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
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__GEOMETRY_URL:
				setGeometryURL(GEOMETRY_URL_EDEFAULT);
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
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__GEOMETRY_URL:
				return GEOMETRY_URL_EDEFAULT == null ? geometryURL != null : !GEOMETRY_URL_EDEFAULT.equals(geometryURL);
			case ApogyAddonsPackage.URL_NODE_GEOMETRY_PLACEMENT_AT_FEATURE_OF_INTEREST_TOOL__URL_NODE:
				return basicGetUrlNode() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (geometryURL: ");
		result.append(geometryURL);
		result.append(')');
		return result.toString();
	}

	@Override
	public Node loadGeometry() 
	{
		return getUrlNode();
	}
	
} //URLNodeGeometryPlacementAtFeatureOfInterestToolImpl
