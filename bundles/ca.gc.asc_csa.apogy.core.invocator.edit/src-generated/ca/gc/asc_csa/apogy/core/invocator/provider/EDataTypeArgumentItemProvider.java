/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.invocator.EDataTypeArgument;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.edit.descriptors.ENumberDataTypeArgumentItemPropertyDescriptor;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.invocator.EDataTypeArgument} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class EDataTypeArgumentItemProvider extends ArgumentItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataTypeArgumentItemProvider(AdapterFactory adapterFactory) {
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
		EDataTypeArgument argument = (EDataTypeArgument) object;
		Class<?> clazz = argument.getEParameter().getEGenericType()
				.getEClassifier().getInstanceClass();

		if (clazz.isAssignableFrom(boolean.class) || clazz.isAssignableFrom(Boolean.class)) {
			
			/** 
			 * Boolean DataType.
			 */			
			itemPropertyDescriptors
					.add(new ItemPropertyDescriptor(
							((ComposeableAdapterFactory) adapterFactory)
									.getRootAdapterFactory(),
							getResourceLocator(),
							getString("_UI_EDataTypeArgument_value_feature"),
							getString("_UI_PropertyDescriptor_description",
									"_UI_EDataTypeArgument_value_feature",
									"_UI_EDataTypeArgument_type"),
							Symphony__CoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE,
							true, false, false,
							ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
							null){
				@Override
				protected Collection<?> getComboBoxObjects(
						Object object) {
					
					String[] options = {"true", "false"};
					ArrayList<String> list = new ArrayList<String>();
					Collections.addAll(list, options);					
					return list;
				}
			});
			
		} else if (clazz.isAssignableFrom(Number.class) ||
				   clazz.isAssignableFrom(byte.class) || 
				   clazz.isAssignableFrom(short.class) ||
				   clazz.isAssignableFrom(int.class) ||
				   clazz.isAssignableFrom(long.class) ||
				   clazz.isAssignableFrom(float.class) ||
				   clazz.isAssignableFrom(double.class)){
			
			/**
			 * Number Elements.
			 */
			itemPropertyDescriptors
					.add(new ENumberDataTypeArgumentItemPropertyDescriptor(
							((ComposeableAdapterFactory) adapterFactory)
									.getRootAdapterFactory(),
							getResourceLocator(),
							getString("_UI_EDataTypeArgument_value_feature"),
							getString("_UI_PropertyDescriptor_description",
									"_UI_EDataTypeArgument_value_feature",
									"_UI_EDataTypeArgument_type"),
							Symphony__CoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE,
							true, false, false,
							ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
							null));
		}else{
			
			/**
			 * Other EDataType (e.g. EDate).
			 */
			
			itemPropertyDescriptors
			.add(createItemPropertyDescriptor(
					((ComposeableAdapterFactory) adapterFactory)
							.getRootAdapterFactory(),
					getResourceLocator(),
					getString("_UI_EDataTypeArgument_value_feature"),
					getString("_UI_PropertyDescriptor_description",
							"_UI_EDataTypeArgument_value_feature",
							"_UI_EDataTypeArgument_type"),
					Symphony__CoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE,
					true, false, false,
					ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
					null));
		}
	}

	/**
	 * This returns EDataTypeArgument.gif.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EDataTypeArgument"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		// FIXME Consider Units Here.
		EDataTypeArgument argument = (EDataTypeArgument) object;
		String label = super.getText(object);
		label += " (" + argument.getValue() + ")";

		return label;
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

		switch (notification.getFeatureID(EDataTypeArgument.class)) {
			case Symphony__CoreInvocatorPackage.EDATA_TYPE_ARGUMENT__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
