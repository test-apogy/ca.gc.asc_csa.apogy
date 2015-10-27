/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.symphony.core.Symphony__CoreFactory;
import org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.symphony.core.environment.FeaturesOfInterestMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturesOfInterestMapLayerItemProvider
	extends AbstractMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayerItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Symphony__CoreEnvironmentPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeaturesOfInterestMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeaturesOfInterestMapLayer"));
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
		FeaturesOfInterestMapLayer featuresOfInterestMapLayer = (FeaturesOfInterestMapLayer) object;
		
		String label = "";
		
		int size = 0;
		if(featuresOfInterestMapLayer.getFeatures() != null &&  featuresOfInterestMapLayer.getFeatures().getFeaturesOfInterest() != null)
		{
			size = featuresOfInterestMapLayer.getFeatures().getFeaturesOfInterest().size(); 
		}
		
		if(featuresOfInterestMapLayer.getName() != null && featuresOfInterestMapLayer.getName().length() > 0)
		{
			label = featuresOfInterestMapLayer.getName();
		}
		else
		{
			label = getString("_UI_FeaturesOfInterestMapLayer_type");
		}
		
		if(size > 0)
		{
			  label += " [" + size +"]";
		}  
		
		return label;
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

		switch (notification.getFeatureID(FeaturesOfInterestMapLayer.class)) {
			case Symphony__CoreEnvironmentPackage.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(Symphony__CoreEnvironmentPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER__FEATURES,
				 Symphony__CoreFactory.eINSTANCE.createFeatureOfInterestList()));
	}

}
