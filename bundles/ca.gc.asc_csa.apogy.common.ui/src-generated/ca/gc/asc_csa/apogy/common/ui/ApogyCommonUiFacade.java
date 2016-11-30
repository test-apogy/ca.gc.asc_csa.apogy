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
package ca.gc.asc_csa.apogy.common.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.resource.ImageDescriptor;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.wizard.WizardPage;
import ca.gc.asc_csa.apogy.common.ui.impl.ApogyCommonUiFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Apogy Workspace Ui Facade.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiPackage#getApogyCommonUiFacade()
 * @model
 * @generated
 */
public interface ApogyCommonUiFacade extends EObject {

	/**
	 * @generated_NOT
	 */
	public static ApogyCommonUiFacade INSTANCE = ApogyCommonUiFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the {@link ImageDescriptor} specified by the uri.
	 * @param uri URI that refers to the image.
	 *            e.g. "platform:/plugin/ca.gc.asc_csa.apogy.common/ui/icons/pin.gif"
	 * @return Reference to the {@link ImageDescriptor} or null if not available.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.ui.ImageDescriptor" unique="false" uriUnique="false"
	 * @generated
	 */
	ImageDescriptor getImageDescriptor(String uri);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adjusts the size according to the ratio specified and the location of the wizard
	 * at the center of the screen where the cursor currently is.
	 * @param wizardPage the {@link WizardPage} to adjust.
	 * @param ratio the wizard size/screen size wanted. (value from 0 to 1)
	 * <!-- end-model-doc -->
	 * @model wizardPageDataType="ca.gc.asc_csa.apogy.common.ui.WizardPage" wizardPageUnique="false" ratioUnique="false"
	 * @generated
	 */
	void adjustWizardPage(WizardPage wizardPage, Double ratio);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adds a double click listener that expands/collapses the tree
	 * when an element is clicked.
	 * @param treeViewer The viewer to add the listener
	 * <!-- end-model-doc -->
	 * @model treeViewerDataType="ca.gc.asc_csa.apogy.common.ui.TreeViewer" treeViewerUnique="false"
	 * @generated
	 */
	void addExpandOnDoubleClick(TreeViewer treeViewer);

} // ApogyCommonUiFacade
