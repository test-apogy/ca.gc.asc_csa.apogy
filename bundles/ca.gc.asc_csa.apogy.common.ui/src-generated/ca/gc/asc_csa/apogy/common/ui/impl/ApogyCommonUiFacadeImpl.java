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
package ca.gc.asc_csa.apogy.common.ui.impl;

import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jface.resource.ImageDescriptor;

import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonUiFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonUiFacade {

	/**
	 * @generated_NOT
	 */
	private static ApogyCommonUiFacade instance = null;

	/**
	 * @generated_NOT
	 */
	public static ApogyCommonUiFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonUiFacadeImpl();
		}
		return instance;
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonUiFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonUiPackage.Literals.APOGY_COMMON_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ImageDescriptor getImageDescriptor(String uri) {		
		URL url;
		ImageDescriptor imageDescriptor = null;
		try {
			url = new URL(uri);
			imageDescriptor = ImageDescriptor.createFromURL(url);
		} catch (MalformedURLException e) {
		}
		return imageDescriptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonUiPackage.APOGY_COMMON_UI_FACADE___GET_IMAGE_DESCRIPTOR__STRING:
				return getImageDescriptor((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonUiFacadeImpl
