package ca.gc.asc_csa.apogy.core.invocator;
/*
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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Watch Feature Node Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * WatchFeatureNodeAdapter
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#getSourceObject <em>Source Object</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#getCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#isResolved <em>Resolved</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchFeatureNodeAdapter()
 * @model
 * @generated
 */
public interface WatchFeatureNodeAdapter extends EObject
{
  /**
	 * Returns the value of the '<em><b>Source Object</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The object onto which to apply the WatchFeatureNodeAdapter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Object</em>' reference.
	 * @see #setSourceObject(EObject)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchFeatureNodeAdapter_SourceObject()
	 * @model
	 * @generated
	 */
  EObject getSourceObject();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#getSourceObject <em>Source Object</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Object</em>' reference.
	 * @see #getSourceObject()
	 * @generated
	 */
  void setSourceObject(EObject value);

  /**
	 * Returns the value of the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FeatureNode defining which feature to monitor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Node</em>' reference.
	 * @see #setFeatureNode(AbstractFeatureNode)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchFeatureNodeAdapter_FeatureNode()
	 * @model
	 * @generated
	 */
  AbstractFeatureNode getFeatureNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#getFeatureNode <em>Feature Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Node</em>' reference.
	 * @see #getFeatureNode()
	 * @generated
	 */
	void setFeatureNode(AbstractFeatureNode value);

		/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current value of the monitored feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(Object)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchFeatureNodeAdapter_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
  Object getCurrentValue();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
  void setCurrentValue(Object value);

  /**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether or not the featureNode is currently resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getWatchFeatureNodeAdapter_Resolved()
	 * @model default="false" unique="false"
	 * @generated
	 */
  boolean isResolved();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.WatchFeatureNodeAdapter#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
  void setResolved(boolean value);

} // WatchFeatureNodeAdapter
