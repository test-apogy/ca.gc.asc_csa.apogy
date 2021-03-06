package ca.gc.asc_csa.apogy.common.topology.bindings.util;
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

import ca.gc.asc_csa.apogy.common.topology.bindings.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.RotationBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsFacade;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;
import ca.gc.asc_csa.apogy.common.topology.bindings.TransformMatrixBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding;

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
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage
 * @generated
 */
public class ApogyCommonTopologyBindingsSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static ApogyCommonTopologyBindingsPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApogyCommonTopologyBindingsSwitch()
  {
		if (modelPackage == null) {
			modelPackage = ApogyCommonTopologyBindingsPackage.eINSTANCE;
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
			case ApogyCommonTopologyBindingsPackage.ABSTRACT_TOPOLOGY_BINDING: {
				AbstractTopologyBinding abstractTopologyBinding = (AbstractTopologyBinding)theEObject;
				T result = caseAbstractTopologyBinding(abstractTopologyBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.ROTATION_BINDING: {
				RotationBinding rotationBinding = (RotationBinding)theEObject;
				T result = caseRotationBinding(rotationBinding);
				if (result == null) result = caseAbstractTopologyBinding(rotationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.TRANSLATION_BINDING: {
				TranslationBinding translationBinding = (TranslationBinding)theEObject;
				T result = caseTranslationBinding(translationBinding);
				if (result == null) result = caseAbstractTopologyBinding(translationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.TRANSFORM_MATRIX_BINDING: {
				TransformMatrixBinding transformMatrixBinding = (TransformMatrixBinding)theEObject;
				T result = caseTransformMatrixBinding(transformMatrixBinding);
				if (result == null) result = caseAbstractTopologyBinding(transformMatrixBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_BINDING: {
				BooleanBinding booleanBinding = (BooleanBinding)theEObject;
				T result = caseBooleanBinding(booleanBinding);
				if (result == null) result = caseAbstractTopologyBinding(booleanBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.BOOLEAN_CASE: {
				BooleanCase booleanCase = (BooleanCase)theEObject;
				T result = caseBooleanCase(booleanCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.TRUE_BOOLEAN_CASE: {
				TrueBooleanCase trueBooleanCase = (TrueBooleanCase)theEObject;
				T result = caseTrueBooleanCase(trueBooleanCase);
				if (result == null) result = caseBooleanCase(trueBooleanCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.FALSE_BOOLEAN_CASE: {
				FalseBooleanCase falseBooleanCase = (FalseBooleanCase)theEObject;
				T result = caseFalseBooleanCase(falseBooleanCase);
				if (result == null) result = caseBooleanCase(falseBooleanCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_SWITCH_BINDING: {
				EnumerationSwitchBinding enumerationSwitchBinding = (EnumerationSwitchBinding)theEObject;
				T result = caseEnumerationSwitchBinding(enumerationSwitchBinding);
				if (result == null) result = caseAbstractTopologyBinding(enumerationSwitchBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE: {
				EnumerationCase enumerationCase = (EnumerationCase)theEObject;
				T result = caseEnumerationCase(enumerationCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST: {
				BindingsList bindingsList = (BindingsList)theEObject;
				T result = caseBindingsList(bindingsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.FEATURE_ROOTS_LIST: {
				FeatureRootsList featureRootsList = (FeatureRootsList)theEObject;
				T result = caseFeatureRootsList(featureRootsList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.BINDINGS_SET: {
				BindingsSet bindingsSet = (BindingsSet)theEObject;
				T result = caseBindingsSet(bindingsSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCommonTopologyBindingsPackage.APOGY_COMMON_TOPOLOGY_BINDINGS_FACADE: {
				ApogyCommonTopologyBindingsFacade apogyCommonTopologyBindingsFacade = (ApogyCommonTopologyBindingsFacade)theEObject;
				T result = caseApogyCommonTopologyBindingsFacade(apogyCommonTopologyBindingsFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Topology Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Topology Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAbstractTopologyBinding(AbstractTopologyBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Rotation Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotation Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseRotationBinding(RotationBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Translation Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Translation Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTranslationBinding(TranslationBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Transform Matrix Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform Matrix Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTransformMatrixBinding(TransformMatrixBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanBinding(BooleanBinding object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanCase(BooleanCase object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>True Boolean Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>True Boolean Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrueBooleanCase(TrueBooleanCase object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>False Boolean Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>False Boolean Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFalseBooleanCase(FalseBooleanCase object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Switch Binding</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Switch Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEnumerationSwitchBinding(EnumerationSwitchBinding object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Case</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEnumerationCase(EnumerationCase object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Bindings List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindings List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBindingsList(BindingsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Roots List</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Roots List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFeatureRootsList(FeatureRootsList object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Bindings Set</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bindings Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBindingsSet(BindingsSet object)
  {
		return null;
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
	public T caseApogyCommonTopologyBindingsFacade(ApogyCommonTopologyBindingsFacade object) {
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

} //ApogyCommonTopologyBindingsSwitch
