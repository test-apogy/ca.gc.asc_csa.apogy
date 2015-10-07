/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer;
import org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage;
import org.eclipse.symphony.core.provider.UpdatableItemProvider;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.orbit.earth.ui.AbstractWorldWindLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractWorldWindLayerItemProvider 
	extends UpdatableItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractWorldWindLayerItemProvider(AdapterFactory adapterFactory) {
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

			addVisiblePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Visible feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVisiblePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractWorldWindLayer_visible_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractWorldWindLayer_visible_feature", "_UI_AbstractWorldWindLayer_type"),
				 SymphonyEarthOrbitEnvironmentUIPackage.Literals.ABSTRACT_WORLD_WIND_LAYER__VISIBLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
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
		AbstractWorldWindLayer abstractWorldWindLayer = (AbstractWorldWindLayer)object;
		
		String label = getString("_UI_AbstractWorldWindLayer_type");
		
		String text = getAbstractWorldWindLayerText(abstractWorldWindLayer);
		
		if(text != null)
		{
			label += " (" + text + ")";
		}
		
		return label;
	}
	
	protected String getAbstractWorldWindLayerText(AbstractWorldWindLayer abstractWorldWindLayer)
	{
		String text = null;
			
		if(abstractWorldWindLayer.isVisible())
		{
			text = "visible";
		}		
						
		return text;
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

		switch (notification.getFeatureID(AbstractWorldWindLayer.class)) {
			case SymphonyEarthOrbitEnvironmentUIPackage.ABSTRACT_WORLD_WIND_LAYER__VISIBLE:
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

}
