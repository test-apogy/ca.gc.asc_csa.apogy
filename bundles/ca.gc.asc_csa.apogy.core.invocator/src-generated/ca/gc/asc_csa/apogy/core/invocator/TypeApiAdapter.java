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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Api Adapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class implements an adapter pattern that allows injection of specific behaviors
 * when actions are realized on {@link Type} instance. Developers may specialized certain
 * methods to provide custom implementation to address specific {@link Type} needs.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getInstance <em>Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeApiAdapter()
 * @model
 * @generated
 */
public interface TypeApiAdapter extends EObject
{

  /**
	 * Returns the value of the '<em><b>Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' reference.
	 * @see #setEnvironment(Environment)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeApiAdapter_Environment()
	 * @model transient="true"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getEnvironment <em>Environment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);

  /**
	 * Returns the value of the '<em><b>Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instance</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance</em>' reference.
	 * @see #setInstance(EObject)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeApiAdapter_Instance()
	 * @model transient="true"
	 * @generated
	 */
  EObject getInstance();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getInstance <em>Instance</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance</em>' reference.
	 * @see #getInstance()
	 * @generated
	 */
  void setInstance(EObject value);

  /**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Type)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeApiAdapter_ElementType()
	 * @model transient="true"
	 * @generated
	 */
  Type getElementType();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
  void setElementType(Type value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializes and sets the adapter attributes.
	 * @param environment Reference to the environment.
	 * @param elementType Reference to the {@link Type}.
	 * @param instance Reference to the object instance.
	 * <!-- end-model-doc -->
	 * @model environmentUnique="false" elementTypeUnique="false" instanceUnique="false"
	 * @generated
	 */
  void init(Environment environment, Type elementType, EObject instance);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the {@link Type} instance state data required to initialize the model.
	 * {@link AbstractInitialization} must be specialized to address {@link TypeApiAdapter} needs.
	 * @param initializationData Reference to the data to apply.
	 * <!-- end-model-doc -->
	 * @model initializationDataUnique="false"
	 * @generated
	 */
  void apply(AbstractInitializationData initializationData);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create a new instance of initializationData.  {@link AbstractInitializationData} must be specialized
	 * to address {@link TypeApiAdapter} needs.
	 * @return Reference to the data container instance.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  AbstractInitializationData createInitializationData();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collects the {@link Type} instance state.  {@link AbstractInitializationData} must be specialized
	 * to address {@link TypeApiAdapter} needs.
	 * @param data Reference to the data container.
	 * <!-- end-model-doc -->
	 * @model dataUnique="false"
	 * @generated
	 */
  void collect(AbstractInitializationData data);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and returns a result container. Normally this method only creates the container.
	 * This method must be overwritten and synchronized with
	 * {@link #createResult(OperationCall, long, Object, Exception)}.
	 * @param operationCall Reference to the operation call.
	 * @return Reference to the new result.
	 * <!-- end-model-doc -->
	 * @model unique="false" operationCallUnique="false"
	 * @generated
	 */
  OperationCallResult createResult(OperationCall operationCall);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates, populates and returns a result container. This method invokes {@link #createResult(OperationCall)}.
	 * Ensure super().{@link #createResult(OperationCall operationCall, long invocationTime, Object resultValue, Exception exception)} is called
	 * if this method is overwritten.
	 * @param operationCall Reference to the operation call.
	 * @param invocationTime Time when the call was submitted.
	 * @param resultValue Value returned by the operation call.
	 * @exception Reference to the exception if one exception was raised during the invocation.
	 * @return Reference to the new result.
	 * <!-- end-model-doc -->
	 * @model unique="false" operationCallUnique="false" invocationTimeUnique="false" resultValueUnique="false" exceptionDataType="ca.gc.asc_csa.apogy.common.emf.Exception" exceptionUnique="false"
	 * @generated
	 */
  OperationCallResult createResult(OperationCall operationCall, long invocationTime, Object resultValue, Exception exception);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Invokes the operation call and stores the result if required.
	 * @param instance Object onto which the operation is to be called.
	 * @param operationCall Reference to the operation call.
	 * @param saveResult If true then results will be saved in the {@link DataProductsList}.
	 * @return Reference to the result.
	 * <!-- end-model-doc -->
	 * @model unique="false" instanceUnique="false" operationCallUnique="false" saveResultUnique="false"
	 * @generated
	 */
	OperationCallResult invoke(EObject instance, OperationCall operationCall, boolean saveResult);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method is called when the adapter is disposed.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void dispose();
} // TypeApiAdapter
