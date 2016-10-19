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
package ca.gc.asc_csa.apogy.workspace.ui.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade;
import ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyWorkspaceUiFacadeImpl extends MinimalEObjectImpl.Container implements ApogyWorkspaceUiFacade {
	
	private static ApogyWorkspaceUiFacade instance = null;

	public static ApogyWorkspaceUiFacade getInstance() {
		if (instance == null) {
			instance = new ApogyWorkspaceUiFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyWorkspaceUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyWorkspaceUiPackage.Literals.APOGY_WORKSPACE_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Execute
	public void newProject() {
//		new WizardDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), new NewApogyProjectWizard()).open();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void openProject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void importProject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void exportProject() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyWorkspaceUiPackage.APOGY_WORKSPACE_UI_FACADE___NEW_PROJECT:
				newProject();
				return null;
			case ApogyWorkspaceUiPackage.APOGY_WORKSPACE_UI_FACADE___OPEN_PROJECT:
				openProject();
				return null;
			case ApogyWorkspaceUiPackage.APOGY_WORKSPACE_UI_FACADE___IMPORT_PROJECT:
				importProject();
				return null;
			case ApogyWorkspaceUiPackage.APOGY_WORKSPACE_UI_FACADE___EXPORT_PROJECT:
				exportProject();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyWorkspaceUiFacadeImpl
