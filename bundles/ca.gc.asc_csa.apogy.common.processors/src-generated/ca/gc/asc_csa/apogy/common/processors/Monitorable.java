package ca.gc.asc_csa.apogy.common.processors;
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

import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monitorable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent a object for which operation progress can be reported.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getMonitorable()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Monitorable extends EObject {
	/**
	 * Returns the value of the '<em><b>Progress Monitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Progress Monitor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Progress Monitor</em>' attribute.
	 * @see #setProgressMonitor(IProgressMonitor)
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getMonitorable_ProgressMonitor()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.processors.IProgressMonitor" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	IProgressMonitor getProgressMonitor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.processors.Monitorable#getProgressMonitor <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Progress Monitor</em>' attribute.
	 * @see #getProgressMonitor()
	 * @generated
	 */
	void setProgressMonitor(IProgressMonitor value);

} // Monitorable
