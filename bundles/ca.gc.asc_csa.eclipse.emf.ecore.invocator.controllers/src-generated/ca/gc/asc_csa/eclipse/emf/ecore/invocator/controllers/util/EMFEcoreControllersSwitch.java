/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.util;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Argument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EDataTypeArgument;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCall;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.OperationCallContainer;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Program;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.VariableFeatureReference;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.*;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

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
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.controllers.EMFEcoreControllersPackage
 * @generated
 */
public class EMFEcoreControllersSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EMFEcoreControllersPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMFEcoreControllersSwitch() {
		if (modelPackage == null) {
			modelPackage = EMFEcoreControllersPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
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
			case EMFEcoreControllersPackage.CONTROLLER_FACADE: {
				ControllerFacade controllerFacade = (ControllerFacade)theEObject;
				T result = caseControllerFacade(controllerFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CONTROLLERS_CONFIGURATION: {
				ControllersConfiguration controllersConfiguration = (ControllersConfiguration)theEObject;
				T result = caseControllersConfiguration(controllersConfiguration);
				if (result == null) result = caseProgram(controllersConfiguration);
				if (result == null) result = caseOperationCallContainer(controllersConfiguration);
				if (result == null) result = caseNamed(controllersConfiguration);
				if (result == null) result = caseDescribed(controllersConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.OPERATION_CALL_CONTROLLER_BINDING: {
				OperationCallControllerBinding operationCallControllerBinding = (OperationCallControllerBinding)theEObject;
				T result = caseOperationCallControllerBinding(operationCallControllerBinding);
				if (result == null) result = caseOperationCall(operationCallControllerBinding);
				if (result == null) result = caseVariableFeatureReference(operationCallControllerBinding);
				if (result == null) result = caseDescribed(operationCallControllerBinding);
				if (result == null) result = caseNamed(operationCallControllerBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.TRIGGER: {
				Trigger trigger = (Trigger)theEObject;
				T result = caseTrigger(trigger);
				if (result == null) result = caseNamed(trigger);
				if (result == null) result = caseDescribed(trigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.TIME_TRIGGER: {
				TimeTrigger timeTrigger = (TimeTrigger)theEObject;
				T result = caseTimeTrigger(timeTrigger);
				if (result == null) result = caseTrigger(timeTrigger);
				if (result == null) result = caseNamed(timeTrigger);
				if (result == null) result = caseDescribed(timeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CONTROLLER_TRIGGER: {
				ControllerTrigger controllerTrigger = (ControllerTrigger)theEObject;
				T result = caseControllerTrigger(controllerTrigger);
				if (result == null) result = caseTrigger(controllerTrigger);
				if (result == null) result = caseNamed(controllerTrigger);
				if (result == null) result = caseDescribed(controllerTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CONTROLLER_EDGE_TRIGGER: {
				ControllerEdgeTrigger controllerEdgeTrigger = (ControllerEdgeTrigger)theEObject;
				T result = caseControllerEdgeTrigger(controllerEdgeTrigger);
				if (result == null) result = caseControllerTrigger(controllerEdgeTrigger);
				if (result == null) result = caseTrigger(controllerEdgeTrigger);
				if (result == null) result = caseNamed(controllerEdgeTrigger);
				if (result == null) result = caseDescribed(controllerEdgeTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CONTROLLER_STATE_TRIGGER: {
				ControllerStateTrigger controllerStateTrigger = (ControllerStateTrigger)theEObject;
				T result = caseControllerStateTrigger(controllerStateTrigger);
				if (result == null) result = caseControllerTrigger(controllerStateTrigger);
				if (result == null) result = caseTrigger(controllerStateTrigger);
				if (result == null) result = caseNamed(controllerStateTrigger);
				if (result == null) result = caseDescribed(controllerStateTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.BINDED_EDATA_TYPE_ARGUMENT: {
				BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument)theEObject;
				T result = caseBindedEDataTypeArgument(bindedEDataTypeArgument);
				if (result == null) result = caseArgument(bindedEDataTypeArgument);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.VALUE_SOURCE: {
				ValueSource valueSource = (ValueSource)theEObject;
				T result = caseValueSource(valueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.FIXED_VALUE_SOURCE: {
				FixedValueSource fixedValueSource = (FixedValueSource)theEObject;
				T result = caseFixedValueSource(fixedValueSource);
				if (result == null) result = caseEDataTypeArgument(fixedValueSource);
				if (result == null) result = caseValueSource(fixedValueSource);
				if (result == null) result = caseArgument(fixedValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE: {
				ToggleValueSource toggleValueSource = (ToggleValueSource)theEObject;
				T result = caseToggleValueSource(toggleValueSource);
				if (result == null) result = caseValueSource(toggleValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CONTROLLER_VALUE_SOURCE: {
				ControllerValueSource controllerValueSource = (ControllerValueSource)theEObject;
				T result = caseControllerValueSource(controllerValueSource);
				if (result == null) result = caseValueSource(controllerValueSource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.ABSTRACT_INPUT_CONDITIONING: {
				AbstractInputConditioning abstractInputConditioning = (AbstractInputConditioning)theEObject;
				T result = caseAbstractInputConditioning(abstractInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.LINEAR_INPUT_CONDITIONING: {
				LinearInputConditioning linearInputConditioning = (LinearInputConditioning)theEObject;
				T result = caseLinearInputConditioning(linearInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(linearInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING: {
				CenteredLinearInputConditioning centeredLinearInputConditioning = (CenteredLinearInputConditioning)theEObject;
				T result = caseCenteredLinearInputConditioning(centeredLinearInputConditioning);
				if (result == null) result = caseLinearInputConditioning(centeredLinearInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(centeredLinearInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING: {
				ParabolicInputConditioning parabolicInputConditioning = (ParabolicInputConditioning)theEObject;
				T result = caseParabolicInputConditioning(parabolicInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(parabolicInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING: {
				CenteredParabolicInputConditioning centeredParabolicInputConditioning = (CenteredParabolicInputConditioning)theEObject;
				T result = caseCenteredParabolicInputConditioning(centeredParabolicInputConditioning);
				if (result == null) result = caseParabolicInputConditioning(centeredParabolicInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(centeredParabolicInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.USER_DEFINED_INPUT_CONDITIONING: {
				UserDefinedInputConditioning userDefinedInputConditioning = (UserDefinedInputConditioning)theEObject;
				T result = caseUserDefinedInputConditioning(userDefinedInputConditioning);
				if (result == null) result = caseAbstractInputConditioning(userDefinedInputConditioning);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case EMFEcoreControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT: {
				CustomInputConditioningPoint customInputConditioningPoint = (CustomInputConditioningPoint)theEObject;
				T result = caseCustomInputConditioningPoint(customInputConditioningPoint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerFacade(ControllerFacade object) {
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

} //EMFEcoreControllersSwitch
