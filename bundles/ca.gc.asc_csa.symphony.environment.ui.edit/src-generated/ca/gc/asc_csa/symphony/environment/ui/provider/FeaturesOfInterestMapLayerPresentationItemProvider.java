/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.ui.provider;


import ca.gc.asc_csa.symphony.environment.ui.FeaturesOfInterestMapLayerPresentation;
import ca.gc.asc_csa.symphony.environment.ui.SymphonyEnvironmentUIPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.ui.FeaturesOfInterestMapLayerPresentation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeaturesOfInterestMapLayerPresentationItemProvider
	extends MapAnnotationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeaturesOfInterestMapLayerPresentationItemProvider(AdapterFactory adapterFactory) {
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

			addFeaturesOfInterestMapLayerPropertyDescriptor(object);
			addFeatureOfInterestRadiusPropertyDescriptor(object);
			addFeatureOfInterestColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Features Of Interest Map Layer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturesOfInterestMapLayerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeaturesOfInterestMapLayerPresentation_featuresOfInterestMapLayer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeaturesOfInterestMapLayerPresentation_featuresOfInterestMapLayer_feature", "_UI_FeaturesOfInterestMapLayerPresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER,
				 true,
				 false,
				 true,
				 null,
				 getString("_UI_FOI_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Of Interest Radius feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureOfInterestRadiusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeaturesOfInterestMapLayerPresentation_featureOfInterestRadius_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeaturesOfInterestMapLayerPresentation_featureOfInterestRadius_feature", "_UI_FeaturesOfInterestMapLayerPresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_FOI_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Of Interest Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureOfInterestColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeaturesOfInterestMapLayerPresentation_featureOfInterestColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeaturesOfInterestMapLayerPresentation_featureOfInterestColor_feature", "_UI_FeaturesOfInterestMapLayerPresentation_type"),
				 SymphonyEnvironmentUIPackage.Literals.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_FOI_PROPERTIESPropertyCategory"),
				 null));
	}

	/**
	 * This returns FeaturesOfInterestMapLayerPresentation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeaturesOfInterestMapLayerPresentation"));
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
		FeaturesOfInterestMapLayerPresentation featuresOfInterestMapLayerPresentation = (FeaturesOfInterestMapLayerPresentation) object;
		
		String label = getString("_UI_FeaturesOfInterestMapLayerPresentation_type");
		
		if(featuresOfInterestMapLayerPresentation.getFeaturesOfInterestMapLayer() != null)
		{
			String name = featuresOfInterestMapLayerPresentation.getFeaturesOfInterestMapLayer() .getName();
			if(name != null && name.length() > 0)
			{
				label = name;
			}
		}
		
		if(featuresOfInterestMapLayerPresentation.isVisible())
		{
			label += " (visible)";
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

		switch (notification.getFeatureID(FeaturesOfInterestMapLayerPresentation.class)) {
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURES_OF_INTEREST_MAP_LAYER:
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_RADIUS:
			case SymphonyEnvironmentUIPackage.FEATURES_OF_INTEREST_MAP_LAYER_PRESENTATION__FEATURE_OF_INTEREST_COLOR:
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
