/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms.provider;


import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.provider.LineOfSightImageMapLayerItemProvider;
import ca.gc.asc_csa.symphony.tools.telecoms.AntennaRadiationPatternImageMapLayer;
import ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsFactory;
import ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.tools.telecoms.AntennaRadiationPatternImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AntennaRadiationPatternImageMapLayerItemProvider extends LineOfSightImageMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AntennaRadiationPatternImageMapLayerItemProvider(AdapterFactory adapterFactory) {
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

			addAntennaRadiationPatternPropertyDescriptor(object);
			addSignalStrengthCutoffPropertyDescriptor(object);
			addBellowCutoffColorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Antenna Radiation Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAntennaRadiationPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AntennaRadiationPatternImageMapLayer_antennaRadiationPattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AntennaRadiationPatternImageMapLayer_antennaRadiationPattern_feature", "_UI_AntennaRadiationPatternImageMapLayer_type"),
				 SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_ANTENNAPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Signal Strength Cutoff feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSignalStrengthCutoffPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AntennaRadiationPatternImageMapLayer_signalStrengthCutoff_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AntennaRadiationPatternImageMapLayer_signalStrengthCutoff_feature", "_UI_AntennaRadiationPatternImageMapLayer_type"),
				 SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_CUTOFF_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Bellow Cutoff Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBellowCutoffColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AntennaRadiationPatternImageMapLayer_bellowCutoffColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AntennaRadiationPatternImageMapLayer_bellowCutoffColor_feature", "_UI_AntennaRadiationPatternImageMapLayer_type"),
				 SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_CUTOFF_SETTINGSPropertyCategory"),
				 null));
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
			childrenFeatures.add(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN);
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
	 * This returns AntennaRadiationPatternImageMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AntennaRadiationPatternImageMapLayer"));
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
		AntennaRadiationPatternImageMapLayer antennaRadiationPatternImageMapLayer = (AntennaRadiationPatternImageMapLayer) object;
		
		String label = antennaRadiationPatternImageMapLayer.getName();
		if(label == null || label.length() == 0)
		{
			label = getString("_UI_AntennaRadiationPatternImageMapLayer_type");
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

		switch (notification.getFeatureID(AntennaRadiationPatternImageMapLayer.class)) {
			case SymphonyTelecomToolsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__SIGNAL_STRENGTH_CUTOFF:
			case SymphonyTelecomToolsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__BELLOW_CUTOFF_COLOR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyTelecomToolsPackage.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN:
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
				(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 SymphonyTelecomToolsFactory.eINSTANCE.createIsotropicAntenna()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 SymphonyTelecomToolsFactory.eINSTANCE.createDipoleAntennaRadiationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 SymphonyTelecomToolsFactory.eINSTANCE.createHalfWaveDipoleAntennaRadiationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 SymphonyTelecomToolsFactory.eINSTANCE.createSimpleConicalRadiationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 SymphonyTelecomToolsFactory.eINSTANCE.createSimpleRectangularFrustumRadiationPattern()));

		newChildDescriptors.add
			(createChildParameter
				(SymphonyTelecomToolsPackage.Literals.ANTENNA_RADIATION_PATTERN_IMAGE_MAP_LAYER__ANTENNA_RADIATION_PATTERN,
				 SymphonyTelecomToolsFactory.eINSTANCE.createURlBasedAntennaRadiationPattern()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__IMAGE ||
			childFeature == SymphonyEnvironmentPackage.Literals.IMAGE_MAP_LAYER__LEGEND;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
