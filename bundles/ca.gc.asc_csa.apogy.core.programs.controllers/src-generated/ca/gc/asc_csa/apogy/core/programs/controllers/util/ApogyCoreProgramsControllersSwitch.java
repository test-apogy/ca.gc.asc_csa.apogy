package ca.gc.asc_csa.apogy.core.programs.controllers.util;
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

import ca.gc.asc_csa.apogy.common.emf.Archivable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.programs.controllers.*;

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
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage
 * @generated
 */
public class ApogyCoreProgramsControllersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreProgramsControllersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersSwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreProgramsControllersPackage.eINSTANCE;
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCoreProgramsControllersPackage.APOGY_CORE_PROGRAMS_CONTROLLERS_FACADE: {
				ApogyCoreProgramsControllersFacade apogyCoreProgramsControllersFacade = (ApogyCoreProgramsControllersFacade)theEObject;
				T result = caseApogyCoreProgramsControllersFacade(apogyCoreProgramsControllersFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION: {
				ControllersConfiguration controllersConfiguration = (ControllersConfiguration)theEObject;
				T result = caseControllersConfiguration(controllersConfiguration);
				if (result == null) result = caseTriggeredBasedProgram(controllersConfiguration);
				if (result == null) result = caseOperationCallContainer(controllersConfiguration);
				if (result == null) result = caseProgram(controllersConfiguration);
				if (result == null) result = caseNamed(controllersConfiguration);
				if (result == null) result = caseDescribed(controllersConfiguration);
				if (result == null) result = caseArchivable(controllersConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING: {
				OperationCallControllerBinding operationCallControllerBinding = (OperationCallControllerBinding)theEObject;
				T result = caseOperationCallControllerBinding(operationCallControllerBinding);
				if (result == null) result = caseOperationCall(operationCallControllerBinding);
				if (result == null) result = caseVariableFeatureReference(operationCallControllerBinding);
				if (result == null) result = caseDescribed(operationCallControllerBinding);
				if (result == null) result = caseNamed(operationCallControllerBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseNamed(trigger);
				if (result == null) result = caseDescribed(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.TIME_TRIGGER: {
				TimeTrigger timeTrigger = (TimeTrigger)theEObject;
				T result = caseTimeTrigger(timeTrigger);
				if (result == null) result = caseTrigger(timeTrigger);
				if (result == null) result = caseNamed(timeTrigger);
				if (result == null) result = caseDescribed(timeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CONTROLLER_TRIGGER: {
				ControllerTrigger controllerTrigger = (ControllerTrigger)theEObject;
				T result = caseControllerTrigger(controllerTrigger);
				if (result == null) result = caseTrigger(controllerTrigger);
				if (result == null) result = caseNamed(controllerTrigger);
				if (result == null) result = caseDescribed(controllerTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CONTROLLER_EDGE_TRIGGER: {
				ControllerEdgeTrigger controllerEdgeTrigger = (ControllerEdgeTrigger)theEObject;
				T result = caseControllerEdgeTrigger(controllerEdgeTrigger);
				if (result == null) result = caseControllerTrigger(controllerEdgeTrigger);
				if (result == null) result = caseTrigger(controllerEdgeTrigger);
				if (result == null) result = caseNamed(controllerEdgeTrigger);
				if (result == null) result = caseDescribed(controllerEdgeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER: {
				ControllerStateTrigger controllerStateTrigger = (ControllerStateTrigger)theEObject;
				T result = caseControllerStateTrigger(controllerStateTrigger);
				if (result == null) result = caseControllerTrigger(controllerStateTrigger);
				if (result == null) result = caseTrigger(controllerStateTrigger);
				if (result == null) result = caseNamed(controllerStateTrigger);
				if (result == null) result = caseDescribed(controllerStateTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.BINDED_EDATA_TYPE_ARGUMENT: {
				BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument)theEObject;
				T result = caseBindedEDataTypeArgument(bindedEDataTypeArgument);
				if (result == null) result = caseArgument(bindedEDataTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.VALUE_SOURCE: {
				ValueSource valueSource = (ValueSource)theEObject;
				T result = caseValueSource(valueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.FIXED_VALUE_SOURCE: {
				FixedValueSource fixedValueSource = (FixedValueSource)theEObject;
				T result = caseFixedValueSource(fixedValueSource);
				if (result == null) result = caseEDataTypeArgument(fixedValueSource);
				if (result == null) result = caseValueSource(fixedValueSource);
				if (result == null) result = caseArgument(fixedValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE: {
				ToggleValueSource toggleValueSource = (ToggleValueSource)theEObject;
				T result = caseToggleValueSource(toggleValueSource);
				if (result == null) result = caseValueSource(toggleValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CONTROLLER_VALUE_SOURCE: {
				ControllerValueSource controllerValueSource = (ControllerValueSource)theEObject;
				T result = caseControllerValueSource(controllerValueSource);
				if (result == null) result = caseValueSource(controllerValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.ABSTRACT_INPUT_CONDITIONING: {
				AbstractInputConditioning abstractInputConditioning = (AbstractInputConditioning)theEObject;
				T result = caseAbstractInputConditioning(abstractInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.LINEAR_INPUT_CONDITIONING: {
				LinearInputConditioning linearInputConditioning = (LinearInputConditioning)theEObject;
				T result = caseLinearInputConditioning(linearInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(linearInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING: {
				CenteredLinearInputConditioning centeredLinearInputConditioning = (CenteredLinearInputConditioning)theEObject;
				T result = caseCenteredLinearInputConditioning(centeredLinearInputConditioning);
				if (result == null) result = caseLinearInputConditioning(centeredLinearInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(centeredLinearInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.PARABOLIC_INPUT_CONDITIONING: {
				ParabolicInputConditioning parabolicInputConditioning = (ParabolicInputConditioning)theEObject;
				T result = caseParabolicInputConditioning(parabolicInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(parabolicInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING: {
				CenteredParabolicInputConditioning centeredParabolicInputConditioning = (CenteredParabolicInputConditioning)theEObject;
				T result = caseCenteredParabolicInputConditioning(centeredParabolicInputConditioning);
				if (result == null) result = caseParabolicInputConditioning(centeredParabolicInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(centeredParabolicInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.USER_DEFINED_INPUT_CONDITIONING: {
				UserDefinedInputConditioning userDefinedInputConditioning = (UserDefinedInputConditioning)theEObject;
				T result = caseUserDefinedInputConditioning(userDefinedInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(userDefinedInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT: {
				CustomInputConditioningPoint customInputConditioningPoint = (CustomInputConditioningPoint)theEObject;
				T result = caseCustomInputConditioningPoint(customInputConditioningPoint);
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
	public T caseApogyCoreProgramsControllersFacade(ApogyCoreProgramsControllersFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controllers Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controllers Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllersConfiguration(ControllersConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Controller Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Controller Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallControllerBinding(OperationCallControllerBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrigger(Trigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeTrigger(TimeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerTrigger(ControllerTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Edge Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Edge Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerEdgeTrigger(ControllerEdgeTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller State Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller State Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerStateTrigger(ControllerStateTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binded EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binded EData Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBindedEDataTypeArgument(BindedEDataTypeArgument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueSource(ValueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fixed Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fixed Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFixedValueSource(FixedValueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Toggle Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Toggle Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseToggleValueSource(ToggleValueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Value Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Value Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerValueSource(ControllerValueSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Input Conditioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInputConditioning(AbstractInputConditioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Input Conditioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinearInputConditioning(LinearInputConditioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centered Linear Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centered Linear Input Conditioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenteredLinearInputConditioning(CenteredLinearInputConditioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parabolic Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parabolic Input Conditioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParabolicInputConditioning(ParabolicInputConditioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Centered Parabolic Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Centered Parabolic Input Conditioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCenteredParabolicInputConditioning(CenteredParabolicInputConditioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Defined Input Conditioning</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Defined Input Conditioning</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserDefinedInputConditioning(UserDefinedInputConditioning object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Input Conditioning Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Input Conditioning Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomInputConditioningPoint(CustomInputConditioningPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamed(Named object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribed(Described object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Archivable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Archivable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArchivable(Archivable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triggered Based Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triggered Based Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggeredBasedProgram(TriggeredBasedProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCallContainer(OperationCallContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Feature Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Feature Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableFeatureReference(VariableFeatureReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCall(OperationCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgument(Argument object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EData Type Argument</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEDataTypeArgument(EDataTypeArgument object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyCoreProgramsControllersSwitch
