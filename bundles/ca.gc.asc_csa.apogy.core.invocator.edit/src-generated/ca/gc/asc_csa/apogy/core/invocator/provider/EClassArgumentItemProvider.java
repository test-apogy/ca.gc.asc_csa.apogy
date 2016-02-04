package ca.gc.asc_csa.apogy.core.invocator.provider;
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

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.edit.utils.ApogyCommonEMFEditUtilsFacade;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * This is the item provider adapter for a
 * {@link ca.gc.asc_csa.apogy.core.invocator.EClassArgument} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class EClassArgumentItemProvider extends ArgumentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClassArgumentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_EClassArgument_value_feature"), getString(
						"_UI_PropertyDescriptor_description",
						"_UI_EClassArgument_value_feature",
						"_UI_EClassArgument_type"),
				ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE, true,
				false, false, null, null, null) {
			@Override
			protected Collection<?> getComboBoxObjects(Object object) {
				EClassArgument eClassArgument = (EClassArgument) object;

				/**
				 * List of EClasses is returned but the property value is
				 * expecting an EObject. The SetCommand is overridden to handle
				 * this. It instantiates the EObject based on the EClass
				 * selected.
				 * 
				 * @see #createSetCommand
				 */
				List<EClass> eClasses = ApogyCommonEMFFacade.INSTANCE
						.getAllSubEClasses((EClass) eClassArgument
								.getEParameter().getEType());
				return eClasses;
			}
		});
	}

	/**
	 * The "Value" property descriptor returns the EClass to instantiate.  
	 * This overrides the default behavior by instantiating and setting the 
	 * EObject.
	 * @generated_NOT
	 */
	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value) {
		
		if (feature == ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE){			
			if (value instanceof EClass){
				return new SetCommand(domain, owner, feature, EcoreUtil.create((EClass) value));
			}							
		}
		return super.createSetCommand(domain, owner, feature, value);
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns EClassArgument.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EClassArgument"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_EClassArgument_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EClassArgument.class)) {
			case ApogyCoreInvocatorPackage.ECLASS_ARGUMENT__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void collectNewChildDescriptorsGen(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE,
				 EcoreFactory.eINSTANCE.createEObject()));
	}

	/**
	 * @generated_NOT
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		collectNewChildDescriptorsGen(newChildDescriptors, object);

		/** Remove Default EObject. */
		ApogyCommonEMFEditUtilsFacade.INSTANCE
		.removeChildDescriptor(
				newChildDescriptors,
				ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE);
		
		EClassArgument eClassArgument = (EClassArgument) object;
		EClassifier eClassifier = eClassArgument.getEParameter().getEType();
		if (eClassifier instanceof EClass){
			Iterator<EClass> eClasses = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses((EClass) eClassifier).iterator();
			while (eClasses.hasNext()){
				EClass currentEClass = eClasses.next();
					newChildDescriptors.add
					(createChildParameter
						(ApogyCoreInvocatorPackage.Literals.ECLASS_ARGUMENT__VALUE,
						 EcoreUtil.create(currentEClass)));					
			}
		}
		
	}
}