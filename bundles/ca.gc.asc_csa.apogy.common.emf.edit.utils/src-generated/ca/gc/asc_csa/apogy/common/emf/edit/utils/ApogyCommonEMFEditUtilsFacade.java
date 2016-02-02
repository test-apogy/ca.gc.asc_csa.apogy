package ca.gc.asc_csa.apogy.common.emf.edit.utils;
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

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.impl.ApogyCommonEMFEditUtilsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsPackage#getApogyCommonEMFEditUtilsFacade()
 * @model
 * @generated
 */
public interface ApogyCommonEMFEditUtilsFacade extends EObject
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" objectUnique="false"
	 * @generated
	 */
  String getText(Object object);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model newChildDescriptorsDataType="ca.gc.asc_csa.apogy.common.emf.edit.utils.CollectionObject" newChildDescriptorsUnique="false" featureUnique="false"
	 * @generated
	 */
  void removeChildDescriptor(Collection<Object> newChildDescriptors, Object feature);

  public static ApogyCommonEMFEditUtilsFacade INSTANCE = ApogyCommonEMFEditUtilsFacadeImpl.getInstance();
} // ApogyCommonEMFEditUtilsFacade
