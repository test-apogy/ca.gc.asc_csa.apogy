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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage
 * @generated
 */
public class ApogyCoreProgramsControllersAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreProgramsControllersPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreProgramsControllersPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreProgramsControllersSwitch<Adapter> modelSwitch =
		new ApogyCoreProgramsControllersSwitch<Adapter>() {
			@Override
			public Adapter caseApogyCoreProgramsControllersFacade(ApogyCoreProgramsControllersFacade object) {
				return createApogyCoreProgramsControllersFacadeAdapter();
			}
			@Override
			public Adapter caseControllersConfiguration(ControllersConfiguration object) {
				return createControllersConfigurationAdapter();
			}
			@Override
			public Adapter caseOperationCallControllerBinding(OperationCallControllerBinding object) {
				return createOperationCallControllerBindingAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseTimeTrigger(TimeTrigger object) {
				return createTimeTriggerAdapter();
			}
			@Override
			public Adapter caseControllerTrigger(ControllerTrigger object) {
				return createControllerTriggerAdapter();
			}
			@Override
			public Adapter caseControllerEdgeTrigger(ControllerEdgeTrigger object) {
				return createControllerEdgeTriggerAdapter();
			}
			@Override
			public Adapter caseControllerStateTrigger(ControllerStateTrigger object) {
				return createControllerStateTriggerAdapter();
			}
			@Override
			public Adapter caseBindedEDataTypeArgument(BindedEDataTypeArgument object) {
				return createBindedEDataTypeArgumentAdapter();
			}
			@Override
			public Adapter caseValueSource(ValueSource object) {
				return createValueSourceAdapter();
			}
			@Override
			public Adapter caseFixedValueSource(FixedValueSource object) {
				return createFixedValueSourceAdapter();
			}
			@Override
			public Adapter caseToggleValueSource(ToggleValueSource object) {
				return createToggleValueSourceAdapter();
			}
			@Override
			public Adapter caseControllerValueSource(ControllerValueSource object) {
				return createControllerValueSourceAdapter();
			}
			@Override
			public Adapter caseAbstractInputConditioning(AbstractInputConditioning object) {
				return createAbstractInputConditioningAdapter();
			}
			@Override
			public Adapter caseLinearInputConditioning(LinearInputConditioning object) {
				return createLinearInputConditioningAdapter();
			}
			@Override
			public Adapter caseCenteredLinearInputConditioning(CenteredLinearInputConditioning object) {
				return createCenteredLinearInputConditioningAdapter();
			}
			@Override
			public Adapter caseParabolicInputConditioning(ParabolicInputConditioning object) {
				return createParabolicInputConditioningAdapter();
			}
			@Override
			public Adapter caseCenteredParabolicInputConditioning(CenteredParabolicInputConditioning object) {
				return createCenteredParabolicInputConditioningAdapter();
			}
			@Override
			public Adapter caseUserDefinedInputConditioning(UserDefinedInputConditioning object) {
				return createUserDefinedInputConditioningAdapter();
			}
			@Override
			public Adapter caseCustomInputConditioningPoint(CustomInputConditioningPoint object) {
				return createCustomInputConditioningPointAdapter();
			}
			@Override
			public Adapter caseNamed(Named object) {
				return createNamedAdapter();
			}
			@Override
			public Adapter caseDescribed(Described object) {
				return createDescribedAdapter();
			}
			@Override
			public Adapter caseProgram(Program object) {
				return createProgramAdapter();
			}
			@Override
			public Adapter caseTriggeredBasedProgram(TriggeredBasedProgram object) {
				return createTriggeredBasedProgramAdapter();
			}
			@Override
			public Adapter caseOperationCallContainer(OperationCallContainer object) {
				return createOperationCallContainerAdapter();
			}
			@Override
			public Adapter caseVariableFeatureReference(VariableFeatureReference object) {
				return createVariableFeatureReferenceAdapter();
			}
			@Override
			public Adapter caseOperationCall(OperationCall object) {
				return createOperationCallAdapter();
			}
			@Override
			public Adapter caseArgument(Argument object) {
				return createArgumentAdapter();
			}
			@Override
			public Adapter caseEDataTypeArgument(EDataTypeArgument object) {
				return createEDataTypeArgumentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade
	 * @generated
	 */
	public Adapter createApogyCoreProgramsControllersFacadeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration <em>Controllers Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration
	 * @generated
	 */
	public Adapter createControllersConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding <em>Operation Call Controller Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding
	 * @generated
	 */
	public Adapter createOperationCallControllerBindingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger <em>Time Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger
	 * @generated
	 */
	public Adapter createTimeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerTrigger <em>Controller Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ControllerTrigger
	 * @generated
	 */
	public Adapter createControllerTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger <em>Controller Edge Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger
	 * @generated
	 */
	public Adapter createControllerEdgeTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger <em>Controller State Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger
	 * @generated
	 */
	public Adapter createControllerStateTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument <em>Binded EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument
	 * @generated
	 */
	public Adapter createBindedEDataTypeArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource <em>Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource
	 * @generated
	 */
	public Adapter createValueSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource <em>Fixed Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource
	 * @generated
	 */
	public Adapter createFixedValueSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource <em>Toggle Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource
	 * @generated
	 */
	public Adapter createToggleValueSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource <em>Controller Value Source</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource
	 * @generated
	 */
	public Adapter createControllerValueSourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning <em>Abstract Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning
	 * @generated
	 */
	public Adapter createAbstractInputConditioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.LinearInputConditioning <em>Linear Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.LinearInputConditioning
	 * @generated
	 */
	public Adapter createLinearInputConditioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CenteredLinearInputConditioning <em>Centered Linear Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.CenteredLinearInputConditioning
	 * @generated
	 */
	public Adapter createCenteredLinearInputConditioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ParabolicInputConditioning <em>Parabolic Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ParabolicInputConditioning
	 * @generated
	 */
	public Adapter createParabolicInputConditioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CenteredParabolicInputConditioning <em>Centered Parabolic Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.CenteredParabolicInputConditioning
	 * @generated
	 */
	public Adapter createCenteredParabolicInputConditioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.UserDefinedInputConditioning <em>User Defined Input Conditioning</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.UserDefinedInputConditioning
	 * @generated
	 */
	public Adapter createUserDefinedInputConditioningAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint <em>Custom Input Conditioning Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.CustomInputConditioningPoint
	 * @generated
	 */
	public Adapter createCustomInputConditioningPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Named <em>Named</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Named
	 * @generated
	 */
	public Adapter createNamedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.common.emf.Described <em>Described</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.common.emf.Described
	 * @generated
	 */
	public Adapter createDescribedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram <em>Triggered Based Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.TriggeredBasedProgram
	 * @generated
	 */
	public Adapter createTriggeredBasedProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer <em>Operation Call Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer
	 * @generated
	 */
	public Adapter createOperationCallContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference <em>Variable Feature Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference
	 * @generated
	 */
	public Adapter createVariableFeatureReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.OperationCall <em>Operation Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.OperationCall
	 * @generated
	 */
	public Adapter createOperationCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.Argument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.Argument
	 * @generated
	 */
	public Adapter createArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument <em>EData Type Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument
	 * @generated
	 */
	public Adapter createEDataTypeArgumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ApogyCoreProgramsControllersAdapterFactory
