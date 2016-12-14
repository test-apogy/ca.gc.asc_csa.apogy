package ca.gc.asc_csa.apogy.common.emf.ui.impl;
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
import java.util.ArrayList;
import java.util.List;
import javax.measure.unit.Unit;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Ranges;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonEMFUIFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCommonEMFUIFacade
{
	private static ApogyCommonEMFUIFacade instance = null;
	
	public static ApogyCommonEMFUIFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyCommonEMFUIFacadeImpl();
		}
		return instance;
	}
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApogyCommonEMFUIFacadeImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCommonEMFUIPackage.Literals.APOGY_COMMON_EMFUI_FACADE;
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Color getColorForRange(Ranges range)
  {
	  return Activator.getDefault().getRangeColor(range, Display.getDefault());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  @SuppressWarnings("rawtypes")
  public Unit<?> getDisplayUnits(ETypedElement eTypedElement)
  {
	  Unit displayUnit = Activator.getDefault().getDisplayUnit(eTypedElement);
	  
	  // No display unit defined, return the native units.
	  if(displayUnit == null)
	  {
		  displayUnit = ApogyCommonEMFFacade.INSTANCE.getEngineeringUnits(eTypedElement);
	  }
	  
	  return displayUnit;
  }

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void openDeleteNamedDialog(Named named) {
		List<Named> nameds = new ArrayList<Named>();
		nameds.add(named);
		this.openDeleteNamedDialog(nameds);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void openDeleteNamedDialog(List<? extends Named> namedList) {
	String eObjectsToDeleteMessage = "";

		eObjectsToDeleteMessage += ApogyCommonEMFFacade.INSTANCE.toString(namedList, ", ");

		MessageDialog dialog = new MessageDialog(null, "Delete the selected variables", null,
				"Are you sure to delete these variables: " + eObjectsToDeleteMessage, MessageDialog.QUESTION,
				new String[] { "Yes", "No" }, 1);
		int result = dialog.open();
		if (result == 0) {
			for(EObject eObject: namedList){
				ApogyCommonEmfTransactionFacade.INSTANCE.basicDelete(eObject.eContainer(), eObject.eContainingFeature(), eObject);
			}
		}
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
		@SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyCommonEMFUIPackage.APOGY_COMMON_EMFUI_FACADE___GET_COLOR_FOR_RANGE__RANGES:
				return getColorForRange((Ranges)arguments.get(0));
			case ApogyCommonEMFUIPackage.APOGY_COMMON_EMFUI_FACADE___GET_DISPLAY_UNITS__ETYPEDELEMENT:
				return getDisplayUnits((ETypedElement)arguments.get(0));
			case ApogyCommonEMFUIPackage.APOGY_COMMON_EMFUI_FACADE___OPEN_DELETE_NAMED_DIALOG__NAMED:
				openDeleteNamedDialog((Named)arguments.get(0));
				return null;
			case ApogyCommonEMFUIPackage.APOGY_COMMON_EMFUI_FACADE___OPEN_DELETE_NAMED_DIALOG__LIST:
				openDeleteNamedDialog((List<? extends Named>)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCommonEMFUIFacadeImpl
