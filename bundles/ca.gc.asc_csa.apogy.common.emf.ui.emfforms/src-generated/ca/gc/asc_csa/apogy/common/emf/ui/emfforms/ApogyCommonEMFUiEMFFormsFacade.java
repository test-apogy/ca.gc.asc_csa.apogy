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
package ca.gc.asc_csa.apogy.common.emf.ui.emfforms;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl.ApogyCommonEMFUiEMFFormsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Apogy Common EMF Ui EMFForms Facade.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsPackage#getApogyCommonEMFUiEMFFormsFacade()
 * @model
 * @generated
 */
public interface ApogyCommonEMFUiEMFFormsFacade extends EObject {
	
	public static ApogyCommonEMFUiEMFFormsFacade INSTANCE = ApogyCommonEMFUiEMFFormsFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a {@link Composite} containing the EMF forms
	 * corresponding to a specified {@link EObject} in the parent {@link Composite}.
	 * This method is the same as calling createEMFForms(parent, eObject, false).
	 * @param parent The parent {@link Composite} containing the EMF forms.
	 * @param eObject The {@link EObject} to display.
	 * <!-- end-model-doc -->
	 * @model parentDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Composite" parentUnique="false" eObjectUnique="false"
	 * @generated
	 */
	void createEMFForms(Composite parent, EObject eObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a {@link Composite} containing the EMF forms
	 * corresponding to a specified {@link EObject} in the parent {@link Composite}.
	 * @param parent The parent {@link Composite} containing the EMF forms.
	 * @param eObject The {@link EObject} to display.
	 * @param message Message to display if the object is null.
	 * <!-- end-model-doc -->
	 * @model parentDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Composite" parentUnique="false" eObjectUnique="false" messageUnique="false"
	 * @generated
	 */
	void createEMFForms(Composite parent, EObject eObject, String message);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a {@link Composite} containing the EMF forms
	 * corresponding to a specified {@link EObject} in the parent {@link Composite}.
	 * @param parent The parent {@link Composite} containing the EMF forms.
	 * @param eObject The {@link EObject} to display.
	 * @param readOlny Used to specify if the EMF forms is in read only mode.
	 * <!-- end-model-doc -->
	 * @model parentDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Composite" parentUnique="false" eObjectUnique="false" readOnlyUnique="false"
	 * @generated
	 */
	void createEMFForms(Composite parent, EObject eObject, boolean readOnly);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a {@link Composite} containing the EMF forms
	 * corresponding to a specified {@link EObject} in the parent {@link Composite}.
	 * @param parent The parent {@link Composite} containing the EMF forms.
	 * @param eObject The {@link EObject} to display.
	 * @param viewModel View model used to render the EObject.
	 * <!-- end-model-doc -->
	 * @model parentDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Composite" parentUnique="false" eObjectUnique="false" viewModelDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.VView" viewModelUnique="false"
	 * @generated
	 */
	void createEMFForms(Composite parent, EObject eObject, VView viewModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Creates a {@link Composite} containing the EMF forms
	 * corresponding to a specified {@link EObject} in the parent {@link Composite}.
	 * @param parent The parent {@link Composite} containing the EMF forms.
	 * @param eObject The {@link EObject} to display.
	 * @param viewModel View model used to render the EObject.
	 * @param message Message to display if the object is null.
	 * <!-- end-model-doc -->
	 * @model parentDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Composite" parentUnique="false" eObjectUnique="false" viewModelDataType="ca.gc.asc_csa.apogy.common.emf.ui.emfforms.VView" viewModelUnique="false" messageUnique="false"
	 * @generated
	 */
	void createEMFForms(Composite parent, EObject eObject, VView viewModel, String message);
} // ApogyCommonEMFUiEMFFormsFacade
