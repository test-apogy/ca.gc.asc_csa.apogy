package ca.gc.asc_csa.apogy.examples.satellite.ui;
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
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getConstellationVariableName <em>Constellation Variable Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiPackage#getApogyExamplesSatelliteUiFacade()
 * @model
 * @generated
 */
public interface ApogyExamplesSatelliteUiFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Constellation Variable Name</b></em>' attribute.
	 * The default value is <code>"constellation"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the name of the constellation {@link Variable}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Variable Name</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiPackage#getApogyExamplesSatelliteUiFacade_ConstellationVariableName()
	 * @model default="constellation" unique="false" changeable="false"
	 * @generated
	 */
	String getConstellationVariableName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the reference to the Constellation {@link Variable} in the active session.
	 * @return Reference to the Constellation {@link Variable}.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Variable getConstellationVariable();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the reference to the {@link OperationCallResultsList} in the active session that may contain
	 * constellation data products.
	 * @return Reference to the {@link OperationCallResultsList}.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	OperationCallResultsList getOperationCallResultsList();

	public ApogyExamplesSatelliteUiFacade INSTANCE = ApogyExamplesSatelliteUiFacadeImpl.getInstance();	

} // ApogyExamplesSatelliteUiFacade
