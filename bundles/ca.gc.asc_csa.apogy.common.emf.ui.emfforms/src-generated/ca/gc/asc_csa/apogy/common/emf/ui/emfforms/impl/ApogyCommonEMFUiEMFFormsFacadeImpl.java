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
package ca.gc.asc_csa.apogy.common.emf.ui.emfforms.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.emfforms.ApogyCommonEMFUiEMFFormsPackage;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonEMFUiEMFFormsFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonEMFUiEMFFormsFacade {
	
	private static ApogyCommonEMFUiEMFFormsFacade instance = null;

	public static ApogyCommonEMFUiEMFFormsFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonEMFUiEMFFormsFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonEMFUiEMFFormsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFUiEMFFormsPackage.Literals.APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void createEMFForms(Composite parent, EObject eObject) {
		createEMFForms(parent, eObject, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void createEMFForms(Composite parent, EObject eObject, boolean readOnly) {
		for (Control control : parent.getChildren()) {
			control.dispose();
		}
		try {
			VView viewModel = ViewProviderHelper.getView(eObject, null);
			if (readOnly) {
				viewModel.setAllContentsReadOnly();
			}
			ECPSWTViewRenderer.INSTANCE.render(parent, eObject, viewModel);
		} catch (Exception e) {
			String message = this.getClass().getSimpleName() + ".setCompositeContents(): "
					+ "Error while opening EMF Forms";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}
		parent.layout();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonEMFUiEMFFormsPackage.APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT:
				createEMFForms((Composite)arguments.get(0), (EObject)arguments.get(1));
				return null;
			case ApogyCommonEMFUiEMFFormsPackage.APOGY_COMMON_EMF_UI_EMF_FORMS_FACADE___CREATE_EMF_FORMS__COMPOSITE_EOBJECT_BOOLEAN:
				createEMFForms((Composite)arguments.get(0), (EObject)arguments.get(1), (Boolean)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonEMFUiEMFFormsFacadeImpl
