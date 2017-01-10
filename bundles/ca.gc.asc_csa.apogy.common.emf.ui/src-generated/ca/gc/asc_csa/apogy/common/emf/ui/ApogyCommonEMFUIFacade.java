package ca.gc.asc_csa.apogy.common.emf.ui;
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

import ca.gc.asc_csa.apogy.common.emf.Named;
import javax.measure.unit.Unit;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.swt.graphics.Color;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.ui.impl.ApogyCommonEMFUIFacadeImpl;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIPackage#getApogyCommonEMFUIFacade()
 * @model
 * @generated
 */
public interface ApogyCommonEMFUIFacade extends EObject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the color currently associated with the specified
	 * Ranges. Can be null.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.ui.Color" unique="false" rangeUnique="false"
	 * @generated
	 */
	Color getColorForRange(Ranges range);

	public static ApogyCommonEMFUIFacade INSTANCE = ApogyCommonEMFUIFacadeImpl.getInstance();
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Unit to be used for display.
	 * @param eTypedElement The specified ETypedElement.
	 * @return the display Unit, or the native unit if none found.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.emf.ui.Unit" unique="false" eTypedElementUnique="false"
	 * @generated
	 */
  Unit<?> getDisplayUnits(ETypedElement eTypedElement);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opens a dialog to delete the {@link Named} object.
	 * @param named Reference to the {@link Named}
	 * <!-- end-model-doc -->
	 * @model namedUnique="false"
	 * @generated
	 */
	void openDeleteNamedDialog(Named named);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opens a dialog to delete a {@link List} of {@link Named} objects.
	 * @param namedList Reference to the {@link List}
	 * <!-- end-model-doc -->
	 * @model namedListDataType="ca.gc.asc_csa.apogy.common.emf.ui.List" namedListUnique="false"
	 * @generated
	 */
	void openDeleteNamedDialog(List<? extends Named> namedList);

} // ApogyCommonEMFUIFacade
