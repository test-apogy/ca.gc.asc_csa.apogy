package ca.gc.asc_csa.apogy.core.ui.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TransformNodePresentation;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings;
import ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;
import ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage
 * @generated
 */
public class ApogyCoreUISwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCoreUIPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCoreUISwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCoreUIPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case ApogyCoreUIPackage.APOGY_CORE_UI_FACADE: {
				ApogyCoreUIFacade apogyCoreUIFacade = (ApogyCoreUIFacade)theEObject;
				T result = caseApogyCoreUIFacade(apogyCoreUIFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreUIPackage.APOGY_RESOURCE_SETTINGS: {
				ApogyResourceSettings apogyResourceSettings = (ApogyResourceSettings)theEObject;
				T result = caseApogyResourceSettings(apogyResourceSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS: {
				NewApogyProjectSettings newApogyProjectSettings = (NewApogyProjectSettings)theEObject;
				T result = caseNewApogyProjectSettings(newApogyProjectSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreUIPackage.NEW_APOGY_SESSION_SETTINGS: {
				NewApogySessionSettings newApogySessionSettings = (NewApogySessionSettings)theEObject;
				T result = caseNewApogySessionSettings(newApogySessionSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreUIPackage.NEW_APOGY_SYSTEM_SETTINGS: {
				NewApogySystemSettings newApogySystemSettings = (NewApogySystemSettings)theEObject;
				T result = caseNewApogySystemSettings(newApogySystemSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreUIPackage.RESULT_NODE_PRESENTATION: {
				ResultNodePresentation resultNodePresentation = (ResultNodePresentation)theEObject;
				T result = caseResultNodePresentation(resultNodePresentation);
				if (result == null) result = caseTransformNodePresentation(resultNodePresentation);
				if (result == null) result = caseNodePresentation(resultNodePresentation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyCoreUIFacade(ApogyCoreUIFacade object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy Resource Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy Resource Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyResourceSettings(ApogyResourceSettings object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>New Apogy Project Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Apogy Project Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewApogyProjectSettings(NewApogyProjectSettings object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>New Apogy Session Settings</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Apogy Session Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNewApogySessionSettings(NewApogySessionSettings object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>New Apogy System Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Apogy System Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewApogySystemSettings(NewApogySystemSettings object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Node Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseResultNodePresentation(ResultNodePresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNodePresentation(NodePresentation object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Node Presentation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformNodePresentation(TransformNodePresentation object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //ApogyCoreUISwitch
