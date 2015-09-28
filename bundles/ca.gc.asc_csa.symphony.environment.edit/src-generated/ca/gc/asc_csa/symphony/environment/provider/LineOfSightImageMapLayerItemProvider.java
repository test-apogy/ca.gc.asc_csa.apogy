/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.provider;


import ca.gc.asc_csa.eclipse.emf.ecore.ui.descriptors.AbstractUnitItemPropertyDescriptor;
import ca.gc.asc_csa.symphony.environment.LineOfSightImageMapLayer;
import ca.gc.asc_csa.symphony.environment.SymphonyEnvironmentPackage;
import ca.gc.space.math.MathFactory;

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
 * This is the item provider adapter for a {@link ca.gc.asc_csa.symphony.environment.LineOfSightImageMapLayer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LineOfSightImageMapLayerItemProvider extends CartesianTriangularMeshDerivedImageMapLayerItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineOfSightImageMapLayerItemProvider(AdapterFactory adapterFactory) {
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

			addLineOfSightAvailableColorPropertyDescriptor(object);
			addLineOfSightNotAvailableColorPropertyDescriptor(object);
			addObserverPosePropertyDescriptor(object);
			addTargetHeightAboveGroundPropertyDescriptor(object);
			addUseHeightPerpendicularToGroundPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Line Of Sight Available Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineOfSightAvailableColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineOfSightImageMapLayer_lineOfSightAvailableColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineOfSightImageMapLayer_lineOfSightAvailableColor_feature", "_UI_LineOfSightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Line Of Sight Not Available Color feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLineOfSightNotAvailableColorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineOfSightImageMapLayer_lineOfSightNotAvailableColor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineOfSightImageMapLayer_lineOfSightNotAvailableColor_feature", "_UI_LineOfSightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Observer Pose feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObserverPosePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineOfSightImageMapLayer_observerPose_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineOfSightImageMapLayer_observerPose_feature", "_UI_LineOfSightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE,
				 true,
				 false,
				 false,
				 null,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Target Height Above Ground feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected void addTargetHeightAboveGroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(new AbstractUnitItemPropertyDescriptor(
				((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineOfSightImageMapLayer_targetHeightAboveGround_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineOfSightImageMapLayer_targetHeightAboveGround_feature", "_UI_LineOfSightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
				 null));
	}

	/**
	 * This adds a property descriptor for the Use Height Perpendicular To Ground feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUseHeightPerpendicularToGroundPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LineOfSightImageMapLayer_useHeightPerpendicularToGround_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LineOfSightImageMapLayer_useHeightPerpendicularToGround_feature", "_UI_LineOfSightImageMapLayer_type"),
				 SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_IMAGE_GENERATION_SETTINGSPropertyCategory"),
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
			childrenFeatures.add(SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE);
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
	 * This returns LineOfSightImageMapLayer.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LineOfSightImageMapLayer"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((LineOfSightImageMapLayer)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_LineOfSightImageMapLayer_type") : label;
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

		switch (notification.getFeatureID(LineOfSightImageMapLayer.class)) {
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_AVAILABLE_COLOR:
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__LINE_OF_SIGHT_NOT_AVAILABLE_COLOR:
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__TARGET_HEIGHT_ABOVE_GROUND:
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__USE_HEIGHT_PERPENDICULAR_TO_GROUND:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SymphonyEnvironmentPackage.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE:
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
				(SymphonyEnvironmentPackage.Literals.LINE_OF_SIGHT_IMAGE_MAP_LAYER__OBSERVER_POSE,
				 MathFactory.eINSTANCE.createMatrix4x4()));
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
