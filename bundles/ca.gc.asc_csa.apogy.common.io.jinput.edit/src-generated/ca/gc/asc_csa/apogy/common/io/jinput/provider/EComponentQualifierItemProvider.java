package ca.gc.asc_csa.apogy.common.io.jinput.provider;
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


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import ca.gc.asc_csa.apogy.common.io.jinput.Activator;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.io.jinput.EController;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EComponentQualifierItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EComponentQualifierItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEComponentNamePropertyDescriptor(object);
			addEControllerNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the EComponent Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addEComponentNamePropertyDescriptor(Object object) 
	{		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EComponentQualifier_eComponentName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EComponentQualifier_eComponentName_feature", "_UI_EComponentQualifier_type"),
				 ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null)
			{
				protected java.util.Collection<?> getComboBoxObjects(Object object) 
				{					
					EComponentQualifier eComponentQualifier = (EComponentQualifier) object;										
					List<String> componentNames = new ArrayList<String>();
				
					if(eComponentQualifier != null && eComponentQualifier.getEControllerName() != null)
					{
						EController controller = Activator.getEControllerEnvironment().resolveController(eComponentQualifier.getEControllerName());
						if(controller != null)
						{
							for(EComponent eComponent : controller.getEComponents().getComponents())
							{
								componentNames.add(eComponent.getName());
							}
						}
					}
					return componentNames;
				};
			}
		);
	}

	/**
	 * This adds a property descriptor for the EController Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addEControllerNamePropertyDescriptor(Object object) 
	{		
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EComponentQualifier_eControllerName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EComponentQualifier_eControllerName_feature", "_UI_EComponentQualifier_type"),
				 ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null)
				 {
					protected java.util.Collection<?> getComboBoxObjects(Object object) 
					{						
						List<String> controlerNames = new ArrayList<String>();
						
						for(EController eController : Activator.getEControllerEnvironment().getControllers())
						{
							controlerNames.add(eController.getName());							
						}					
						
						return controlerNames;
					};				 
			});
	}

	/**
	 * This returns EComponentQualifier.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public Object getImage(Object object) 
	{
		EComponentQualifier qualifier = (EComponentQualifier) object;
		
		EComponent eComponent = Activator.getEControllerEnvironment().resolveEComponent(qualifier); 
		
		if(eComponent != null)
		{
			return overlayImage(object, getResourceLocator().getImage("joystick.png"));
		}
		else
		{
			return overlayImage(object, getResourceLocator().getImage("joystickError.png"));
		}				
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) 
	{
		EComponentQualifier qualifier = (EComponentQualifier) object;		
		
		String controller = "";
		if(qualifier.getEControllerName() != null) controller = qualifier.getEControllerName();
		
		String component = "";
		if(qualifier.getEComponentName() != null) component = qualifier.getEComponentName();
		
		return controller + " : " + component;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EComponentQualifier.class)) {
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
			case ApogyCommonIOJInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
