/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package org.eclipse.symphony.common.io.jinput.provider;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.common.io.jinput.Activator;
import org.eclipse.symphony.common.io.jinput.EComponent;
import org.eclipse.symphony.common.io.jinput.EComponentQualifier;
import org.eclipse.symphony.common.io.jinput.EController;
import org.eclipse.symphony.common.io.jinput.JInputPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.common.io.jinput.EComponentQualifier} object.
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
				 JInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME,
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
				 JInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME,
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
			case JInputPackage.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME:
			case JInputPackage.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME:
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
		return JInputEditPlugin.INSTANCE;
	}

}
