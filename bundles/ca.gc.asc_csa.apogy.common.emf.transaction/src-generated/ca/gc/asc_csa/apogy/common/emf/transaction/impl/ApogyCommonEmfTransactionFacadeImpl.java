/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.common.emf.transaction.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import ca.gc.asc_csa.apogy.common.emf.Activator;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionPackage;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonEmfTransactionFacadeImpl extends MinimalEObjectImpl.Container
		implements ApogyCommonEmfTransactionFacade {

	/**
	 * Facade Singleton.
	 */
	private static ApogyCommonEmfTransactionFacade instance = null;

	/**
	 * Returns the facade singleton.
	 * 
	 * @return Reference to the facade.
	 */
	public static ApogyCommonEmfTransactionFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonEmfTransactionFacadeImpl();
		}

		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonEmfTransactionFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEmfTransactionPackage.Literals.APOGY_COMMON_EMF_TRANSACTION_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public TransactionalEditingDomain getDefaultEditingDomain() {
		return TransactionalEditingDomain.Registry.INSTANCE
				.getEditingDomain("ca.gc.asc_csa.apogy.common.emf.transaction.defaultApogyEditingDomain");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void addInTempTransactionalEditingDomain(EObject eObject) {
		final EObject rootObject = EcoreUtil.getRootContainer(eObject);
		final ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI.createURI("TEMP_RESOURCE"));
		if (resource != null) {
			resource.getContents().add(rootObject);
		}
		final TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE
				.createEditingDomain(resourceSet);
		resourceSet.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(domain));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void basicSet(EObject owner, EStructuralFeature feature, Object value) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
		if (domain instanceof TransactionalEditingDomain) {
			SetCommand command = new SetCommand(domain, owner, feature, value);
			domain.getCommandStack().execute(command);
		}else{
			String message = this.getClass().getSimpleName() + ".basicSet(): "
					+ "Editing domain of" + owner + "is not Transactional";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void basicSet(EObject owner, EStructuralFeature feature, Object value, int index) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
		if (domain instanceof TransactionalEditingDomain) {
			SetCommand command = new SetCommand(domain, owner, feature, value, index);
			domain.getCommandStack().execute(command);
		}else{
			String message = this.getClass().getSimpleName() + ".basicSet(): "
					+ "Editing domain of" + owner + "is not Transactional";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void basicAdd(EObject owner, EStructuralFeature feature, Object value) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
		if (domain instanceof TransactionalEditingDomain) {
			AddCommand command = new AddCommand(domain, owner, feature, value);
			domain.getCommandStack().execute(command);
		}else{
			String message = this.getClass().getSimpleName() + ".basicAdd(): "
					+ "Editing domain of" + owner + "is not Transactional";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void basicAdd(EObject owner, EStructuralFeature feature, Collection<?> collection) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
		if (domain instanceof TransactionalEditingDomain) {
			AddCommand command = new AddCommand(domain, owner, feature, collection);
			domain.getCommandStack().execute(command);
		}else{
			String message = this.getClass().getSimpleName() + ".basicAdd(): "
					+ "Editing domain of" + owner + "is not Transactional";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void basicRemove(EObject owner, EStructuralFeature feature, Object value) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(owner);
		if (domain instanceof TransactionalEditingDomain) {
			RemoveCommand command = new RemoveCommand(domain, owner, feature, value);
			domain.getCommandStack().execute(command);
		}else{
			String message = this.getClass().getSimpleName() + ".basicAdd(): "
					+ "Editing domain of" + owner + "is not Transactional";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void basicDelete(EObject owner, EStructuralFeature feature, Object value) {
		if(feature.isMany()){
			basicRemove(owner, feature, value);
		}else{
			basicSet(owner, feature, null);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___GET_DEFAULT_EDITING_DOMAIN:
				return getDefaultEditingDomain();
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___ADD_IN_TEMP_TRANSACTIONAL_EDITING_DOMAIN__EOBJECT:
				addInTempTransactionalEditingDomain((EObject)arguments.get(0));
				return null;
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___BASIC_SET__EOBJECT_ESTRUCTURALFEATURE_OBJECT:
				basicSet((EObject)arguments.get(0), (EStructuralFeature)arguments.get(1), arguments.get(2));
				return null;
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___BASIC_SET__EOBJECT_ESTRUCTURALFEATURE_OBJECT_INT:
				basicSet((EObject)arguments.get(0), (EStructuralFeature)arguments.get(1), arguments.get(2), (Integer)arguments.get(3));
				return null;
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___BASIC_ADD__EOBJECT_ESTRUCTURALFEATURE_OBJECT:
				basicAdd((EObject)arguments.get(0), (EStructuralFeature)arguments.get(1), arguments.get(2));
				return null;
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___BASIC_ADD__EOBJECT_ESTRUCTURALFEATURE_COLLECTION:
				basicAdd((EObject)arguments.get(0), (EStructuralFeature)arguments.get(1), (Collection<?>)arguments.get(2));
				return null;
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___BASIC_REMOVE__EOBJECT_ESTRUCTURALFEATURE_OBJECT:
				basicRemove((EObject)arguments.get(0), (EStructuralFeature)arguments.get(1), arguments.get(2));
				return null;
			case ApogyCommonEmfTransactionPackage.APOGY_COMMON_EMF_TRANSACTION_FACADE___BASIC_DELETE__EOBJECT_ESTRUCTURALFEATURE_OBJECT:
				basicDelete((EObject)arguments.get(0), (EStructuralFeature)arguments.get(1), arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCommonEmfTransactionFacadeImpl
