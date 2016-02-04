package ca.gc.asc_csa.apogy.common.emf.impl;
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

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.FixedTimeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fixed Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FixedTimeSourceImpl extends TimeSourceImpl implements FixedTimeSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FixedTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.FIXED_TIME_SOURCE;
	}

	@Override
	public Date getTime() 
	{
		if(super.getTime() == null)
		{
			Date now = new Date();
			
			setTime(now);
		}
		
		return super.getTime();
	}
} //FixedTimeSourceImpl
