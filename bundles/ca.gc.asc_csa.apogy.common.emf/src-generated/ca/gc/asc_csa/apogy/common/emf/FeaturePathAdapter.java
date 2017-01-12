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
 * 	Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.common.emf;

import java.util.HashMap;

import java.util.List;
import org.eclipse.emf.common.notify.Adapter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Path Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class used to put adapters on all the features of a path
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter#getEObjectAdaptersMap <em>EObject Adapters Map</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter#getFeaturePath <em>Feature Path</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeaturePathAdapter()
 * @model abstract="true"
 * @generated
 */
public interface FeaturePathAdapter extends EObject {
	/**
	 * Returns the value of the '<em><b>EObject Adapters Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject Adapters Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Map of the adapters, this is used to remove the adapters when no longer needed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EObject Adapters Map</em>' attribute.
	 * @see #setEObjectAdaptersMap(HashMap)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeaturePathAdapter_EObjectAdaptersMap()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.emf.HashMap<org.eclipse.emf.ecore.EObject, ca.gc.asc_csa.apogy.common.emf.Adapter>"
	 * @generated
	 */
	HashMap<EObject, Adapter> getEObjectAdaptersMap();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter#getEObjectAdaptersMap <em>EObject Adapters Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject Adapters Map</em>' attribute.
	 * @see #getEObjectAdaptersMap()
	 * @generated
	 */
	void setEObjectAdaptersMap(HashMap<EObject, Adapter> value);

	/**
	 * Returns the value of the '<em><b>Feature Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * List of the features to get notified if changed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Path</em>' attribute.
	 * @see #setFeaturePath(List)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getFeaturePathAdapter_FeaturePath()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.emf.ListFeature"
	 * @generated
	 */
	List<? extends EStructuralFeature> getFeaturePath();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter#getFeaturePath <em>Feature Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Path</em>' attribute.
	 * @see #getFeaturePath()
	 * @generated
	 */
	void setFeaturePath(List<? extends EStructuralFeature> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model msgDataType="ca.gc.asc_csa.apogy.common.emf.Notification" msgUnique="false"
	 * @generated
	 */
	void notifyAdapterOnFeatureChanged(Notification msg);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Is called when an object in the featurePath has a notifyChanged called on a feature in the featurePath.
	 * <!-- end-model-doc -->
	 * @model msgDataType="ca.gc.asc_csa.apogy.common.emf.Notification" msgUnique="false"
	 * @generated
	 */
	void notifyChanged(Notification msg);

} // FeaturePathAdapter
