package ca.gc.asc_csa.apogy.core.ui.impl;
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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCoreUIFacadeImpl extends MinimalEObjectImpl.Container
		implements ApogyCoreUIFacade {

	private static ApogyCoreUIFacade instance = null;

	public static ApogyCoreUIFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCoreUIFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreUIPackage.Literals.APOGY_CORE_UI_FACADE;
	}


} // ApogyCoreUIFacadeImpl
