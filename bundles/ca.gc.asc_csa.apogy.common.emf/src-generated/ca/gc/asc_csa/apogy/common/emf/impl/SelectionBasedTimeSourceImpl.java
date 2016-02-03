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

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.SelectionBasedTimeSource;
import ca.gc.asc_csa.apogy.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selection Based Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SelectionBasedTimeSourceImpl extends TimeSourceImpl implements SelectionBasedTimeSource {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionBasedTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.SELECTION_BASED_TIME_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setSelection(Timed timedElement)
	{
		if(timedElement != null)
		{
			Date time = timedElement.getTime();
			
			// Update the time source time.
			setTime(time);			
		}
		else
		{
			setTime(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonEMFPackage.SELECTION_BASED_TIME_SOURCE___SET_SELECTION__TIMED:
				setSelection((Timed)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SelectionBasedTimeSourceImpl
