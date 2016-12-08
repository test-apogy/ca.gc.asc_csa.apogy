package ca.gc.asc_csa.apogy.core.invocator.ui.impl;
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
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.MessageDialog;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.StringEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCoreInvocatorUIFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreInvocatorUIFacade {

	private static ApogyCoreInvocatorUIFacade instance = null;

	public static ApogyCoreInvocatorUIFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCoreInvocatorUIFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreInvocatorUIFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorUIPackage.Literals.APOGY_CORE_INVOCATOR_UI_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void copyInitializationData(Context source, Context destination) throws Exception {

		if (source.getVariableImplementationsList().getVariableImplementations().size() != destination
				.getVariableImplementationsList().getVariableImplementations().size()) {
			throw new Exception(
					"Contexts <" + source.getName() + "> and <" + destination.getName() + "> are not consistent");
		}

		Iterator<VariableImplementation> sourceVariableImplementations = source.getVariableImplementationsList()
				.getVariableImplementations().iterator();
		Iterator<VariableImplementation> destinationVariableImplementations = destination
				.getVariableImplementationsList().getVariableImplementations().iterator();

		while (sourceVariableImplementations.hasNext()) {
			try {
				CompoundCommand command = new CompoundCommand();
				copyInitializationData(sourceVariableImplementations.next(), destinationVariableImplementations.next(),
						command);
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(source);
				editingDomain.getCommandStack().execute(command);

			} catch (Exception e) {
				throw new Exception(
						"Contexts <" + source.getName() + "> and <" + destination.getName() + "> are not consistent",
						e);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void copyInitializationData(AbstractTypeImplementation source, AbstractTypeImplementation destination,
			CompoundCommand command) throws Exception {
		if (source.getHandlingType() != destination.getHandlingType()) {
			throw new Exception();
		}
		if (source.getTypeMemberImplementations().size() != destination.getTypeMemberImplementations().size()) {
			throw new Exception();
		}

		command.append(new SetCommand(AdapterFactoryEditingDomain.getEditingDomainFor(source), destination,
				ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__ABSTRACT_INITIALIZATION_DATA,
				EcoreUtil.copy(source.getAbstractInitializationData())));

		Iterator<TypeMemberImplementation> sourceImplementations = source.getTypeMemberImplementations().iterator();
		Iterator<TypeMemberImplementation> destinationImplementations = destination.getTypeMemberImplementations()
				.iterator();
		while (sourceImplementations.hasNext()) {
			copyInitializationData(sourceImplementations.next(), destinationImplementations.next(), command);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void initSession() {
		ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain().getCommandStack()
				.execute(new RecordingCommand(ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain()) {
					@Override
					protected void doExecute() {
						ApogyCoreInvocatorFacade.INSTANCE.initVariableInstances();
					}
				});

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void disposeSession() {
		ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain().getCommandStack()
				.execute(new RecordingCommand(ApogyCommonEmfTransactionFacade.INSTANCE.getDefaultEditingDomain()) {
					@Override
					protected void doExecute() {
						ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances();
					}
				});
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void addVariable(VariablesList variablesList, Variable variable) {
		TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain
				.getEditingDomainFor(variablesList);
		domain.getCommandStack().execute(new RecordingCommand(domain) {

			@Override
			protected void doExecute() {
				ApogyCoreInvocatorFacade.INSTANCE.addVariable(variablesList, variable);
			}
		});
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void deleteVariables(VariablesList variablesList, List<Variable> variables) {
		String variablesToDeleteMessage = ApogyCommonEMFFacade.INSTANCE.toString(variables, ", ");

		MessageDialog dialog = new MessageDialog(null, "Delete the selected variables", null,
				"Are you sure to delete these variables: " + variablesToDeleteMessage, MessageDialog.QUESTION,
				new String[] { "Yes", "No" }, 1);
		int result = dialog.open();
		if (result == 0) {

			TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain
					.getEditingDomainFor(variablesList);
			domain.getCommandStack().execute(new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					for (Variable variable : variables) {
						try {
							ApogyCoreInvocatorFacade.INSTANCE.deleteVariable(variablesList, variable);
						} catch (Exception e) {
							Logger.INSTANCE.log(Activator.ID,
									"Unable to delete the variable <" + variable.getName() + ">", EventSeverity.ERROR,
									e);
						}
					}
				}
			});
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setEOperationInitArguments(EOperation eOperation, OperationCall operationCall) {
		/** Create Arguments for each operation parameters. */
		List<Argument> arguments = new ArrayList<Argument>();
		for (EParameter parameter : eOperation.getEParameters()) {
			Argument argument = null;

			if (parameter.getEType() instanceof EEnum) {
				argument = ApogyCoreInvocatorFactory.eINSTANCE
						.createEEnumArgument();
				EEnum eEnum = (EEnum) parameter.getEType();
				((EEnumArgument) argument).setEEnum(eEnum);

				Enum<?> defaultValue = (Enum<?>) parameter.getEType()
						.getDefaultValue();
				((EEnumArgument) argument).setEEnumLiteral(eEnum
						.getEEnumLiteral(defaultValue.name()));
			} else if (parameter.getEType() instanceof EDataType) {
				
				Class<?> clazz = parameter.getEType().getInstanceClass();
				
				if (clazz.isAssignableFrom(boolean.class) || clazz.isAssignableFrom(Boolean.class)) {
					argument = ApogyCoreInvocatorFactory.eINSTANCE.createBooleanEDataTypeArgument();
				} else if (clazz.isAssignableFrom(Number.class) ||
						   clazz.isAssignableFrom(byte.class) || 
						   clazz.isAssignableFrom(short.class) ||
						   clazz.isAssignableFrom(int.class) ||
						   clazz.isAssignableFrom(long.class) ||
						   clazz.isAssignableFrom(float.class) ||
						   clazz.isAssignableFrom(double.class)){						
					argument = ApogyCoreInvocatorFactory.eINSTANCE.createNumericEDataTypeArgument();
				} else{
					argument = ApogyCoreInvocatorFactory.eINSTANCE.createStringEDataTypeArgument();	
					((StringEDataTypeArgument)argument).setValue("HELLO");
				}
				
				Object defaultValue = parameter.getEType()
						.getDefaultValue();

				if (defaultValue != null) {
					((EDataTypeArgument) argument).setValue(String
							.valueOf(defaultValue));
				}
			} else {
				argument = ApogyCoreInvocatorFactory.eINSTANCE
						.createEClassArgument();
			}
			arguments.add(argument);
		}

		/** Add arguments if there are parameters only. */
		if (!arguments.isEmpty()) {
			ArgumentsList argumentsList = ApogyCoreInvocatorFactory.eINSTANCE
					.createArgumentsList();
			argumentsList.getArguments().addAll(arguments);

			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(operationCall,
					ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST, argumentsList);
			// operationCall.setArgumentsList(argumentsList);
		} else {
			// Clear the list
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(operationCall,
					ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST, null);
			// operationCall.setArgumentsList(null);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT:
				try {
					copyInitializationData((Context)arguments.get(0), (Context)arguments.get(1));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND:
				try {
					copyInitializationData((AbstractTypeImplementation)arguments.get(0), (AbstractTypeImplementation)arguments.get(1), (CompoundCommand)arguments.get(2));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___INIT_SESSION:
				initSession();
				return null;
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___DISPOSE_SESSION:
				disposeSession();
				return null;
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___ADD_VARIABLE__VARIABLESLIST_VARIABLE:
				addVariable((VariablesList)arguments.get(0), (Variable)arguments.get(1));
				return null;
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___DELETE_VARIABLES__VARIABLESLIST_LIST:
				deleteVariables((VariablesList)arguments.get(0), (List<Variable>)arguments.get(1));
				return null;
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE___SET_EOPERATION_INIT_ARGUMENTS__EOPERATION_OPERATIONCALL:
				setEOperationInitArguments((EOperation)arguments.get(0), (OperationCall)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCoreInvocatorUIFacadeImpl
