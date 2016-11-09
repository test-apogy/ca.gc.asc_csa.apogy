package ca.gc.asc_csa.apogy.core.invocator;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage
 * @generated
 */
public interface ApogyCoreInvocatorFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  ApogyCoreInvocatorFactory eINSTANCE = ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreInvocatorFacade createApogyCoreInvocatorFacade();

		/**
	 * Returns a new object of class '<em>Invocator Session</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocator Session</em>'.
	 * @generated
	 */
  InvocatorSession createInvocatorSession();

  /**
	 * Returns a new object of class '<em>Environment</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Environment</em>'.
	 * @generated
	 */
  Environment createEnvironment();

  /**
	 * Returns a new object of class '<em>Data Products Lists Container</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Products Lists Container</em>'.
	 * @generated
	 */
  DataProductsListsContainer createDataProductsListsContainer();

  /**
	 * Returns a new object of class '<em>Data Products List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Products List</em>'.
	 * @generated
	 */
  DataProductsList createDataProductsList();

  /**
	 * Returns a new object of class '<em>Tools List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tools List</em>'.
	 * @generated
	 */
  ToolsList createToolsList();

  /**
	 * Returns a new object of class '<em>Local Types List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Types List</em>'.
	 * @generated
	 */
  LocalTypesList createLocalTypesList();

  /**
	 * Returns a new object of class '<em>Registered Types List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registered Types List</em>'.
	 * @generated
	 */
  RegisteredTypesList createRegisteredTypesList();

  /**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
  Type createType();

  /**
	 * Returns a new object of class '<em>Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Api Adapter</em>'.
	 * @generated
	 */
  TypeApiAdapter createTypeApiAdapter();

  /**
	 * Returns a new object of class '<em>Type Member</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Member</em>'.
	 * @generated
	 */
  TypeMember createTypeMember();

  /**
	 * Returns a new object of class '<em>Type Member Reference</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Member Reference</em>'.
	 * @generated
	 */
  TypeMemberReference createTypeMemberReference();

  /**
	 * Returns a new object of class '<em>Type Member Reference List Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Member Reference List Element</em>'.
	 * @generated
	 */
  TypeMemberReferenceListElement createTypeMemberReferenceListElement();

  /**
	 * Returns a new object of class '<em>Type Member Reference Tree Element</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Member Reference Tree Element</em>'.
	 * @generated
	 */
  TypeMemberReferenceTreeElement createTypeMemberReferenceTreeElement();

  /**
	 * Returns a new object of class '<em>Variables List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variables List</em>'.
	 * @generated
	 */
  VariablesList createVariablesList();

  /**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
  Variable createVariable();

  /**
	 * Returns a new object of class '<em>Contexts List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contexts List</em>'.
	 * @generated
	 */
  ContextsList createContextsList();

  /**
	 * Returns a new object of class '<em>Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context</em>'.
	 * @generated
	 */
	Context createContext();

		/**
	 * Returns a new object of class '<em>Variable Implementations List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Implementations List</em>'.
	 * @generated
	 */
  VariableImplementationsList createVariableImplementationsList();

  /**
	 * Returns a new object of class '<em>Initialization Data</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Initialization Data</em>'.
	 * @generated
	 */
  InitializationData createInitializationData();

  /**
	 * Returns a new object of class '<em>Variable Implementation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Implementation</em>'.
	 * @generated
	 */
  VariableImplementation createVariableImplementation();

  /**
	 * Returns a new object of class '<em>Type Member Implementation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Member Implementation</em>'.
	 * @generated
	 */
  TypeMemberImplementation createTypeMemberImplementation();

  /**
	 * Returns a new object of class '<em>Values List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Values List</em>'.
	 * @generated
	 */
  ValuesList createValuesList();

  /**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
  Value createValue();

  /**
	 * Returns a new object of class '<em>Programs List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programs List</em>'.
	 * @generated
	 */
  ProgramsList createProgramsList();

  /**
	 * Returns a new object of class '<em>Programs Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programs Group</em>'.
	 * @generated
	 */
	ProgramsGroup createProgramsGroup();

		/**
	 * Returns a new object of class '<em>Program Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Settings</em>'.
	 * @generated
	 */
	ProgramSettings createProgramSettings();

		/**
	 * Returns a new object of class '<em>Program Factories Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Factories Registry</em>'.
	 * @generated
	 */
	ProgramFactoriesRegistry createProgramFactoriesRegistry();

		/**
	 * Returns a new object of class '<em>Operation Calls List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Calls List</em>'.
	 * @generated
	 */
  OperationCallsList createOperationCallsList();

  /**
	 * Returns a new object of class '<em>Operation Calls List Factory</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Calls List Factory</em>'.
	 * @generated
	 */
	OperationCallsListFactory createOperationCallsListFactory();

		/**
	 * Returns a new object of class '<em>Variable Feature Reference</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Feature Reference</em>'.
	 * @generated
	 */
  VariableFeatureReference createVariableFeatureReference();

  /**
	 * Returns a new object of class '<em>Operation Call</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call</em>'.
	 * @generated
	 */
  OperationCall createOperationCall();

  /**
	 * Returns a new object of class '<em>Arguments List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arguments List</em>'.
	 * @generated
	 */
  ArgumentsList createArgumentsList();

  /**
	 * Returns a new object of class '<em>Boolean EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean EData Type Argument</em>'.
	 * @generated
	 */
	BooleanEDataTypeArgument createBooleanEDataTypeArgument();

		/**
	 * Returns a new object of class '<em>Numeric EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric EData Type Argument</em>'.
	 * @generated
	 */
	NumericEDataTypeArgument createNumericEDataTypeArgument();

		/**
	 * Returns a new object of class '<em>String EData Type Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String EData Type Argument</em>'.
	 * @generated
	 */
	StringEDataTypeArgument createStringEDataTypeArgument();

		/**
	 * Returns a new object of class '<em>EEnum Argument</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EEnum Argument</em>'.
	 * @generated
	 */
  EEnumArgument createEEnumArgument();

  /**
	 * Returns a new object of class '<em>EClass Argument</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>EClass Argument</em>'.
	 * @generated
	 */
  EClassArgument createEClassArgument();

  /**
	 * Returns a new object of class '<em>Program Runtimes List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Runtimes List</em>'.
	 * @generated
	 */
	ProgramRuntimesList createProgramRuntimesList();

		/**
	 * Returns a new object of class '<em>Operation Calls List Program Runtime</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Calls List Program Runtime</em>'.
	 * @generated
	 */
	OperationCallsListProgramRuntime createOperationCallsListProgramRuntime();

		/**
	 * Returns a new object of class '<em>Operation Call Results List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call Results List</em>'.
	 * @generated
	 */
  OperationCallResultsList createOperationCallResultsList();

  /**
	 * Returns a new object of class '<em>Operation Call Result</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call Result</em>'.
	 * @generated
	 */
  OperationCallResult createOperationCallResult();

  /**
	 * Returns a new object of class '<em>Exception Container</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exception Container</em>'.
	 * @generated
	 */
  ExceptionContainer createExceptionContainer();

  /**
	 * Returns a new object of class '<em>Attribute Result Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Result Value</em>'.
	 * @generated
	 */
  AttributeResultValue createAttributeResultValue();

  /**
	 * Returns a new object of class '<em>Attribute Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute Value</em>'.
	 * @generated
	 */
  AttributeValue createAttributeValue();

  /**
	 * Returns a new object of class '<em>Reference Result Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Result Value</em>'.
	 * @generated
	 */
  ReferenceResultValue createReferenceResultValue();

  /**
	 * Returns a new object of class '<em>Operation Call Results List Time Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation Call Results List Time Source</em>'.
	 * @generated
	 */
	OperationCallResultsListTimeSource createOperationCallResultsListTimeSource();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreInvocatorPackage getApogyCoreInvocatorPackage();

} //ApogyCoreInvocatorFactory
