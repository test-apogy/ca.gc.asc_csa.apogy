package ca.gc.asc_csa.apogy.core.invocator.impl;
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
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier;
import ca.gc.asc_csa.apogy.common.emf.AbstractRootNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AbstractType;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.AttributeResultValue;
import ca.gc.asc_csa.apogy.core.invocator.AttributeValue;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.IVariableListener;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.LocalTypesList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ReferenceResultValue;
import ca.gc.asc_csa.apogy.core.invocator.ScriptBasedProgram;
import ca.gc.asc_csa.apogy.core.invocator.StringEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;
import ca.gc.asc_csa.apogy.core.invocator.VariableListenerEventType;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.delegates.InvocatorDelegate;
import ca.gc.asc_csa.apogy.core.invocator.delegates.InvocatorDelegateRegistry;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl#getInitVariableInstancesDate <em>Init Variable Instances Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.ApogyCoreInvocatorFacadeImpl#getActiveInvocatorSession <em>Active Invocator Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApogyCoreInvocatorFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreInvocatorFacade {
	/**
	 * The default value of the '{@link #getInitVariableInstancesDate() <em>Init Variable Instances Date</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getInitVariableInstancesDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date INIT_VARIABLE_INSTANCES_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getInitVariableInstancesDate() <em>Init Variable Instances Date</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getInitVariableInstancesDate()
	 * @generated
	 * @ordered
	 */
	protected Date initVariableInstancesDate = INIT_VARIABLE_INSTANCES_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getActiveInvocatorSession() <em>Active Invocator Session</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveInvocatorSession()
	 * @generated
	 * @ordered
	 */
	protected InvocatorSession activeInvocatorSession;
	private HashSet<IVariableListener> variableListenersSet;
	private static ApogyCoreInvocatorFacade instance = null;

	public static ApogyCoreInvocatorFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCoreInvocatorFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getInitVariableInstancesDate() {
		return initVariableInstancesDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitVariableInstancesDate(Date newInitVariableInstancesDate) {
		Date oldInitVariableInstancesDate = initVariableInstancesDate;
		initVariableInstancesDate = newInitVariableInstancesDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE, oldInitVariableInstancesDate, initVariableInstancesDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession getActiveInvocatorSession() {
		if (activeInvocatorSession != null && activeInvocatorSession.eIsProxy()) {
			InternalEObject oldActiveInvocatorSession = (InternalEObject)activeInvocatorSession;
			activeInvocatorSession = (InvocatorSession)eResolveProxy(oldActiveInvocatorSession);
			if (activeInvocatorSession != oldActiveInvocatorSession) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION, oldActiveInvocatorSession, activeInvocatorSession));
			}
		}
		return activeInvocatorSession;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSession basicGetActiveInvocatorSession() {
		return activeInvocatorSession;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveInvocatorSession(InvocatorSession newActiveInvocatorSession) {
		InvocatorSession oldActiveInvocatorSession = activeInvocatorSession;
		activeInvocatorSession = newActiveInvocatorSession;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION, oldActiveInvocatorSession, activeInvocatorSession));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCallResult exec(OperationCall operationCall, boolean saveResult) {
		/**
		 * 
		 * Select the proper delegate.
		 * 
		 */
		Variable variable = operationCall.getVariable();
		Type variableType = variable.getVariableType();
		if (operationCall.getTypeMemberReferenceListElement() != null) {
			variableType = operationCall.getTypeMemberReferenceListElement().getLeafElement().getTypeMember()
					.getMemberType();
		}

		InvocatorDelegate delegate = InvocatorDelegateRegistry.getInstance()
				.getInvocatorDelegate(variableType.getClass());

		/**
		 * 
		 * Finds the object instance on which to call the operation.
		 * 
		 */
		EObject instance = getInstance(operationCall);

		/**
		 * 
		 * Invoke the operation.
		 * 
		 */
		if (instance == null) {
			Logger.INSTANCE.log(Activator.ID, this, "The instance (or sub-instance) of variable <"
					+ operationCall.getVariable().getName() + "> is null !", EventSeverity.ERROR);
		} else {
			// If no delegate, fail.
			if (delegate == null) {
				Logger.INSTANCE.log(Activator.ID, this,
						"Cannot find an InvocatorDelegate for instance of type <" + instance.getClass() + "> !",
						EventSeverity.ERROR);
			} else {
				TransactionalEditingDomain domain = (TransactionalEditingDomain) AdapterFactoryEditingDomain
						.getEditingDomainFor(operationCall);
				RecordingCommand command = new RecordingCommand(domain) {
					OperationCallResult result = null;
					@Override
					protected void doExecute() {
						result = delegate.execute(instance, operationCall, saveResult);
					}
					@Override
					public Collection<?> getResult() {
						OperationCallResult[] results = {result};
						return Arrays.asList(results);
					}
				};
				domain.getCommandStack().execute(command);
				return (OperationCallResult)command.getResult().iterator().next();
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCallResult exec(OperationCall operationCall) {
		return exec(operationCall, true);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void exec(OperationCallsList operationCallsList) {
		for (OperationCall operationCall : operationCallsList.getOperationCalls()) {
			exec(operationCall);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Object getValue(OperationCallResult operationCallResult) {
		Object value = null;
		AbstractResultValue abstractValue = operationCallResult.getResultValue();

		if (abstractValue instanceof AttributeResultValue) {
			AttributeResultValue attributeResultValue = (AttributeResultValue) abstractValue;
			if (attributeResultValue.getValue() != null) {
				value = attributeResultValue.getValue().getObject();
			}
		} else if (abstractValue instanceof ReferenceResultValue) {
			value = ((ReferenceResultValue) abstractValue).getValue();
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractResultValue createAbstractResultValue(Object value) {
		if (value instanceof EObject && value != null) {
			ReferenceResultValue resultValue = ApogyCoreInvocatorFactory.eINSTANCE.createReferenceResultValue();
			resultValue.setValue((EObject) value);
			return resultValue;
		} else if (value instanceof Object || value == null) {
			AttributeValue attributeValue = ApogyCoreInvocatorFactory.eINSTANCE.createAttributeValue();
			attributeValue.setObject(value);
			AttributeResultValue resultValue = ApogyCoreInvocatorFactory.eINSTANCE.createAttributeResultValue();
			resultValue.setValue(attributeValue);
			return resultValue;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getInstance(Variable variable) {
		EObject eObject = null;

		Environment environment = variable.getEnvironment();
		if (environment != null) {
			Context context = environment.getActiveContext();
			if (context != null) {
				VariableImplementation variableImplementation = context.getVariableImplementationsList()
						.getVariableImplementation(variable);

				eObject = variableImplementation == null ? null : variableImplementation.getInstance();
			}
		}

		return eObject;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EClass getInstanceClass(Variable variable) {
		return variable.getVariableType().getInterfaceClass();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TypeApiAdapter getTypeApiAdapter(VariableFeatureReference variableFeatureReference) {
		TypeApiAdapter typeApiAdapter = null;

		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		if (variable != null && environment != null && context != null) {
			if (variableFeatureReference.getFeatureRoot() == null
					&& variableFeatureReference.getTypeMemberReferenceListElement() == null) {
				typeApiAdapter = getTypeApiAdapterForNullFeatureRootAndNullTypeMember(variableFeatureReference);
			} else if (variableFeatureReference.getFeatureRoot() != null
					&& variableFeatureReference.getTypeMemberReferenceListElement() == null) {
				typeApiAdapter = getTypeApiAdapterForFeatureRootAndNullTypeMember(variableFeatureReference);
			} else if (variableFeatureReference.getFeatureRoot() == null
					&& variableFeatureReference.getTypeMemberReferenceListElement() != null) {
				typeApiAdapter = getTypeApiAdapterForNullFeatureRootAndTypeMember(variableFeatureReference);
			} else if (variableFeatureReference.getFeatureRoot() != null
					&& variableFeatureReference.getTypeMemberReferenceListElement() != null) {
				typeApiAdapter = getTypeApiAdapterForFeatureRootAndTypeMember(variableFeatureReference);
			}
		}

		return typeApiAdapter;
	}

	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having both
	 * FeatureRoot and TypeMemberReferenceListElement being null. This is the
	 * case where the VariableFeatureReference is referring only to the
	 * variable.
	 * 
	 * @param variableFeatureReference
	 *            The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForNullFeatureRootAndNullTypeMember(
			VariableFeatureReference variableFeatureReference) {
		TypeApiAdapter typeApiAdapter = null;

		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		try {
			typeApiAdapter = context.getVariableImplementationsList().getVariableImplementation(variable)
					.getAdapterInstance();
		} catch (Throwable t) {
		}

		return typeApiAdapter;
	}

	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having the
	 * TypeMemberReferenceListElement being null. This is the case where the
	 * VariableFeatureReference is referring to a feature of the variable.
	 * 
	 * @param variableFeatureReference
	 *            The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForFeatureRootAndNullTypeMember(
			VariableFeatureReference variableFeatureReference) {
		TypeApiAdapter typeApiAdapter = null;

		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		// Set the typeApi initially to the one associated with the variable.
		typeApiAdapter = context.getVariableImplementationsList().getVariableImplementation(variable)
				.getAdapterInstance();

		// Sets source object to variable instance as default.
		EObject sourceEObject = (EObject) getInstance(variable);

		// Goes through the list of features.
		AbstractTypeImplementation rootATI = context.getVariableImplementationsList()
				.getVariableImplementation(variable);

		// Traverse the Feature List until no API is found.
		ListRootNode rootNode = variableFeatureReference.getFeatureRoot();
		AbstractFeatureListNode currentNode = rootNode;

		while (currentNode != null) {
			Object object = ApogyCommonEMFFacade.INSTANCE.resolve(sourceEObject, currentNode);

			if (object instanceof EObject) {
				EObject eObject = (EObject) object;

				// Check to see if the eObject has an TypeApiAdapter provided
				// for it.
				Iterator<TypeMemberImplementation> it = rootATI.getTypeMemberImplementations().iterator();
				while (it.hasNext()) {
					AbstractTypeImplementation ati = it.next();
					if (ati.getInstance() == eObject) {
						if (ati.getAdapterInstance() != null) {
							typeApiAdapter = ati.getAdapterInstance();
						}
					}
				}
			}
			currentNode = currentNode.getChild();
		}

		return typeApiAdapter;
	}

	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having a null
	 * FeatureRoot and a not null TypeMemberReferenceListElement. This is the
	 * case where the VariableFeatureReference is referring only to a variable's
	 * type member.
	 * 
	 * @param variableFeatureReference
	 *            The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForNullFeatureRootAndTypeMember(
			VariableFeatureReference variableFeatureReference) {
		TypeApiAdapter typeApiAdapter = null;

		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference
				.getTypeMemberReferenceListElement();

		// Goes down the list of typeMember, keeping the most specific
		// TypeApiAdapter.
		TypeMemberImplementation currentTypeMemberImplementation = null;
		if (context != null) {
			VariableImplementationsList variableImplementationsList = context.getVariableImplementationsList();
			if (variableImplementationsList != null) {
				VariableImplementation variableImplementation = variableImplementationsList
						.getVariableImplementation(variable);
				if (variableImplementation != null) {
					currentTypeMemberImplementation = variableImplementation
							.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());
				}
			}
		}
		// TypeMemberImplementation currentTypeMemberImplementation = context
		// .getVariableImplementationsList()
		// .getVariableImplementation(variable)
		// .getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

		if (currentTypeMemberImplementation != null) {
			TypeApiAdapter currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
			if (currentTypeApiAdapter != null) {
				typeApiAdapter = currentTypeApiAdapter;
			}

			while (!currentTypeMemberReferenceListElement.isLeaf()) {
				currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement.getChild();
				currentTypeMemberImplementation = currentTypeMemberImplementation
						.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

				currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
				if (currentTypeApiAdapter != null) {
					typeApiAdapter = currentTypeApiAdapter;
				}
			}
		}
		return typeApiAdapter;
	}

	/**
	 * Finds the TypeApiAdapter for a VariableFeatureReference having both a
	 * FeatureRoot and a TypeMemberReferenceListElement defined. This is the
	 * case where the VariableFeatureReference is referring to a variable's type
	 * member feature.
	 * 
	 * @param variableFeatureReference
	 *            The Variable Feature.
	 * @return The TypeApiAdapter to use, null if none is found.
	 */
	private TypeApiAdapter getTypeApiAdapterForFeatureRootAndTypeMember(
			VariableFeatureReference variableFeatureReference) {
		TypeApiAdapter typeApiAdapter = null;

		Variable variable = variableFeatureReference.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		EObject sourceEObject = null;

		// First, finds the TypeApiAdapter referenced by the
		// TypeMemberReferenceList.

		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference
				.getTypeMemberReferenceListElement();

		// Goes down the list of typeMember, keeping the most specific
		// TypeApiAdapter.
		TypeMemberImplementation currentTypeMemberImplementation = context.getVariableImplementationsList()
				.getVariableImplementation(variable)
				.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

		TypeApiAdapter currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
		if (currentTypeApiAdapter != null) {
			typeApiAdapter = currentTypeApiAdapter;
			sourceEObject = typeApiAdapter.getInstance();
		}

		while (!currentTypeMemberReferenceListElement.isLeaf()) {
			currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement.getChild();
			currentTypeMemberImplementation = currentTypeMemberImplementation
					.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

			currentTypeApiAdapter = currentTypeMemberImplementation.getAdapterInstance();
			if (currentTypeApiAdapter != null) {
				typeApiAdapter = currentTypeApiAdapter;

				sourceEObject = typeApiAdapter.getInstance();
			}
		}

		// Then finds the TypeApiAdapter associated with the source object.
		if (sourceEObject != null) {
			// Goes through the list of features.
			AbstractTypeImplementation rootATI = context.getVariableImplementationsList()
					.getVariableImplementation(variable);

			// Traverse the Feature List until no API is found.
			ListRootNode rootNode = variableFeatureReference.getFeatureRoot();
			AbstractFeatureListNode currentNode = rootNode;

			while (currentNode != null) {
				Object object = ApogyCommonEMFFacade.INSTANCE.resolve(sourceEObject, currentNode);

				if (object instanceof EObject) {
					EObject eObject = (EObject) object;

					// Check to see if the eObject has an TypeApiAdapter
					// provided for it.
					Iterator<TypeMemberImplementation> it = rootATI.getTypeMemberImplementations().iterator();
					while (it.hasNext()) {
						AbstractTypeImplementation ati = it.next();
						if (ati.getInstance() == eObject) {
							if (ati.getAdapterInstance() != null) {
								typeApiAdapter = ati.getAdapterInstance();
							}
						}
					}
				}
				currentNode = currentNode.getChild();
			}
		}

		return typeApiAdapter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getInstance(VariableFeatureReference variableFeatureReference) {
		EObject eObjectInstance = null;

		if (variableFeatureReference.getVariable() != null) {
			Variable variable = variableFeatureReference.getVariable();
			if (variableFeatureReference.getTypeMemberReferenceListElement() != null) {
				eObjectInstance = getTypeMemberInstance(variableFeatureReference);
			} else {
				eObjectInstance = getInstance(variable);
			}

			if (eObjectInstance != null) {
				if (variableFeatureReference.getFeatureRoot() != null) {
					Object tmpObject = ApogyCommonEMFFacade.INSTANCE.resolve(eObjectInstance,
							ApogyCommonEMFFacade.INSTANCE.getLeaf(variableFeatureReference.getFeatureRoot()));

					if (tmpObject instanceof EObject) {
						eObjectInstance = (EObject) tmpObject;
					}
				}
			}
		}

		return eObjectInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EObject getTypeMemberInstance(VariableFeatureReference variableFeatureReference) {
		EObject typeMemberInstance = null;

		if (variableFeatureReference.getTypeMemberReferenceListElement() != null) {
			Variable variable = variableFeatureReference.getVariable();
			TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference
					.getTypeMemberReferenceListElement();

			Environment environment = variable.getEnvironment();
			if (environment != null) {
				Context context = environment.getActiveContext();
				if (context != null) {
					VariableImplementationsList variableImplementationsList = context.getVariableImplementationsList();

					if (variableImplementationsList != null) {
						VariableImplementation variableImplementation = variableImplementationsList
								.getVariableImplementation(variable);
						if (variableImplementation != null && currentTypeMemberReferenceListElement != null) {
							TypeMemberImplementation currentTypeMemberImplementation = variableImplementation
									.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

							while (!currentTypeMemberReferenceListElement.isLeaf()) {
								currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement
										.getChild();
								currentTypeMemberImplementation = currentTypeMemberImplementation
										.getTypeMemberImplementation(
												currentTypeMemberReferenceListElement.getTypeMember());
							}
							typeMemberInstance = currentTypeMemberImplementation.getInstance();
						}
					}
				}
			}
		}

		return typeMemberInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Object getEMFFeatureValue(VariableFeatureReference variableFeatureReference) {
		Object featureValue = null;

		if (variableFeatureReference.getVariable() != null && variableFeatureReference.getFeatureRoot() != null) {
			Variable variable = variableFeatureReference.getVariable();
			EObject eObject = getTypeMemberInstance(variableFeatureReference);
			if (eObject == null) {
				eObject = getInstance(variable);
			}

			if (eObject != null) {
				featureValue = ApogyCommonEMFFacade.INSTANCE.resolve(eObject,
						ApogyCommonEMFFacade.INSTANCE.getLeaf(variableFeatureReference.getFeatureRoot()));
			}
		}

		return featureValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public EClass getInstanceClass(VariableFeatureReference variableFeatureReference) {
		EClass eClass = null;
		Variable variable = variableFeatureReference.getVariable();
		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = variableFeatureReference
				.getTypeMemberReferenceListElement();
		AbstractFeatureListNode featureNode = ApogyCommonEMFFacade.INSTANCE
				.getLeaf(variableFeatureReference.getFeatureRoot());

		if (featureNode != null && featureNode instanceof AbstractFeatureSpecifier) {
			AbstractFeatureSpecifier featureSpecifier = (AbstractFeatureSpecifier) featureNode;
			EClassifier eClassifier = featureSpecifier.getStructuralFeature().getEType();
			if (eClassifier instanceof EClass) {
				eClass = (EClass) eClassifier;
			}
		}

		if (eClass == null && currentTypeMemberReferenceListElement != null
				&& currentTypeMemberReferenceListElement.getLeafElement() != null
				&& currentTypeMemberReferenceListElement.getLeafElement().getTypeMember() != null
				&& currentTypeMemberReferenceListElement.getLeafElement().getTypeMember().getMemberType() != null) {
			eClass = currentTypeMemberReferenceListElement.getLeafElement().getTypeMember().getMemberType()
					.getInterfaceClass();
		}

		if (eClass == null) {
			eClass = getInstanceClass(variable);
		}

		return eClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(OperationCall operationCall) {
		AbstractTypeImplementation result = null;

		Variable variable = operationCall.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		TypeMemberReferenceListElement currentTypeMemberReferenceListElement = operationCall
				.getTypeMemberReferenceListElement();

		// If not Type Member is defined.
		if (currentTypeMemberReferenceListElement == null) {
			if (operationCall.getFeatureRoot() != null) {
				AbstractTypeImplementation ati = getAbstractTypeImplementationForTypeAttribute(operationCall);

				if (ati != null)
					return ati;
			}
			result = context.getVariableImplementationsList().getVariableImplementation(variable);
		} else {
			/* Get the TypeMemberImplementation. */
			TypeMemberImplementation currentTypeMemberImplementation = context.getVariableImplementationsList()
					.getVariableImplementation(variable)
					.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());

			while (!currentTypeMemberReferenceListElement.isLeaf()) {
				currentTypeMemberReferenceListElement = currentTypeMemberReferenceListElement.getChild();
				currentTypeMemberImplementation = currentTypeMemberImplementation
						.getTypeMemberImplementation(currentTypeMemberReferenceListElement.getTypeMember());
			}
			result = currentTypeMemberImplementation;
		}
		return result;
	}

	/**
	 * Attempts to find an AbstractTypeImplementation associated with a
	 * specified OperationCall that target an attribute of a type.
	 * 
	 * @param operationCall
	 *            The OperationCall.
	 * @return The AbstractTypeImplementation, null if none is found.
	 */
	private AbstractTypeImplementation getAbstractTypeImplementationForTypeAttribute(OperationCall operationCall) {
		Variable variable = operationCall.getVariable();
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		// Initialize the result with the AbstractTypeImplementation associated
		// with the variable.
		AbstractTypeImplementation result = context.getVariableImplementationsList()
				.getVariableImplementation(variable);

		// Gets the source EObject
		EObject source = (EObject) getInstance(variable);

		// Traverse the Feature List until no API is found.
		ListRootNode rootNode = operationCall.getFeatureRoot();
		AbstractFeatureListNode currentNode = rootNode;
		VariableImplementation vi = context.getVariableImplementationsList().getVariableImplementation(variable);

		while (currentNode != null) {
			Object object = ApogyCommonEMFFacade.INSTANCE.resolve(source, currentNode);

			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				AbstractTypeImplementation ati = findAbstractTypeImplementation(vi, eObject);
				if (ati != null)
					result = ati;
			}

			currentNode = currentNode.getChild();
		}

		return result;
	}

	/**
	 * Attempts to find an AbstractTypeImplementation associated with a
	 * specified EObject instance.
	 * 
	 * @param typeImplementation
	 *            The root typeImplementation.
	 * @param eObjectInstance
	 *            The EObject instance.
	 * @return The AbstractTypeImplementation, null if none is found.
	 */
	protected AbstractTypeImplementation findAbstractTypeImplementation(AbstractTypeImplementation typeImplementation,
			final EObject eObjectInstance) {
		if (typeImplementation.getInstance() == eObjectInstance) {
			return typeImplementation;
		} else {
			AbstractTypeImplementation result = null;
			Iterator<TypeMemberImplementation> it = typeImplementation.getTypeMemberImplementations().iterator();
			while (result == null && it.hasNext()) {
				AbstractTypeImplementation ti = it.next();

				result = findAbstractTypeImplementation(ti, eObjectInstance);
			}
			return result;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(Variable variable, AbstractType elementType) {
		AbstractTypeImplementation result = null;
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();

		VariableImplementation variableImplementation = context.getVariableImplementationsList()
				.getVariableImplementation(variable);

		if (variableImplementation.getHandlingType() == elementType) {
			result = variableImplementation;
		} else {
			result = getTypeMemberImplementation(variableImplementation.getTypeMemberImplementations().iterator(),
					elementType);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(Variable variable) {
		Environment environment = variable.getEnvironment();
		Context context = environment.getActiveContext();
		return context.getVariableImplementationsList().getVariableImplementation(variable);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<Variable> getVariableByName(InvocatorSession session, String name) {
		List<Variable> result = new ArrayList<Variable>();

		Environment environment = session.getEnvironment();
		if (environment != null) {
			VariablesList variablesList = environment.getVariablesList();
			if (variablesList != null) {
				for (Variable variable : variablesList.getVariables()) {
					if (variable.getName().equals(name)) {
						result.add(variable);
					}
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Variable getVariableByName(String name) {
		Variable variable = null;

		InvocatorSession session = getActiveInvocatorSession();
		if (session != null) {
			Iterator<Variable> variables = session.getEnvironment().getVariablesList().getVariables().iterator();
			while (variables.hasNext() && variable == null) {
				Variable current = variables.next();
				if (current.getName().equals(name)) {
					variable = current;
				}
			}
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TypeMemberReferenceListElement createTypeMemberReferences(TypeMember[] typeMembers) {
		TypeMemberReferenceListElement currentElement = null;
		for (int i = 0; i < typeMembers.length; i++) {
			TypeMemberReferenceListElement newElement = ApogyCoreInvocatorFactory.eINSTANCE
					.createTypeMemberReferenceListElement();
			newElement.setTypeMember(typeMembers[i]);
			if (currentElement != null) {
				currentElement.setChild(newElement);
			}
			currentElement = newElement;
		}
		return currentElement.getRootElement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractTypeImplementation getTypeImplementation(Environment environment, String fullyQualifiedName) {
		AbstractTypeImplementation result = null;
		String[] tokens = fullyQualifiedName.split("\\.");

		// Get the variable first.
		VariableImplementation variableImplementation = null;
		if (environment.getActiveContext() != null) {
			VariableImplementationsList variableImplementationsList = environment.getActiveContext()
					.getVariableImplementationsList();
			if (variableImplementationsList != null) {
				String variableName = tokens.length == 0 ? fullyQualifiedName : tokens[0];
				variableImplementation = variableImplementationsList.getVariableImplementation(variableName);
			}
		}

		// If user specified the variable and it is found then return the
		// result.
		if (variableImplementation != null && tokens.length == 0) {
			result = variableImplementation;
		} else {
			// Search recursively the tokens.
			int tokenCounter = 1; // 0 means the variable.
			AbstractTypeImplementation currentTypeImplementation = variableImplementation;
			while (tokenCounter < tokens.length && currentTypeImplementation != null) {
				currentTypeImplementation = currentTypeImplementation.getTypeMemberImplementation(tokens[tokenCounter]);
				tokenCounter++;
			}

			if (currentTypeImplementation != null && tokenCounter == tokens.length) {
				result = currentTypeImplementation;
			}
		}

		return result;
	}

	protected TypeMemberImplementation getTypeMemberImplementation(
			Iterator<TypeMemberImplementation> typeMemberImplementations, AbstractType elementType) {
		TypeMemberImplementation result = null;

		while (typeMemberImplementations.hasNext() && result == null) {
			TypeMemberImplementation typeMemberImplementation = typeMemberImplementations.next();
			if (typeMemberImplementation.getTypeMember() == elementType) {
				result = typeMemberImplementation;
			} else {
				result = getTypeMemberImplementation(typeMemberImplementation.getTypeMemberImplementations().iterator(),
						elementType);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getFullyQualifiedName(TypeMemberReferenceTreeElement typeMemberReferenceTreeElement) {
		if (typeMemberReferenceTreeElement != null) {
			String fullyQualifiedName = new String();
			List<TypeMemberReferenceTreeElement> lineage = new ArrayList<TypeMemberReferenceTreeElement>();

			TypeMemberReferenceTreeElement t = typeMemberReferenceTreeElement;
			while (t != null) {
				lineage.add(0, t);
				t = t.getParent();
			}

			Iterator<TypeMemberReferenceTreeElement> it = lineage.iterator();
			while (it.hasNext()) {
				TypeMemberReferenceTreeElement element = it.next();
				fullyQualifiedName += element.getTypeMember().getName();
				if (it.hasNext())
					fullyQualifiedName += ".";
			}

			return fullyQualifiedName;
		} else {
			return null;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getFullyQualifiedName(AbstractFeatureNode abstractFeatureNode) {
		if (abstractFeatureNode != null) {
			String fullyQualifiedName = new String();
			AbstractRootNode root = ApogyCommonEMFFacade.INSTANCE.getFeatureRoot(abstractFeatureNode);

			if (root.eContainer() instanceof TypeMemberReferenceTreeElement) {
				TypeMemberReferenceTreeElement typeMemberReferenceTreeElement = (TypeMemberReferenceTreeElement) root
						.eContainer();
				fullyQualifiedName = getFullyQualifiedName(typeMemberReferenceTreeElement);
				fullyQualifiedName += "." + ApogyCommonEMFFacade.INSTANCE.getAncestriesString(abstractFeatureNode);
			}

			return fullyQualifiedName;
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<TypeMemberImplementation> createTypeMemberImplementations(Type variableType) {
		List<TypeMemberImplementation> typeMemberImplementations = new ArrayList<TypeMemberImplementation>();

		Iterator<TypeMember> typeMembers = variableType.getMembers().iterator();
		while (typeMembers.hasNext()) {
			TypeMember typeMember = typeMembers.next();
			TypeMemberImplementation typeMemberImplementation = ApogyCoreInvocatorFactory.eINSTANCE
					.createTypeMemberImplementation();
			typeMemberImplementation.setTypeMember(typeMember);
			
			List<EClass> eClasses = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(typeMemberImplementation.getHandlingType().getInterfaceClass());
			if (!eClasses.isEmpty()){
				typeMemberImplementation.setImplementationClass(eClasses.get(0));
			}

			/** Check sub-type members. */
			List<TypeMemberImplementation> subTypeMemberImplementations = createTypeMemberImplementations(
					typeMember.getMemberType());
			if (!subTypeMemberImplementations.isEmpty()) {
				typeMemberImplementation.getTypeMemberImplementations().addAll(subTypeMemberImplementations);
			}

			typeMemberImplementations.add(typeMemberImplementation);
		}
		return typeMemberImplementations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void initVariableInstances() {
		disposeVariableInstances();		
		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null){
			Environment environment = 
					ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment();
			Iterator<Variable> variables = environment.getVariablesList().getVariables().iterator();

			while (variables.hasNext()) {
				Variable variable = variables.next();
				InvocatorDelegate invocatorDelegate = InvocatorDelegateRegistry.getInstance()
						.getInvocatorDelegate(variable.getVariableType().getClass());

				invocatorDelegate.newInstance(environment, variable);

				/* Notifies the listener a new instance has been instantiated. */
				notifyVariableListeners(variable, VariableListenerEventType.NEW);
			}

			/** Adjust the creation and disposal dates. */
			Date date = new Date(System.currentTimeMillis());
			environment.getActiveContext().setInstancesCreationDate(date);
			setInitVariableInstancesDate(date);
			environment.getActiveContext().setInstancesDisposalDate(null);

			/* Variables are instantiated. */
			environment.getActiveContext().setVariablesInstantiated(true);
			
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void disposeVariableInstances() {
		if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null){
			Environment environment = 
					ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment();
			
			Iterator<Variable> variables = environment.getVariablesList().getVariables().iterator();

			while (variables.hasNext()) {
				Variable variable = variables.next();
				InvocatorDelegate invocatorDelegate = InvocatorDelegateRegistry.getInstance()
						.getInvocatorDelegate(variable.getVariableType().getClass());

				invocatorDelegate.dispose(environment, variable);

				/* Notifies the listener a new instance has been cleared. */
				notifyVariableListeners(variable, VariableListenerEventType.CLEAR);
			}

			environment.getActiveContext().setInstancesDisposalDate(new Date());

			/* Variables are disposed. */
			environment.getActiveContext().setVariablesInstantiated(false);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCall getOperationCallContainer(TypeMemberReferenceListElement typeMemberReferenceListElement) {
		OperationCall operationCall = null;
		if (typeMemberReferenceListElement.isRoot()) {
			EObject container = typeMemberReferenceListElement.eContainer();
			if (container != null & container instanceof OperationCall) {
				operationCall = (OperationCall) container;
			}
		}

		return operationCall;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void applyInitializationData(Environment environment) {
		for (Variable variable : environment.getVariablesList().getVariables()) {
			applyInitializationData(variable);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void collectInitializationData(Environment environment) {
		for (Variable variable : environment.getVariablesList().getVariables()) {
			collectInitializationData(variable);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void applyInitializationData(Variable variable) {
		InvocatorDelegate delegate = InvocatorDelegateRegistry.getInstance()
				.getInvocatorDelegate(variable.getVariableType().getClass());

		// If no delegate, fail.
		if (delegate == null) {
			Logger.INSTANCE.log(Activator.ID, this,
					"Cannot find an InvocatorDelegate for instance of type <" + instance.getClass() + "> !",
					EventSeverity.ERROR);
		} else {
			delegate.applyInitializationData(variable);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void collectInitializationData(Variable variable) {

		InvocatorDelegate delegate = InvocatorDelegateRegistry.getInstance()
				.getInvocatorDelegate(variable.getVariableType().getClass());

		// If no delegate, fail.
		if (delegate == null) {
			Logger.INSTANCE.log(Activator.ID, this,
					"Cannot find an InvocatorDelegate for instance of type <" + instance.getClass() + "> !",
					EventSeverity.ERROR);
		} else {
			delegate.collectInitializationData(variable);
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void loadRegisteredTypes(InvocatorSession session) {	
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public List<Type> getAllTypes(Environment environment) {
		List<Type> types = new ArrayList<Type>();

			LocalTypesList localTypesList = environment.getLocalTypesList();
			if (localTypesList != null) {
				types.addAll(localTypesList.getTypes());
			}

//			RegisteredTypesList registeredTypesList = typesList.getRegisteredTypes();
//			if (registeredTypesList != null) {
//				types.addAll(registeredTypesList.getTypes());
//		}

		return types;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void addVariableListener(IVariableListener listener) {
		getVariableListenersSet().add(listener);
	}

	private HashSet<IVariableListener> getVariableListenersSet() {
		if (variableListenersSet == null) {
			variableListenersSet = new HashSet<IVariableListener>();
		}
		return variableListenersSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void removeVariableListener(IVariableListener listener) {
		getVariableListenersSet().remove(listener);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void notifyVariableListeners(Variable variable, VariableListenerEventType event) {
		for (IVariableListener listener : getVariableListenersSet()) {
			listener.variableListenerNotification(variable, event);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public InvocatorSession loadInvocatorSession(String uri) throws Exception {
		URI sessionURI = URI.createURI(uri);
		List<EObject> contents = ApogyCommonEMFFacade.INSTANCE.getContent(sessionURI);
		InvocatorSession invocatorSession = (InvocatorSession) contents.get(0);
		return invocatorSession;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public DataProductsList getDataProductsByName(InvocatorSession invocatorSession, String name) {
		for (DataProductsList dataProductsList : invocatorSession.getDataProductsListContainer()
				.getDataProductsList()) {
			if (dataProductsList.getName().equals(name)) {
				return dataProductsList;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Program getProgramByName(InvocatorSession invocatorSession, String name) {		
		for (ProgramsGroup programsGroup : invocatorSession.getProgramsList().getProgramsGroups()) {		
			for (Program program : programsGroup.getPrograms()) {
				if (program.getName().equals(name)) {
					return program;
				}
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Context getContextByName(InvocatorSession invocatorSession, String name) {
		for (Context context : invocatorSession.getEnvironment().getContextsList().getContexts()) {
			if (context.getName().equals(name)) {
				return context;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Program> getAllScriptBasedPrograms(ProgramsList programsList) {
		List<Program> list = new ArrayList<Program>();
		
		for (ProgramsGroup programsGroup: programsList.getProgramsGroups()){
			Iterator<Program> programs = programsGroup.getPrograms().iterator();
			
			while (programs.hasNext()){
				Program program = programs.next();
				if (program instanceof ScriptBasedProgram){
					list.add(program);
				}
			}				
		}
		return list;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Context createContext(InvocatorSession invocatorSession) {

		Context context = ApogyCoreInvocatorFactory.eINSTANCE.createContext();
		VariableImplementationsList variableImplementationsList = ApogyCoreInvocatorFactory.eINSTANCE
				.createVariableImplementationsList();
		context.setVariableImplementationsList(variableImplementationsList);

		/**
		 * Instantiate the variable implementations.
		 */
		Iterator<Variable> variables = invocatorSession.getEnvironment().getVariablesList().getVariables().iterator();
		while (variables.hasNext()) {
			Variable variable = variables.next();
			VariableImplementation variableImplementation = ApogyCoreInvocatorFactory.eINSTANCE
					.createVariableImplementation();
			variableImplementation.setVariable(variable);
			
			List<EClass> eClasses = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(variableImplementation.getHandlingType().getInterfaceClass());
			if (!eClasses.isEmpty()){
				variableImplementation.setImplementationClass(eClasses.get(0));
			}

			/** Create TypeMemberImplementations. */
			variableImplementation.getTypeMemberImplementations().addAll(
					ApogyCoreInvocatorFacade.INSTANCE.createTypeMemberImplementations(variable.getVariableType()));

			variableImplementationsList.getVariableImplementations().add(variableImplementation);
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public ProgramsGroup getControllersGroup() {
		for(Iterator<ProgramsGroup> ite = getActiveInvocatorSession().getProgramsList().getProgramsGroups().iterator(); ite.hasNext();){
			ProgramsGroup group = ite.next();
			if(group.getName().equals("Controllers group")){
				return group;
			}
		}
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void addVariable(VariablesList variablesList, Variable variable) {
		variablesList.getVariables().add(variable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void deleteVariable(VariablesList variablesList, Variable variable) {
		variablesList.getVariables().remove(variable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getOperationCallString(OperationCall operationCall) {
		return getOperationCallString(operationCall, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getOperationCallString(OperationCall operationCall, boolean hideEParamaters) {
		String str = "";
		if (operationCall.getVariable() != null) {
			str += operationCall.getVariable().getName();
		}
		str += getSubTypeFeatureString(operationCall.getTypeMemberReferenceListElement(),
				operationCall.getFeatureRoot());
		if (operationCall.getEOperation() != null) {
			if(hideEParamaters){
				str += getEOperationString(null, operationCall.getEOperation());	
				str = str.substring(0, str.length()-2);
			}else{
				str += getEOperationString(operationCall.getArgumentsList(), operationCall.getEOperation());
			}
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getEOperationString(ArgumentsList argumentList, EOperation eOperation) {
		String str = "#";
		String operation_str = eOperation == null ? "NO_OPERATION"
				: eOperation.getName();

		String eParamaters_str = null;
		if (argumentList != null
				&& !argumentList.getArguments().isEmpty()) {
			eParamaters_str = "(";
			for (EParameter eParameter : eOperation.getEParameters()) {
				eParamaters_str += eParameter.getEType().getName() + " ";
				eParamaters_str += eParameter.getName() + ", ";
			}
			eParamaters_str = eParamaters_str.substring(0, eParamaters_str.length() - 2);
			eParamaters_str += ")";
		}else{
			eParamaters_str = "()";
		}

		return str + operation_str + eParamaters_str;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getSubTypeFeatureString(TypeMemberReferenceListElement typeMemberReferenceListElement, ListRootNode listRootNode) {
		String typeReference_str = "";
		if(typeMemberReferenceListElement != null){
			typeReference_str = "->" + typeMemberReferenceListElement.getTypeMember().getName();
			Boolean continueConcat = typeMemberReferenceListElement.getParent() instanceof TypeMemberReferenceListElement;
			while(continueConcat){
				typeMemberReferenceListElement = typeMemberReferenceListElement.getParent();
				("->").concat(typeMemberReferenceListElement.getParent().getTypeMember().getName().concat(typeReference_str));
				continueConcat = typeMemberReferenceListElement.getParent() instanceof TypeMemberReferenceListElement;
			}
		}
		
		String feature_str = "";
		if (listRootNode != null) {
			AbstractFeatureListNode leaf = ApogyCommonEMFFacade.INSTANCE
					.getLeaf(listRootNode);
			if (leaf != null) {
				feature_str = "." + ApogyCommonEMFFacade.INSTANCE.getAncestriesString(leaf);
			}
		}
		return typeReference_str + feature_str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListRootNode createListRootNode(VariableFeatureReference variableFeatureReference, EStructuralFeature[] features) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getAbstractTypeImplementationName(AbstractTypeImplementation implementation) {
		String str;
		if (implementation instanceof VariableImplementation) {
			VariableImplementation variableImplementation = (VariableImplementation) implementation;
			str = variableImplementation.getVariable().getName();
		} else {
			TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) implementation;
			str = typeMemberImplementation.getTypeMember().getName();
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getAbstractTypeImplementationInterfaceName(AbstractTypeImplementation implementation, boolean fullyQualified) {
		String str = "";
		if (implementation instanceof VariableImplementation) {
			VariableImplementation variableImplementation = (VariableImplementation) implementation;

			if (variableImplementation.getVariable().getVariableType()
					.getInterfaceClass() != null) {
				
				str = fullyQualified ? 
					variableImplementation.getVariable()
						.getVariableType().getInterfaceClass()
						.getInstanceTypeName() : 
					variableImplementation
						.getVariable().getVariableType().getInterfaceClass()
						.getName();
							
			}
		} else {
			TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) implementation;

			if (typeMemberImplementation.getTypeMember()
					.getMemberType().getInterfaceClass() != null) {
				str = fullyQualified ? 						
					typeMemberImplementation.getTypeMember()
						.getMemberType().getInterfaceClass().getInstanceTypeName():
					typeMemberImplementation.getTypeMember()
							.getMemberType().getInterfaceClass().getName();
			}
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getAbstractTypeImplementationImplementationName(AbstractTypeImplementation implementation, boolean fullyQualified) {
		String str = "";
		if (implementation.getImplementationClass() != null) {
			str = fullyQualified ? 
					implementation.getImplementationClass().getInstanceTypeName():
					implementation.getImplementationClass().getName(); 
		}
		return str;
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
				argument = ApogyCoreInvocatorFactory.eINSTANCE.createEEnumArgument();
				EEnum eEnum = (EEnum) parameter.getEType();
				((EEnumArgument) argument).setEEnum(eEnum);
				

				Enum<?> defaultValue = (Enum<?>) parameter.getEType().getDefaultValue();
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
				} else {
 					argument = ApogyCoreInvocatorFactory.eINSTANCE.createStringEDataTypeArgument();	
					((StringEDataTypeArgument)argument).setValue("DEFAULT");
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
		} else {
			// Clear the list
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(operationCall,
					ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST, null);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE:
				return getInitVariableInstancesDate();
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				if (resolve) return getActiveInvocatorSession();
				return basicGetActiveInvocatorSession();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE:
				setInitVariableInstancesDate((Date)newValue);
				return;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				setActiveInvocatorSession((InvocatorSession)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE:
				setInitVariableInstancesDate(INIT_VARIABLE_INSTANCES_DATE_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				setActiveInvocatorSession((InvocatorSession)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__INIT_VARIABLE_INSTANCES_DATE:
				return INIT_VARIABLE_INSTANCES_DATE_EDEFAULT == null ? initVariableInstancesDate != null : !INIT_VARIABLE_INSTANCES_DATE_EDEFAULT.equals(initVariableInstancesDate);
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
				return activeInvocatorSession != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */	
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL:
				return exec((OperationCall)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALL_BOOLEAN:
				return exec((OperationCall)arguments.get(0), (Boolean)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___EXEC__OPERATIONCALLSLIST:
				exec((OperationCallsList)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_VALUE__OPERATIONCALLRESULT:
				return getValue((OperationCallResult)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___CREATE_ABSTRACT_RESULT_VALUE__OBJECT:
				return createAbstractResultValue(arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLE:
				return getInstance((Variable)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLE:
				return getInstanceClass((Variable)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_API_ADAPTER__VARIABLEFEATUREREFERENCE:
				return getTypeApiAdapter((VariableFeatureReference)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE__VARIABLEFEATUREREFERENCE:
				return getInstance((VariableFeatureReference)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_MEMBER_INSTANCE__VARIABLEFEATUREREFERENCE:
				return getTypeMemberInstance((VariableFeatureReference)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_EMF_FEATURE_VALUE__VARIABLEFEATUREREFERENCE:
				return getEMFFeatureValue((VariableFeatureReference)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_INSTANCE_CLASS__VARIABLEFEATUREREFERENCE:
				return getInstanceClass((VariableFeatureReference)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__OPERATIONCALL:
				return getTypeImplementation((OperationCall)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE_ABSTRACTTYPE:
				return getTypeImplementation((Variable)arguments.get(0), (AbstractType)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__VARIABLE:
				return getTypeImplementation((Variable)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_VARIABLE_BY_NAME__INVOCATORSESSION_STRING:
				return getVariableByName((InvocatorSession)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_REFERENCES__TYPEMEMBER:
				return createTypeMemberReferences((TypeMember[])arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_TYPE_IMPLEMENTATION__ENVIRONMENT_STRING:
				return getTypeImplementation((Environment)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__TYPEMEMBERREFERENCETREEELEMENT:
				return getFullyQualifiedName((TypeMemberReferenceTreeElement)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_FULLY_QUALIFIED_NAME__ABSTRACTFEATURENODE:
				return getFullyQualifiedName((AbstractFeatureNode)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___CREATE_TYPE_MEMBER_IMPLEMENTATIONS__TYPE:
				return createTypeMemberImplementations((Type)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___INIT_VARIABLE_INSTANCES:
				initVariableInstances();
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___DISPOSE_VARIABLE_INSTANCES:
				disposeVariableInstances();
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_OPERATION_CALL_CONTAINER__TYPEMEMBERREFERENCELISTELEMENT:
				return getOperationCallContainer((TypeMemberReferenceListElement)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__ENVIRONMENT:
				applyInitializationData((Environment)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__ENVIRONMENT:
				collectInitializationData((Environment)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___APPLY_INITIALIZATION_DATA__VARIABLE:
				applyInitializationData((Variable)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___COLLECT_INITIALIZATION_DATA__VARIABLE:
				collectInitializationData((Variable)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___LOAD_INVOCATOR_SESSION__STRING:
				try {
					return loadInvocatorSession((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_DATA_PRODUCTS_BY_NAME__INVOCATORSESSION_STRING:
				return getDataProductsByName((InvocatorSession)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_PROGRAM_BY_NAME__INVOCATORSESSION_STRING:
				return getProgramByName((InvocatorSession)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_CONTEXT_BY_NAME__INVOCATORSESSION_STRING:
				return getContextByName((InvocatorSession)arguments.get(0), (String)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_ALL_SCRIPT_BASED_PROGRAMS__PROGRAMSLIST:
				return getAllScriptBasedPrograms((ProgramsList)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___CREATE_CONTEXT__INVOCATORSESSION:
				return createContext((InvocatorSession)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_CONTROLLERS_GROUP:
				return getControllersGroup();
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___ADD_VARIABLE__VARIABLESLIST_VARIABLE:
				addVariable((VariablesList)arguments.get(0), (Variable)arguments.get(1));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___DELETE_VARIABLE__VARIABLESLIST_VARIABLE:
				deleteVariable((VariablesList)arguments.get(0), (Variable)arguments.get(1));
				return null;
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_OPERATION_CALL_STRING__OPERATIONCALL:
				return getOperationCallString((OperationCall)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_OPERATION_CALL_STRING__OPERATIONCALL_BOOLEAN:
				return getOperationCallString((OperationCall)arguments.get(0), (Boolean)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_EOPERATION_STRING__ARGUMENTSLIST_EOPERATION:
				return getEOperationString((ArgumentsList)arguments.get(0), (EOperation)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_SUB_TYPE_FEATURE_STRING__TYPEMEMBERREFERENCELISTELEMENT_LISTROOTNODE:
				return getSubTypeFeatureString((TypeMemberReferenceListElement)arguments.get(0), (ListRootNode)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___CREATE_LIST_ROOT_NODE__VARIABLEFEATUREREFERENCE_ESTRUCTURALFEATURE:
				return createListRootNode((VariableFeatureReference)arguments.get(0), (EStructuralFeature[])arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_NAME__ABSTRACTTYPEIMPLEMENTATION:
				return getAbstractTypeImplementationName((AbstractTypeImplementation)arguments.get(0));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_INTERFACE_NAME__ABSTRACTTYPEIMPLEMENTATION_BOOLEAN:
				return getAbstractTypeImplementationInterfaceName((AbstractTypeImplementation)arguments.get(0), (Boolean)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___GET_ABSTRACT_TYPE_IMPLEMENTATION_IMPLEMENTATION_NAME__ABSTRACTTYPEIMPLEMENTATION_BOOLEAN:
				return getAbstractTypeImplementationImplementationName((AbstractTypeImplementation)arguments.get(0), (Boolean)arguments.get(1));
			case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE___SET_EOPERATION_INIT_ARGUMENTS__EOPERATION_OPERATIONCALL:
				setEOperationInitArguments((EOperation)arguments.get(0), (OperationCall)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initVariableInstancesDate: ");
		result.append(initVariableInstancesDate);
		result.append(')');
		return result.toString();
	}

} // ApogyCoreInvocatorFacadeImpl
