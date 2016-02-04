package ca.gc.asc_csa.apogy.common.emf.edit.utils.impl;
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
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCommonEMFEditUtilsFacadeImpl extends MinimalEObjectImpl.Container
		implements ApogyCommonEMFEditUtilsFacade {

	private static ApogyCommonEMFEditUtilsFacade instance = null;

	public static ApogyCommonEMFEditUtilsFacade getInstance() {
		if (instance == null) {
			instance = new ApogyCommonEMFEditUtilsFacadeImpl();
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCommonEMFEditUtilsFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFEditUtilsPackage.Literals.APOGY_COMMON_EMF_EDIT_UTILS_FACADE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public String getText(Object object) {
		ComposedAdapterFactory factory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		IItemLabelProvider labelProvider = (IItemLabelProvider) factory.adapt(
				object, IItemLabelProvider.class);

		if (object != null) {
			return labelProvider == null ? object.toString() : labelProvider
					.getText(object);
		} else {
			return null;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void removeChildDescriptor(Collection<Object> newChildDescriptors,
			Object feature) {
		Iterator<Object> commandParameters = newChildDescriptors.iterator();
		boolean removed = false;

		while (commandParameters.hasNext() && !removed) {
			CommandParameter commandParameter = (CommandParameter) commandParameters
					.next();
			if (commandParameter.getFeature() == feature) {
				newChildDescriptors.remove(commandParameter);
				removed = true;
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonEMFEditUtilsPackage.APOGY_COMMON_EMF_EDIT_UTILS_FACADE___GET_TEXT__OBJECT:
				return getText(arguments.get(0));
			case ApogyCommonEMFEditUtilsPackage.APOGY_COMMON_EMF_EDIT_UTILS_FACADE___REMOVE_CHILD_DESCRIPTOR__COLLECTION_OBJECT:
				removeChildDescriptor((Collection<Object>)arguments.get(0), arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // ApogyCommonEMFEditUtilsFacadeImpl
