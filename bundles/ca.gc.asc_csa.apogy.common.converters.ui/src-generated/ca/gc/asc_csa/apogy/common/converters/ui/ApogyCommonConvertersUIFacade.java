package ca.gc.asc_csa.apogy.common.converters.ui;
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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.viewers.ISelection;
import ca.gc.asc_csa.apogy.common.converters.ui.impl.ApogyCommonConvertersUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIPackage#getApogyCommonConvertersUIFacade()
 * @model
 * @generated
 */
public interface ApogyCommonConvertersUIFacade extends EObject {
	
	public static ApogyCommonConvertersUIFacade INSTANCE = ApogyCommonConvertersUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Converts an ISelection to an object of type targetType
	 * @param selection The ISelection.
	 * @param targetType The class of the targeted type.
	 * @return A list of objects of the targeted type, can be empty.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.converters.List<org.eclipse.emf.ecore.EJavaObject>" unique="false" many="false" selectionDataType="ca.gc.asc_csa.apogy.common.converters.ui.ISelection" selectionUnique="false" targetTypeUnique="false"
	 * @generated
	 */
	List<Object> convert(ISelection selection, Class<?> targetType);

} // ApogyCommonConvertersUIFacade
